/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grn;

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
public class GRN_viwe extends javax.swing.JFrame {

    /**
     * Creates new form GRN_viwe
     */
    public GRN_viwe() {
        initComponents();
        screensize();
          TbView.tableSettings(jTable1);
          viweitem();
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
        btnviwe = new javax.swing.JButton();
        btnup = new javax.swing.JButton();
        btndash = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 132, -1, -1));

        btnviwe.setBackground(new java.awt.Color(0, 0, 51));
        btnviwe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnviwe.setForeground(new java.awt.Color(255, 255, 255));
        btnviwe.setText(" Good Recive Note");
        btnviwe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnviwe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviweMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviweMouseExited(evt);
            }
        });
        btnviwe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviweActionPerformed(evt);
            }
        });
        getContentPane().add(btnviwe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 30));

        btnup.setBackground(new java.awt.Color(0, 0, 51));
        btnup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnup.setForeground(new java.awt.Color(255, 255, 255));
        btnup.setText("Upadate GRN");
        btnup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnupMouseExited(evt);
            }
        });
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });
        getContentPane().add(btnup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 30));

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
        getContentPane().add(btndash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("     View GRN");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1050, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1100));

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN Id", "Suplayer Name", "Total Amount", "Total Discount", "Create By"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 1050, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnviweMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviweMouseEntered
        btnviwe.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnviweMouseEntered

    private void btnviweMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviweMouseExited
        btnviwe.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnviweMouseExited

    private void btnviweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviweActionPerformed
           new add_item().setVisible(true);      
    }//GEN-LAST:event_btnviweActionPerformed

    private void btnupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupMouseEntered
        btnup.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnupMouseEntered

    private void btnupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupMouseExited
        btnup.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnupMouseExited

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        new add_item1().setVisible(true);
    }//GEN-LAST:event_btnupActionPerformed

    private void btndashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseEntered
        btndash.setBackground(Color.BLUE);
    }//GEN-LAST:event_btndashMouseEntered

    private void btndashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseExited
        btndash.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btndashMouseExited

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        new main_menu().setVisible(true);
    }//GEN-LAST:event_btndashActionPerformed

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
                new GRN_viwe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndash;
    private javax.swing.JButton btnup;
    private javax.swing.JButton btnviwe;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void viweitem() {
         try {
            ResultSet rs = db.serch("select * from grn where stat =1");
            DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
             while(rs.next()){
             Vector v =new Vector ();
         v.add(rs.getString("grn_id"));
                ResultSet serch = db.serch("select * from suplayer where suplayer_id='"+rs.getString("suplayer_id")+"'");
                String suplayerNamme=null;
         if(serch.next()){
         suplayerNamme=serch.getString("name");
         }
         v.add(suplayerNamme);
         v.add(rs.getString("total_amount"));
         v.add(rs.getString("total_discount"));
                ResultSet serch1 = db.serch("select * from employee where employee_id='"+rs.getString("empoyee_id")+"'");
                String employeeName=null;
         if(serch1.next()){
         employeeName=serch1.getString("first_name")+" "+serch1.getString("last_name");
         }
         v.add(employeeName);
         dtm.addRow(v);
            

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}