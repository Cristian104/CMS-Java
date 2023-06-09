/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cms.project;

import classes.cConnect;
import classes.editModeFields;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Jorg
 */
public class editObject extends javax.swing.JFrame {
    
    private mainScreenManager parentFrame;
    private String selectedUsername;

    /**
     * Creates new form editObject
     */
    
    public editObject(String selectedUsername) {
        // Remove the title bar and window decorations
        setUndecorated(true);
        
        initComponents();

        this.selectedUsername = selectedUsername;

        // Create an instance of the editModeFields class
        editModeFields editFields = new editModeFields();
        // Call the setFields() method on this instance, passing in the selected user and text fields
        editFields.setFields(selectedUsername, usernameTxt, passwordTxt, roleTxt, jobroleTxt, emailTxt);

    }
    
    /**
     * Sets the parent frame of this window
     * @param parentFrame the parent frame
     */
    public void setParentFrame(mainScreenManager parentFrame) {
        this.parentFrame = parentFrame;
    }
    
    /**
     * Sets the username that is being edited
     * @param selectedUsername the username to edit
     */
    public void setSelectedUsername(String selectedUsername) {
        this.selectedUsername = selectedUsername;
    }
    
     private void setFields() {
        editModeFields editFields = new editModeFields();
        editFields.setFields(selectedUsername, usernameTxt, passwordTxt, roleTxt, jobroleTxt, emailTxt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        roleTxt = new javax.swing.JTextField();
        jobroleTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT MODE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Username:");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 30));

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        mainPanel.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Password:");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 30));

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        mainPanel.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Role:");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 30));

        roleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleTxtActionPerformed(evt);
            }
        });
        mainPanel.add(roleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, -1));

        jobroleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobroleTxtActionPerformed(evt);
            }
        });
        mainPanel.add(jobroleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 170, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Job Role:");
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, 30));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        mainPanel.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 170, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Email:");
        mainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 70, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 10, 220));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        mainPanel.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        confirmBtn.setBackground(new java.awt.Color(51, 204, 0));
        confirmBtn.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Save");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        mainPanel.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void roleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleTxtActionPerformed

    private void jobroleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobroleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobroleTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        // Create a connection to the database
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
        conn = new cConnect().establishConnection();
        String query = "UPDATE users SET username=?, password=?, role=?, jobrole=?, email=? WHERE username=?";
        stmt = conn.prepareStatement(query);
        
        // Set the parameters in the prepared statement
        stmt.setString(1, "username");
        stmt.setString(2, "password");
        stmt.setString(3, "role");
        stmt.setString(4, "jobrole");
        stmt.setString(5, "email");
        stmt.setString(6, selectedUsername);
        
        // Execute the update statement
        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User data updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "User data update failed.");
        }
        
        // Close the database resources
        stmt.close();
        conn.close();
        
        // Close this window
        this.dispose();
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            // Ignore exceptions while closing resources
        }
    }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        // Close the editObject frame
        this.dispose();

    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jobroleTxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField roleTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
