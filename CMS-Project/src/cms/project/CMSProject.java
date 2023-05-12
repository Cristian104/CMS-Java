/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cms.project;


/**
 *
 * @author Jorg
 */

public class CMSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a new instance of the login screen
    loginScreen screen = new loginScreen();
    
    // center the new frame on the parent frame
    screen.setLocationRelativeTo(null);
    
    // Display the login screen
    screen.setVisible(true);
    }
    
}
