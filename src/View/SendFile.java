/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Email.MailSender;
import General.Configuration;
import General.ProgressBar;
import db.Dbcon;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jithinpv
 */
public class SendFile extends javax.swing.JFrame {

    /**
     * Creates new form SendFile
     */
    public SendFile() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadIcons();
    }
    File outputCipherFile;

    public SendFile(File outputCipherFile) {
        initComponents();
        receiver_name.setEditable(false);
        this.outputCipherFile = outputCipherFile;
        this.setLocationRelativeTo(null);
        loadIcons();
        loadThumbnail();
        loadRecepients();
    }

    private void loadRecepients() {
        try {
            ResultSet rs = new Dbcon().select("select email_id from tbl_user_details ");
            while (rs.next()) {
                receiver_email.addItem(rs.getString("email_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadIcons() {
        Configuration.setIconOnLabel("msg.png", jLabel1);
        Configuration.setIconOnLabel("sucess_icon.png", sucess_label);
        Configuration.setIconOnLabel("blue_back_ground.jpg", main_label);
    }

    private void loadThumbnail() {
        Configuration.setIconOnLabelFromFile(outputCipherFile, jLabel1);
        file_name_label.setText(outputCipherFile.getName());
        size_label.setText("Size " + (outputCipherFile.length() / 1024) + " kb");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress_bar = new javax.swing.JProgressBar();
        receiver_email = new javax.swing.JComboBox();
        receiver_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        size_label = new javax.swing.JLabel();
        file_name_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sucess_label = new javax.swing.JLabel();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(progress_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, 462, -1));

        receiver_email.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                receiver_emailItemStateChanged(evt);
            }
        });
        getContentPane().add(receiver_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 251, 252, -1));
        getContentPane().add(receiver_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 282, 252, -1));

        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 313, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Reciever Email id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 253, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Reciever Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 284, 159, -1));

        size_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        size_label.setForeground(new java.awt.Color(255, 255, 255));
        size_label.setText("Size");
        getContentPane().add(size_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 225, 76, -1));

        file_name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        file_name_label.setForeground(new java.awt.Color(255, 255, 255));
        file_name_label.setText("Name");
        getContentPane().add(file_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 198, 291, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Message Encrypted Successfully ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 165, 252, -1));

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 33, 184, 147));

        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 313, -1, -1));
        getContentPane().add(sucess_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 32, 192, 127));
        getContentPane().add(main_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 500, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void receiver_emailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_receiver_emailItemStateChanged

    try {
        ResultSet rs = new Dbcon().select("select * from tbl_user_details where email_id='" + receiver_email.getSelectedItem().toString().trim() + "'");
        if (rs.next()) {
            receiver_name.setText(rs.getString("first_name") + " " + rs.getString("last_name"));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Could not fetch details for particular email");
            receiver_name.setEditable(true);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    // TODO add your handling code here:
}//GEN-LAST:event_receiver_emailItemStateChanged

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    String receiverName = receiver_name.getText();
    String receiverMail = receiver_email.getSelectedItem().toString().trim();
    if (receiverName.equals("")) {
        JOptionPane.showMessageDialog(rootPane, "Enter receiver name");
    } else if (receiverMail.equals("")) {
        JOptionPane.showMessageDialog(rootPane, "Enter receiver email id");
    } else {
        Dbcon dbcon = new Dbcon();
        ResultSet rs = dbcon.select("select * from tbl_user_details where email_id='" + receiverMail + "'");
        try {
            if (rs.next()) {
                String receiver_id = rs.getString(1);
                String[] recepients = {receiverMail};
                ProgressBar progressBarThread = new ProgressBar();
                progressBarThread.init_progress(progress_bar);
                Thread thread = new Thread(progressBarThread);
                thread.start();

                MailSender.sendFromGMail(recepients, Configuration.sendImageSubject + " " + System.currentTimeMillis(), "Data from particular user", outputCipherFile.getPath());
                progressBarThread.complete = true;
                int ins = dbcon.insert("insert into tbl_transfer_log (sender_id, receiver_id, transfer_date, password,encrpypted_data,cipher_file) values (" + Login.logged_in_user_id + " , " + receiver_id + " , '" + System.currentTimeMillis() + "' , '" + MessageEncryption.encryption_password + "',1,'" + outputCipherFile.getName() + "')");
                System.out.println("Insert transfer log table status " + ins);
//                dbcon.update("update tbl_transfer_log set sender_id='" + Login.logged_in_user_id + "',receiver_id='" + receiver_id + "',transfer_date='" + System.currentTimeMillis() + "',is_send=1 where password='" + MessageEncryption.encryption_password + "'");
                JOptionPane.showMessageDialog(rootPane, "success");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
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
            java.util.logging.Logger.getLogger(SendFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SendFile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel file_name_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel main_label;
    private javax.swing.JProgressBar progress_bar;
    private javax.swing.JComboBox receiver_email;
    private javax.swing.JTextField receiver_name;
    private javax.swing.JLabel size_label;
    private javax.swing.JLabel sucess_label;
    // End of variables declaration//GEN-END:variables
}
