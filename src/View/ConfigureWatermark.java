/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import General.Configuration;
import General.Nimbus;
import db.Dbcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jithinpv
 */
public class ConfigureWatermark extends javax.swing.JFrame {

    /**
     * Creates new form ConfigureWatermark
     */
    public ConfigureWatermark() {
        Nimbus.loadLoogAndFeel();
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Title");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 49, 120, 25));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 46, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Font size");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 171, 114, 25));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 168, 170, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pink", "white", "orange", "cyan", "magenta", "gray", "yellow", "black", "green", "red", "blue" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 228, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Font Color");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 231, 114, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Opacity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 350, 114, 25));
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 350, 170, 25));

        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 381, -1, 25));

        jLabel6.setText("100");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 381, -1, 25));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 412, 83, 25));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 412, 81, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Font Family ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 292, 110, 25));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 106, 170, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Template Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 109, 130, 25));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TimesRoman", "Helvetica", "Courier", "Dialog", "ZapfDingbats" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 289, 170, 30));
        getContentPane().add(main_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 520, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String title = jTextField1.getText();
        String template = jTextField2.getText();
        String size = jComboBox1.getSelectedItem().toString();
        String color = jComboBox2.getSelectedItem().toString();
        String family = jComboBox3.getSelectedItem().toString();
        int opacity = jSlider1.getValue();

        if (title.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter title");
        } else if (template.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter template name");
        } else {
            Dbcon dbcon = new Dbcon();
            int ins = dbcon.insert("insert into tbl_water_mark_config(template_name,title,font_family,font_size,font_color,opacity,user_id)values('" + template + "','" + title + "','" + family + "','" + size + "','" + color + "','" + opacity + "','"+Login.logged_in_user_id+"')");
            if (ins > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sucessfully added template : " + template);
                ViewWaterMark viewWaterMark = new ViewWaterMark();
                viewWaterMark.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Internal error, please try again after some time");
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearAll() {
    }

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
            java.util.logging.Logger.getLogger(ConfigureWatermark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigureWatermark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigureWatermark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigureWatermark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConfigureWatermark().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel main_label;
    // End of variables declaration//GEN-END:variables
}
