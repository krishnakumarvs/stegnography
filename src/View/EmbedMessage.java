/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import General.Configuration;
import db.Dbcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Jithinpv
 */
public class EmbedMessage extends javax.swing.JFrame {

    public static int process_id = 0;
    /**
     * Creates new form EmbedMessage
     */
    String masterFileName;

    public EmbedMessage() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadIcons();
        proceed_button.setEnabled(false);
        analyze_button.setEnabled(false);
        analyze_complete_label.setVisible(false);
        sucess_label.setVisible(false);
    }

    private void loadIcons() {
        Configuration.setIconOnLabel("msg.png", image_Label);
        Configuration.setIconOnLabel("sucess_icon.png", sucess_label);
        Configuration.setIconOnLabel("blue_back_ground.jpg", main_label);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        image_Label = new javax.swing.JLabel();
        analyze_button = new javax.swing.JButton();
        analyze_complete_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        image_name = new javax.swing.JLabel();
        proceed_button = new javax.swing.JButton();
        progress_bar = new javax.swing.JProgressBar();
        sucess_label = new javax.swing.JLabel();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Master file");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 67, 157, -1));

        jButton1.setText("choose file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 63, -1, -1));

        image_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(image_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 118, 194, 133));

        analyze_button.setText("Analyse master file");
        analyze_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyze_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(analyze_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 294, -1, -1));

        analyze_complete_label.setForeground(new java.awt.Color(255, 255, 255));
        analyze_complete_label.setText("Analyse Complete");
        getContentPane().add(analyze_complete_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 298, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Embed Message");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 19, -1, -1));

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 367, 94, -1));

        image_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        image_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(image_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 92, 300, 20));

        proceed_button.setText("PROCEED");
        proceed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(proceed_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 367, -1, -1));
        getContentPane().add(progress_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 335, 279, 21));

        sucess_label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sucess_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 288, 46, 36));
        getContentPane().add(main_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 380, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class progressThread extends Thread {

        public void run() {
            try {
                int value = 0;
                while (value <= 100) {
                    progress_bar.setValue(value);
                    value += 1;
                    Thread.sleep(10);
                }
                store_analyse_masterfile();
                proceed_button.setEnabled(true);
                analyze_complete_label.setVisible(true);
                sucess_label.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void analyze_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyze_buttonActionPerformed
        // TODO add your handling code here:
        new progressThread().start();


    }//GEN-LAST:event_analyze_buttonActionPerformed

    public void store_analyse_masterfile() {
        Dbcon dbcon = new Dbcon();
        String sql = "update tbl_encryption_log set analyze_started_time='" + System.currentTimeMillis() + "' where process_id='" + EmbedMessage.process_id + "'";
        System.out.println(sql);
        dbcon.update(sql);

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");

        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getPath();

            try {
                String masterKeyBackUpName = System.currentTimeMillis() + "." + FilenameUtils.getExtension(chooser.getSelectedFile().getPath());
                String masterKeyBackUpLocation = Configuration.masterPoolLocation + masterKeyBackUpName;
                masterFileName = masterKeyBackUpName;
                FileUtils.copyFile(chooser.getSelectedFile(), new File(masterKeyBackUpLocation));

                image_name.setText(chooser.getSelectedFile().getName());
                System.out.println("You chose to open this file: "
                        + path);
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(path));
                    Image scaledInstance = img.getScaledInstance(image_Label.getWidth(), image_Label.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon imageIcon = new ImageIcon(scaledInstance);
                    image_Label.setIcon(imageIcon);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                long size = (chooser.getSelectedFile().length()) / 1024;

                Dbcon dbcon = new Dbcon();
                int ins = dbcon.insert("insert into tbl_encryption_log(user_id,master_file,master_file_size)values('" + Login.logged_in_user_id + "','" + masterKeyBackUpName + "','" + size + "')");
                if (ins > 0) {
                    ResultSet rs = dbcon.select("select max(process_id)  from tbl_encryption_log");
                    try {
                        if (rs.next()) {
                            System.out.println(rs.getString(1));
                            EmbedMessage.process_id = Integer.parseInt(rs.getString(1));
                            System.out.println(EmbedMessage.process_id);
                            analyze_button.setEnabled(true);
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proceed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MessageEncryption messageEncryption = new MessageEncryption(masterFileName);
        messageEncryption.setVisible(true);
    }//GEN-LAST:event_proceed_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(EmbedMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmbedMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmbedMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmbedMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new EmbedMessage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyze_button;
    private javax.swing.JLabel analyze_complete_label;
    private javax.swing.JLabel image_Label;
    private javax.swing.JLabel image_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel main_label;
    private javax.swing.JButton proceed_button;
    private javax.swing.JProgressBar progress_bar;
    private javax.swing.JLabel sucess_label;
    // End of variables declaration//GEN-END:variables
}
