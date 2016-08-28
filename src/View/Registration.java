/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import General.Configuration;
import db.Dbcon;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jithinpv
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        this.setLocationRelativeTo(null);
        Configuration.setIconOnLabel("blue_background_calm.jpg", main_label);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JPasswordField();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 119, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date of Birth");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 70, 169, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 167, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 206, 89, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 252, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 287, 140, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 287, 169, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 244, 169, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 206, 169, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 334, 170, -1));

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 369, -1, -1));

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 369, 77, -1));
        getContentPane().add(jXDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 139, 169, -1));

        genderGroup.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 86, -1));

        genderGroup.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 81, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 21, 142, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 108, 119, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 108, 169, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 170, 30));
        getContentPane().add(main_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 500, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String firstname = jTextField2.getText();
        String lastname = jTextField3.getText();
        Date selectedDate = jXDatePicker2.getDate();
//        String millisecond = selectedDate.getTime() + "";
        String gender_male = jRadioButton1.getText();
        String gender_female = jRadioButton2.getText();
        String email = jTextField6.getText();
        String phonenumber = jTextField5.getText();
        String username = jTextField4.getText();
        String password = jTextField7.getText();
        if (firstname.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter your first name");
        } else if (lastname.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter your last name");
        } else if (selectedDate == null) {

            JOptionPane.showMessageDialog(rootPane, "Enter the date");
        } else if (email.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter the email");
        } else if (phonenumber.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter the phone number");
        } else if (username.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter the username");
        } else if (password.equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Enter the password");
        } else {
            Dbcon dbcon = new Dbcon();
            int ins = dbcon.insert("insert into tbl_user_details(user_name,first_name,last_name,gender,date_of_birth,email_id,phone_number,password,created_at,last_updated_at)values('" + username + "','" + firstname + "','" + lastname + "','" + gender_male + "','" + selectedDate + "','" + email + "','" + phonenumber + "','" + password + "','" + System.currentTimeMillis() + "','" + System.currentTimeMillis() + "')");
            if (ins > 0) {
                this.dispose();
                Login login = new Login();
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "try again");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField3.setText("");
        //jXDatePicker2.setTimeZone(null);
        //jRadioButton1.setText("");
        // jRadioButton2.setText("");
        jTextField6.setText("");
        jTextField5.setText("");
        jTextField4.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPasswordField jTextField7;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JLabel main_label;
    // End of variables declaration//GEN-END:variables
}
