/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorg
 */
public class deleteObject {
    
    public boolean deleteUser(String username) {
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a user to delete.");
            return false;
        }
        
        int dialogResult = JOptionPane.showOptionDialog(null, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new String[] {"Yes", "No"}, "No");
        if (dialogResult != JOptionPane.YES_OPTION) {
            return false;
        }


        // Declare necessary variables for database connection and query
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Establish a database connection using the cConnect class
            conn = new cConnect().establishConnection();

            // Prepare the delete query
            String query = "DELETE FROM users WHERE username = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);

            // Execute the query and get the number of rows affected
            int numRows = stmt.executeUpdate();

            if (numRows > 0) {
                JOptionPane.showMessageDialog(null, "User " + username + " has been deleted successfully.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete user " + username + ".");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error deleting user: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                // Ignore exceptions while closing resources
            }
        }
    }

}
