/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CW
 */
public class DatabaseConnection {
    Connection conn;
    Statement statement;
    public void connection()  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatdatabase", "root", "");
            statement = conn.createStatement();
            //conn.close();
        } catch (Exception ex) {
            System.out.println("this is the second line that causes the problem");
            Logger.getLogger(UserService.DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
