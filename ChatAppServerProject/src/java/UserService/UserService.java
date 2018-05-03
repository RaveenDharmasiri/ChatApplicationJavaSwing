
package UserService;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebService(serviceName = "UserService")
public class UserService {
    
    DatabaseConnection dbObj = new DatabaseConnection();

    /**
     * This is service is check the loginId and the password of the user. Check whether they are equal
     */
    @WebMethod(operationName = "loginOperation")
    public boolean loginOperation(@WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
        
        boolean loginStatus = false;
        
        dbObj.connection();
        
        try {
            ResultSet query = dbObj.statement.executeQuery("SELECT * FROM chatuser");
            while (query.next()) {
                String userLoginId = query.getString("loginId");
                String userPassword = query.getString("password");
                if (userLoginId.equals(loginId) && userPassword.equals(password)) {
                    loginStatus = true;
                    break;
                }else{
                    loginStatus = false;
                }
            }
            
        } catch (SQLException ex) {
            loginStatus = false;
        }
        
        

        return loginStatus;

    }
    
    /**
     * This web service is to register the user to the database
     */
    @WebMethod(operationName = "registrationOperation")
    public String registrationOperation(@WebParam(name = "nickName") String nickName, @WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
        
        String registerStatus = null;
        
        dbObj.connection();
        try {
            dbObj.statement.executeUpdate("INSERT INTO chatuser VALUES('" + loginId + "','" + nickName + "','"+ password+"')");
            registerStatus = "Successful";
            
        } catch (SQLException ex) {
            registerStatus=""+ex.getErrorCode();
        }
        
        
        return registerStatus;
    }
    
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendNickName")
    public String sendNickName(@WebParam(name = "loginId") String loginId) {
        
        String nickName = "";
        dbObj.connection();
        
        try {
            ResultSet query = dbObj.statement.executeQuery("SELECT nickName FROM chatuser WHERE loginId = '"+loginId+"'");
            while (query.next()) {
                nickName = query.getString("nickName");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nickName;
    }
}
