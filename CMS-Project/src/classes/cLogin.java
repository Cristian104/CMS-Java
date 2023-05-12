/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import cms.project.loginScreen;
import cms.project.mainScreenUsers;
import cms.project.mainScreenManager;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Jorg
 */
public class cLogin {
     public void userValidation(JTextField username, JPasswordField password){
         try{
             
             // Declare necessary variables for database connection and query
             ResultSet rs = null;
             PreparedStatement ps = null;
             
             classes.cConnect objectConnection = new classes.cConnect();
             
             // Prepare the SQL query to check if the entered credentials match any user in the database
             String consult = "select * from users where users.username = (?) and users.password = (?);";
             ps = objectConnection.establishConnection().prepareStatement(consult);
             
             // Get the entered password as a string to use in the SQL query
             String psw = String.valueOf(password.getPassword());
             
             // Set the parameters of the SQL query with the entered username and password
             ps.setString(1, username.getText());
             ps.setString(2, psw);
             
             // Execute the SQL query
             rs = ps.executeQuery();
             
             // Check if a user was found with the entered credentials
             if(rs.next()){
                 
                 // Get the role of the user from the database
                 String role = rs.getString("role");

                 // Show a message indicating that the user was found and their role
                 JOptionPane.showMessageDialog(null, "User is correct with role: " + role);
                 
                // Retrieve the user's information from the database
                String userQuery = "SELECT email, jobrole FROM users WHERE username = ?";
                ps = objectConnection.establishConnection().prepareStatement(userQuery);
                ps.setString(1, username.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    String email = rs.getString("email");
                    String jobRole = rs.getString("jobrole");
                    cUser user = new cUser(username.getText(), email, jobRole, password.getText());

                    // Open the appropriate main screen based on the user's role
                    if (role.equals("manager")) {
                        mainScreenManager objectManagerMain = new mainScreenManager(user);
                        // center the new frame on the parent frame
                        objectManagerMain.setLocationRelativeTo(null);
                        objectManagerMain.setVisible(true);
                    } else if (role.equals("user")) {
                        mainScreenUsers objectUserMain = new mainScreenUsers(user);
                        // center the new frame on the parent frame
                        objectUserMain.setLocationRelativeTo(null);
                        objectUserMain.setVisible(true);
                    }
                }
                // Close the result set, prepared statement, and connection
                rs.close();
                ps.close();
                objectConnection.closeConnection();
                 
             
                 
                 // close the login screen
                 ((loginScreen) SwingUtilities.getWindowAncestor(username)).dispose();
                 
             } else {JOptionPane.showMessageDialog(null, "User is incorrect");}
             
         } catch(Exception e){
             JOptionPane.showMessageDialog(null, "ERROR:" + e.toString());
         }
     }
}
