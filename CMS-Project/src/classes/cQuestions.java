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
public class cQuestions {
    
//    public String[] getSurveyQuestions() {
//        String[] questions = null;
//        
//        try {
//        // Establish a database connection using the cConnect class
//        Connection conn = new cConnect().establishConnection();
//        
//        // Prepare the select query
//        String query = "SELECT question_text FROM survey_questions";
//        PreparedStatement stmt = conn.prepareStatement(query);
//        
//        // Execute the query and get the result set
//        ResultSet rs = stmt.executeQuery();
//        
//        // Count the number of rows in the result set
//        int rowCount = 0;
//        while (rs.next()) {
//            rowCount++;
//        }
//        
//        // Reset the cursor position
//        rs.beforeFirst();
//        
//        // Initialize the array to store the questions
//        questions = new String[rowCount];
//        
//        // Retrieve the questions from the result set and store them in the array
//        int i = 0;
//        while (rs.next()) {
//            questions[i] = rs.getString("question_text");
//            i++;
//        }
//        
//        // Close the result set, statement, and connection
//        rs.close();
//        stmt.close();
//        conn.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    
//    return questions;
//    }
//    
//    private int getRowCount(ResultSet resultSet) {
//        try {
//            resultSet.last();
//            return resultSet.getRow();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
    
    public String[] getSurveyQuestions() {
    String[] questions = {
        "How do you rate your overall job performance?",
        "On a scale of 1-10, how well do you handle tight deadlines?",
        "How comfortable are you in adapting to new technologies and tools?",
        "Rate your ability to effectively communicate and collaborate with team members.",
        "How do you assess your problem-solving skills in complex situations?",
        "On a scale of 1-10, how well do you manage your time and prioritize tasks?",
        "How do you evaluate your ability to work under pressure?",
        "Rate your proficiency in analyzing data and making data-driven decisions.",
        "How would you assess your ability to handle and resolve conflicts within a team?",
        "On a scale of 1-10, how well do you adapt to changes in the workplace?"
    };
    
    return questions;
}
    
    public int getUserId(String username) {
    int userId = 0;
    try {
        // Establish a database connection using the cConnect class
        Connection conn = new cConnect().establishConnection();

        // Prepare the select query
        String query = "SELECT user_id FROM users WHERE username = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, username);

        // Execute the query and get the result set
        ResultSet rs = stmt.executeQuery();

        // Check if the result set has a row
        if (rs.next()) {
            userId = rs.getInt("user_id");
        }

        // Close the result set, statement, and connection
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return userId;
}
    
    public void saveSurveyAnswers(String[] answers, String username) {
    // Get the user ID
    int userId = getUserId(username);

    try {
        // Establish a database connection using the cConnect class
        Connection conn = new cConnect().establishConnection();

        // Prepare the insert query
        String query = "INSERT INTO survey_answers (user_id, answer) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);

        // Iterate over the answers array and save each answer along with the user ID
        for (String answer : answers) {
            stmt.setInt(1, userId);
            stmt.setString(2, answer);
            stmt.executeUpdate();
        }

        // Close the statement and connection
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}


}
