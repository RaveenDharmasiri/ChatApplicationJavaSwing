
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CW
 */
public class User {
    private String nickName;
    private String emailAddress;
    private String loginId;
    private String password;
    private Socket userSocket;
    
    
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    
    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setEmail(String email){
        this.emailAddress = email;
    }
    
    public void setUserSocket(Socket userSocket){
        this.userSocket = userSocket;
    }
    
    public String getNickName(){
        return this.nickName;
    }
    
    public String getLoginId(){
        return this.loginId;
    }
    
    public String getEmailAddress(){
        return this.emailAddress;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public Socket getUserSocket(){
        return this.userSocket;
    }
 
}
