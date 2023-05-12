/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Jorg
 */
public class editModeFields {
    public void setFields(String selectedUser, JTextField usernameLabel, JTextField passwordLabel, JTextField roleLabel, JTextField jobRoleLabel, JTextField emailLabel) {
        
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        // Establish a database connection using the cConnect class
        conn = new cConnect().establishConnection();

        // Prepare the select query
        String query = "SELECT * FROM users WHERE username = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, selectedUser);

        // Execute the query and get the result set
        rs = stmt.executeQuery();

        // Check if the result set contains any rows
        if (rs.next()) {
            // Set the text of the various JLabels to the corresponding values in the result set
            usernameLabel.setText(rs.getString("username"));
            passwordLabel.setText(rs.getString("password"));
            roleLabel.setText(rs.getString("role"));
            jobRoleLabel.setText(rs.getString("jobrole"));
            emailLabel.setText(rs.getString("email"));
        }
    } catch (Exception e) {
        // Handle any exceptions that occur during the database query
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            // Ignore exceptions while closing resources
        }
    }
    }
    
    
}

    
    

