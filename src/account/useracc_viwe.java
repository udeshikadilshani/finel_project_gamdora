/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.TbView;
import common.db;
import finel_project_gamdora.main_menu;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udesh
 */
public class useracc_viwe extends javax.swing.JFrame {

    /**
     * Creates new form useracc_viwe
     */
    public useracc_viwe() {
        initComponents();
         screensize() ;
         TbView.tableSettings(jTable1);
         Loadmember();
    }
 private void screensize() {
      
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        btndash1 = new javax.swing.JButton();
        btndash3 = new javax.swing.JButton();
        btndash2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btndash = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 11, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        btndash1.setBackground(new java.awt.Color(0, 0, 51));
        btndash1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndash1.setForeground(new java.awt.Color(255, 255, 255));
        btndash1.setText("Change User Password");
        btndash1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndash1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndash1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndash1MouseExited(evt);
            }
        });
        btndash1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndash1ActionPerformed(evt);
            }
        });
        getContentPane().add(btndash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 30));

        btndash3.setBackground(new java.awt.Color(0, 0, 51));
        btndash3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndash3.setForeground(new java.awt.Color(255, 255, 255));
        btndash3.setText("Remove User Status");
        btndash3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndash3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndash3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndash3MouseExited(evt);
            }
        });
        btndash3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndash3ActionPerformed(evt);
            }
        });
        getContentPane().add(btndash3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 30));

        btndash2.setBackground(new java.awt.Color(0, 0, 51));
        btndash2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndash2.setForeground(new java.awt.Color(255, 255, 255));
        btndash2.setText(" Creat Account");
        btndash2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndash2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndash2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndash2MouseExited(evt);
            }
        });
        btndash2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndash2ActionPerformed(evt);
            }
        });
        getContentPane().add(btndash2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 30));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        btndash.setBackground(new java.awt.Color(0, 0, 51));
        btndash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndash.setForeground(new java.awt.Color(255, 255, 255));
        btndash.setText(" DashBoard");
        btndash.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndashMouseExited(evt);
            }
        });
        btndash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashActionPerformed(evt);
            }
        });
        getContentPane().add(btndash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1220));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" User Account Viwe");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 1050, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("setting");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 70, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_id", "Account Type", "User Name", "register_date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 1050, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseEntered
        btndash.setBackground(Color.BLUE);
    }//GEN-LAST:event_btndashMouseEntered

    private void btndashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseExited
        btndash.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btndashMouseExited

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        new main_menu().setVisible(true);
    }//GEN-LAST:event_btndashActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void btndash1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash1MouseEntered

    private void btndash1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash1MouseExited

    private void btndash1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndash1ActionPerformed
       new User_Password().setVisible(true);
    }//GEN-LAST:event_btndash1ActionPerformed

    private void btndash2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash2MouseEntered

    private void btndash2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash2MouseExited

    private void btndash2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndash2ActionPerformed
          new user_acc().setVisible(true);
    }//GEN-LAST:event_btndash2ActionPerformed

    private void btndash3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash3MouseEntered

    private void btndash3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndash3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btndash3MouseExited

    private void btndash3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndash3ActionPerformed
       new User_Password1().setVisible(true);
    }//GEN-LAST:event_btndash3ActionPerformed

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
                new useracc_viwe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndash;
    private javax.swing.JButton btndash1;
    private javax.swing.JButton btndash2;
    private javax.swing.JButton btndash3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void Loadmember() {
        try {
            ResultSet rs = db.serch("select * from user_account where stat =1");
            DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
             while(rs.next()){
         Vector v =new Vector ();
        v.add(rs.getString("employee_id"));
         v.add(rs.getString("acc_type"));
          v.add(rs.getString("user_name"));
        
          v.add(rs.getString("register_date"));
            dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}