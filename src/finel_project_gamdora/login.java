/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finel_project_gamdora;

import common.MD5;
import common.db;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.SystemData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;   

/**
 *
 * @author udesh
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        jProgressBar1.setVisible(false);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpw = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        txtun = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        getContentPane().add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 180, 220, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 120, 30));

        msg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 20));

        jProgressBar1.setForeground(new java.awt.Color(0, 0, 51));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 390, 20));

        txtun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunActionPerformed(evt);
            }
        });
        getContentPane().add(txtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 220, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 450, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" Password");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" User Name");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\udesh\\Pictures\\aper-cut-luxury-gold-background-with-dark-metal-texture-3d-abstract-style_206725-43.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      singin() ;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunActionPerformed
       txtpw.grabFocus();
    }//GEN-LAST:event_txtunActionPerformed

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
        singin() ;
    }//GEN-LAST:event_txtpwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
          UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables

    private void singin() {
        try {
            String userName = txtun.getText();
            String password = new String(txtpw.getPassword());
          System.out.println(MD5.getMd5(password));
            String sql ="select * from user_account where user_name=? and password=?";
            Connection con = db.getNewConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, MD5.getMd5(password));
             ResultSet serch=ps.executeQuery();
            if(serch.next()){
            boolean isActive = serch.getBoolean("stat");
            if(isActive){
           SystemData.setCurrentUser(userName);
           SystemData.setEmployee(serch.getString("employee_id"));
           SystemData.setAccId(serch.getString("acc_type"));
           
          loadingProgressBar();
        
            }else{
                JOptionPane.showMessageDialog(this, "This user inActive");
                clear();
            }
            }else{
             JOptionPane.showMessageDialog(this, "Invalid user name or password");
             clear();
            }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Check Your User Name And Password");
           e.printStackTrace();
        }      
      
    }

    private void loadingProgressBar() {
        jProgressBar1.setVisible(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
        for (int i = 0; i <= 100; i++) {
            jProgressBar1.setValue(i);
            if(i==5){
            msg.setText("Database Chexking...!");
          
            }
            if(i>=20 && i<= 30){
            msg.setText("DB Connected");
            Thread.sleep(100);
            continue;
            }
            if(i==100){
            new main_menu().setVisible(true);
            dispose();
            }
            Thread.sleep(20);
        }
                } catch(Exception e){}
            }
        });
       t.start();
    
    }

    private void clear() {
        txtun.setText(null);
           txtpw.setText(null);
           txtun.grabFocus();
    }
}