
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Raveen Promodya Dharmasiri
 * IIT No : 2015178
 * UOW No : 1628049
 */
public class MockUpServer {
    
    Socket receiverSocket;

    UserManagementApplication appObj = new UserManagementApplication();

    // this is the local registration
    public void requestToAddTheUser(String nickName, String loginId, String password, String email, Socket userSocket) {
        appObj.addUserInformation(nickName, loginId, password, email, userSocket);
    }

    public boolean requestToLogin(String email, String password) {
        return appObj.loginAction(email, password);
    }
    
    

    // this code is for the client. this code is used to send the user information  
    public void requestToAddTheUserRemote(String nickName, String loginId, String password, String email) {
        
        try {
            String myDataPacket = nickName + "-" + loginId + "-" + password + "-" + email;
            String modifiedSentence;
            Socket clientSocket = new Socket("112.134.77.35", 6789);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
//          
            outToServer.writeBytes(myDataPacket);
            modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence); 
            clientSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // this is how we are going to get the information from the another computer. 
    
    //this is code is for the client. 
    public void requestToLoginUserRemote(String email, String password){
        try {
            String myDataPacket = email+"-"+password;
            String modifiedSentence;
            Socket clientSocket = new Socket("192.168.1.2", 8789);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
//          
            outToServer.writeBytes(myDataPacket);
            modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence); 
            clientSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // this code is for the server
    public void listenForRegistration(String ipaddress) throws IOException {
        
        String clientSentence;
        String capitalizedSentence;
        
        
        while(true){
            ServerSocket welcomeSocket = new ServerSocket(8789, 1, InetAddress.getByName(ipaddress));
            // we are creating a client socket. 
            Socket connectionSocket = welcomeSocket.accept();
            
            //System.out.println("connected");
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            String[] regInfo = clientSentence.split("-");
            this.requestToAddTheUser(regInfo[0], regInfo[1], regInfo[2], regInfo[3], connectionSocket);
            String messageToClient = "You have been successfully registered";
            capitalizedSentence = messageToClient.toUpperCase() + '\n';
            // 
            outToClient.writeBytes(capitalizedSentence);
        }
        
    }
    
    // this code is for the server. the server is going to wait until the user login and then check their information against the server and see if his or her information is available in
    // the database. 
    public void listenForLoginInformation(String ipaddress) throws IOException{
        
        // this clientSentence is used to store the email and the password of the user. 
        String clientLoginInformation;
        String messageToClient;
        String capitalizedSentence;
        
        int userCount = 1;
       
       while (userCount<=2) {
            
            ServerSocket welcomeSocket = new ServerSocket(8789, 1, InetAddress.getByName(ipaddress));
            Socket connectionSocket = welcomeSocket.accept();
            
            //System.out.println("connected");
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            clientLoginInformation = inFromClient.readLine();
            String[] logInfo = clientLoginInformation.split("-");
            
            if(this.requestToLogin(logInfo[0], logInfo[1])){
                messageToClient = "You have been successfully logged ";
                capitalizedSentence = messageToClient.toUpperCase() + '\n';
                outToClient.writeBytes(capitalizedSentence);
            }else{
                messageToClient = "You cannot Login, Please check your email or password!";
                capitalizedSentence = messageToClient.toUpperCase() + '\n';
                outToClient.writeBytes(capitalizedSentence);
            }
            
            userCount++;
        }
    }
    
    
    
    
    
    // from here the code is how to send message between two users. 
    
}
