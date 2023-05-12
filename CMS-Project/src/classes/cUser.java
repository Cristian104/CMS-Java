/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cUser {
    
    public String username;
    private String email;
    private String jobRole;
    private String password;

    
    public cUser(String username, String email1, String jobRole1, String password) {
        try {
            // Declare necessary variables for database connection and query
            ResultSet rs = null;
            PreparedStatement ps = null;
            classes.cConnect objectConnection = new classes.cConnect();
            
            // Prepare the query statement
            String query = "SELECT username, email, jobrole, password FROM users WHERE username = ?";
            ps = objectConnection.establishConnection().prepareStatement(query);
            ps.setString(1, username);
            
            // Execute the query and get the result set
            rs = ps.executeQuery();
            
            // Set the properties of the cUser object with the user's information
            if (rs.next()) {
                this.username = rs.getString("username");
                this.email = rs.getString("email");
                this.jobRole = rs.getString("jobrole");
                this.password = rs.getString("password");

            }
            
            // Close the ResultSet, PreparedStatement, and Connection
            rs.close();
            ps.close();
            objectConnection.closeConnection();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR:" + e.toString());
        }
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getJobRole() {
        return jobRole;
    }
    
    public String getPassword() {
        return password;
    }
}
