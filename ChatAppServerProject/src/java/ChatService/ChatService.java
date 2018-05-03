
package ChatService;

import UserService.UserService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author CW
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    // creating an object of the DatabaseConnection class so that this object can be used to establish connection between the webservice and 
    // the database where the information is saved.
    DatabaseConnection dbObj = new DatabaseConnection();
    
    /**
     * The purpose of this web service operation is to add the thread
     * information into thread table in the chatdatabase. This method will enter
     * data such as the thread title, date when it was created and the user who
     * created it.
     */
    @WebMethod(operationName = "addThread")
    public boolean addThread(@WebParam(name = "title") String title, @WebParam(name = "creator") String nickName, @WebParam(name = "loginId") String loginId) {
        String threadCreatedDate = getDate();

        // invoking the connection() method from the DatabaseConnection class using the object reference from line 31.
        dbObj.connection();
        try {
            // executing the sql command of inserting data into the thread table.
            dbObj.statement.executeUpdate("INSERT INTO thread (title, userName, createdDate, loginId) VALUES ('" + title + "','" + nickName + "','" + threadCreatedDate + "','" + loginId + "')");
            dbObj.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }

        // returning the true boolean value when a thread record has been added into the database.
        return true;
    }

    /**
     * The purpose of this thread operation is to Select all the records that
     * are available in the thread table.
     *
     * @return
     */
    @WebMethod(operationName = "getThreads")
    public String getThreads() {

        // this variable is used to store all the threadRecords extract from the database as a string. 
        String threadRecords = "";
        dbObj.connection();

        try {
            // executing the sql command to extract all the record from the thread table.
            ResultSet query = dbObj.statement.executeQuery("SELECT * FROM thread");

            while (query.next()) {
                String record[] = new String[4];
                record[0] = new String(query.getString("threadId").toString());
                record[1] = new String(query.getString("title").toString());
                record[2] = new String(query.getString("createdDate").toString());
                record[3] = new String(query.getString("userName").toString());
                threadRecords = threadRecords + record[0] + ">" + record[1] + ">" + record[2] + ">" + record[3] + ";";
            }
            
            // closing the query
            query.close();
            dbObj.conn.close();
            // closing the connection that was established with the database. 
            dbObj.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return threadRecords;
    }

    /**
     * The purpose of this web service operation is to select all the messages
     * that belongs to a certain thread.
     *
     * Here the threadId variable represent the threadId of the thread in which
     * holds the messages. Which is also the threadId of the thread that was
     * selected by the user from the ThreadOptionPage.
     */
    @WebMethod(operationName = "getThreadMessages")
    public String getThreadMessages(@WebParam(name = "threadId") String threadId) {
        dbObj.connection();

        String messageRecords = "";

        try {

            // executing the sql command to select all records from the message table relative to a threadId. 
            ResultSet query = dbObj.statement.executeQuery("SELECT * FROM message WHERE threadId='" + threadId + "'");
            while (query.next()) {
                String[] messages = new String[3];
                messages[0] = query.getString("messageContain").toString();
                messages[1] = query.getString("editedDate").toString();
                messages[2] = query.getString("nickName");

                messageRecords = messageRecords + messages[0] + ">" + messages[1] + ">" + messages[2] + ";";
            }
            
            // closing the query and the cinnection that was established with the database.
            query.close();
            dbObj.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return messageRecords;
    }

    /**
     * The purpose of this web service operation is to add the message into the message table relative to the thread that it belong.
     * 
     * Here the threadId represents the thread that in which the message belong to.
     */
    @WebMethod(operationName = "addMessage")
    public void addMessage(@WebParam(name = "nickName") String nickName, @WebParam(name = "message") String message, @WebParam(name = "threadId") String threadId, @WebParam(name = "loginId") String loginId) {
        String editedDate = getDate();

        dbObj.connection();
        try {
            dbObj.statement.executeUpdate("INSERT INTO message (messageContain, editedDate, nickName, threadId, loginId) VALUES ('" + message + "','" + editedDate + "','" + nickName + "','" + threadId + "','" + loginId + "')");
            
            dbObj.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // the purpose of this method is extract the date and time from the computer according to the format (dd MMMM YYYY - hours:mins)
    private String getDate() {
        Date currentDate = new Date();
        String date = new SimpleDateFormat("dd MMMM yyyy").format(currentDate);
        GregorianCalendar cal = new GregorianCalendar();
        int hours = cal.get(Calendar.HOUR);
        int mins = cal.get(Calendar.MINUTE);
        
        String strMins;
        
        if(mins < 10){
            strMins = "0"+mins;
        }else{
            strMins = ""+mins;
        }
        
        String threadCreatedDate = date + " - " + hours + ":" + strMins;
        return threadCreatedDate;
    }

    /**
     * The purpose of this web service operation is to check if a new thread is added to the thread table. A boolean value is send to the client if a new thread
     * record is added to the database.
     */
    @WebMethod(operationName = "checkNewThread")
    public String checkNewThread(@WebParam(name = "latestThreadId") int latestThreadId) {

        dbObj.connection();
        
        boolean is_a_new_thread_added = false;
        
        try {
           ResultSet query = dbObj.statement.executeQuery("SELECT * FROM thread");
           
           while(query.next()){
               int threadId = Integer.parseInt(query.getString("threadId"));
               
               if(threadId > latestThreadId){
                   is_a_new_thread_added = true;
                   latestThreadId = threadId;
                   
               }else{
                   is_a_new_thread_added = false;
               }
           }

           query.close();
           dbObj.conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ChatService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return is_a_new_thread_added+"-"+latestThreadId;
    }

    /**
     * The purpose of this web service operation is to check if new messages have been added to a thread. If a new message is added it will send a boolean value
     * of true to let the client application know that a new message has been added to the message table in the database.
     */
    @WebMethod(operationName = "checkNewThreadMessages")
    public String checkNewThreadMessages(@WebParam(name = "threadId") String threadId, @WebParam(name = "latestMessageId") int latestMessageId) {
        
        // this is to establish the connection with the database.
        dbObj.connection();
        
        
        boolean is_a_new_message_added = false;
        
        try {
            // extracting all the messageId from the message table that belongs to a particular thread.
            ResultSet query = dbObj.statement.executeQuery("SELECT messageId FROM message WHERE threadId='" + threadId + "'");
            
            while(query.next()){
                int messageId = Integer.parseInt(query.getString("messageId"));
                
                // checking if the database messageId is greater than the latestThreadId also the messageId that was sent here from the client application.
                if(latestMessageId < messageId){
                    latestMessageId = messageId;
                    
                    /**
                     * if a new message is added this boolean variable is equal to true.
                     */
                     
                    is_a_new_message_added = true;
                }else{
                    // if a new message is not added this boolean variable is equal to false. 
                    is_a_new_message_added = false;
                }
            }
            
            query.close();
            dbObj.conn.close();
            
        } catch (SQLException ex) {
            //Logger.getLogger(ChatService.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        // returning the String value that holds both the boolean value and the latestMessageId that was checked from the database.
        return is_a_new_message_added+"-"+latestMessageId;
    }
}
