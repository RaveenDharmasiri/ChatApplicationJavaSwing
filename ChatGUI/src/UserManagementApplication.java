
import java.net.Socket;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class UserManagementApplication {
    
    private ArrayList<User> userLst = new ArrayList<User>();
    
    public void addUserInformation(String nickName, String loginId, String password, String email, Socket userSocket){
        User userObj = new User();
        userObj.setNickName(nickName);
        userObj.setLoginId(loginId);
        userObj.setPassword(password);
        userObj.setEmail(email);
        userObj.setUserSocket(userSocket);
        
        userLst.add(userObj);
        System.out.println("Information of the user just Registered");
        System.out.println("Nick Name : "+nickName+"\n"+"Login ID : "+ loginId+"\n"+"Password : "+password+"\n"+"Email : "+email);
    }
    
    public boolean loginAction(String emailAddress, String password){
        boolean availability = false;
        for(int i=0; i<userLst.size(); i++){
           if(emailAddress.equals(userLst.get(i).getEmailAddress())){
               if(password.equals(userLst.get(i).getPassword())){
                    System.out.println("Welcome to the application");
                    System.out.println("Opening the application");
                    //loginPageObj.setVisible(false);
                    //sendMessageObj.setVisible(true);
                    availability = true;
                    break;
                }
            }else{
                System.out.println("Please Enter right email and password. Or Register");
                availability = false;
            }
        }
        return availability;
    }
    
    public boolean receipientAvailability(String loginId){
        boolean availability = false;
        for(User userObj : userLst){
            if(userObj.getLoginId() == loginId){
                System.out.println("This receipient is available. Your message will be sent");
                availability = true;
            }else{
                System.out.println("There is no such receipient. Make sure that you entered the information right");
                availability =  false;
            }
        }
        return availability;
    }
    
    public void sendMessage(String loginId, String message){
        if(receipientAvailability(loginId)){
            
        }
    }
    
}
