/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorg
 */ 
public class cConnect {
    
    private Connection conn;

    Connection connect;
    
    String user = "root";
    String password = "17789I17789i.";
    String db = "cms";
    String ip = "localhost";
    String port = "3306";
    
    String connectionID = "jdbc:mysql://" + ip + ":" + port + "/" + db;
    
    public Connection establishConnection(){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connect = (Connection) DriverManager.getConnection(connectionID, user, password);
//            JOptionPane.showMessageDialog(null, "Connected to DB");

            
        }   catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problem during the connection" + e.toString());
        }
        return connect;
    }
    
    // Close database connection
    public void closeConnection() {
        try {
            if (connect != null) {
                connect.close();
                System.out.println("Database connection closed.");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problem during the connection" + e.toString());
        }
    }

        }
    
    

