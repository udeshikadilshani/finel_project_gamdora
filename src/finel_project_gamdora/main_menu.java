/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finel_project_gamdora;

import common.db;
import sell.Sale_report;
import sell.sell_item;
import sell.sale_return;
import account.useracc_viwe;
import po.item_order;
import customer.customer_menegment;
import employee.Emplooye_register;
import item.Viwe_item;
import grn.GRN_viwe;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.SystemData;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import suplayer.suplayer_menegment;

/**
 *
 * @author udesh
 */
public class main_menu extends javax.swing.JFrame {


    public main_menu() {
        initComponents();
        screensize();
        jScrollPane4.setVisible(false);
        jScrollPane2.setVisible(false);
        System.out.println(SystemData.getCurrentUser());
         System.out.println(SystemData.getEmployee());
         System.out.println(SystemData.getAccId());
    }
      boolean stop =false;
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

        jButton1 = new javax.swing.JButton();
        btnadditem = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btncume1 = new javax.swing.JButton();
        btncume2 = new javax.swing.JButton();
        btnemre1 = new javax.swing.JButton();
        btnaa = new javax.swing.JButton();
        btnsetting = new javax.swing.JButton();
        btnsell = new javax.swing.JButton();
        btnemre = new javax.swing.JButton();
        btnret = new javax.swing.JButton();
        btnrepo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnaddit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtseach = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        txtitmn = new javax.swing.JTextField();
        txtav1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadditem.setBackground(new java.awt.Color(0, 0, 51));
        btnadditem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadditem.setForeground(new java.awt.Color(255, 255, 255));
        btnadditem.setText("Item Order Menu");
        btnadditem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnadditem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadditemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadditemMouseExited(evt);
            }
        });
        btnadditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadditemActionPerformed(evt);
            }
        });
        getContentPane().add(btnadditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 30));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 584, -1, -1));

        btncume1.setBackground(new java.awt.Color(0, 0, 51));
        btncume1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncume1.setForeground(new java.awt.Color(255, 255, 255));
        btncume1.setText("Suplayer Menegment");
        btncume1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncume1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncume1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncume1MouseExited(evt);
            }
        });
        btncume1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncume1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncume1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 30));

        btncume2.setBackground(new java.awt.Color(0, 0, 51));
        btncume2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncume2.setForeground(new java.awt.Color(255, 255, 255));
        btncume2.setText("Customer Menegment");
        btncume2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncume2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncume2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncume2MouseExited(evt);
            }
        });
        btncume2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncume2ActionPerformed(evt);
            }
        });
        getContentPane().add(btncume2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 30));

        btnemre1.setBackground(new java.awt.Color(0, 0, 51));
        btnemre1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnemre1.setForeground(new java.awt.Color(255, 255, 255));
        btnemre1.setText("User Account");
        btnemre1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnemre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnemre1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnemre1MouseExited(evt);
            }
        });
        btnemre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemre1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnemre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 260, 30));

        btnaa.setBackground(new java.awt.Color(0, 0, 51));
        btnaa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnaa.setForeground(new java.awt.Color(255, 255, 255));
        btnaa.setText("  Item Management");
        btnaa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnaaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnaaMouseExited(evt);
            }
        });
        btnaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaaActionPerformed(evt);
            }
        });
        getContentPane().add(btnaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 30));

        btnsetting.setBackground(new java.awt.Color(0, 0, 51));
        btnsetting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsetting.setForeground(new java.awt.Color(255, 255, 255));
        btnsetting.setText("Setting");
        btnsetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsettingMouseExited(evt);
            }
        });
        btnsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsettingActionPerformed(evt);
            }
        });
        getContentPane().add(btnsetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 260, 30));

        btnsell.setBackground(new java.awt.Color(0, 0, 51));
        btnsell.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsell.setForeground(new java.awt.Color(255, 255, 255));
        btnsell.setText("Sell Item");
        btnsell.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnsell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsellMouseExited(evt);
            }
        });
        btnsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellActionPerformed(evt);
            }
        });
        getContentPane().add(btnsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 30));

        btnemre.setBackground(new java.awt.Color(0, 0, 51));
        btnemre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnemre.setForeground(new java.awt.Color(255, 255, 255));
        btnemre.setText("Employee Register");
        btnemre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnemre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnemreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnemreMouseExited(evt);
            }
        });
        btnemre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemreActionPerformed(evt);
            }
        });
        getContentPane().add(btnemre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, 30));

        btnret.setBackground(new java.awt.Color(0, 0, 51));
        btnret.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnret.setForeground(new java.awt.Color(255, 255, 255));
        btnret.setText("Sale Retrun ");
        btnret.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnretMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnretMouseExited(evt);
            }
        });
        btnret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretActionPerformed(evt);
            }
        });
        getContentPane().add(btnret, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 260, 30));

        btnrepo.setBackground(new java.awt.Color(0, 0, 51));
        btnrepo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrepo.setForeground(new java.awt.Color(255, 255, 255));
        btnrepo.setText("Sale Report");
        btnrepo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnrepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnrepoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnrepoMouseExited(evt);
            }
        });
        btnrepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepoActionPerformed(evt);
            }
        });
        getContentPane().add(btnrepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 260, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 40));

        btnaddit.setBackground(new java.awt.Color(0, 0, 51));
        btnaddit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnaddit.setForeground(new java.awt.Color(255, 255, 255));
        btnaddit.setText("Good Recive Note");
        btnaddit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnaddit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadditMouseExited(evt);
            }
        });
        btnaddit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadditActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 30));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 960));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText(" Seach By Item");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Item Name,ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 150, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("admin");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1193, 80, 70, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("9:41 PM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2021/11/06");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText(" Seach By Customer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 270, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(" Customer ID , Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 200, 20));

        txtseach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseachActionPerformed(evt);
            }
        });
        txtseach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtseachKeyReleased(evt);
            }
        });
        getContentPane().add(txtseach, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 240, 30));

        List2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(List2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 240, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText(" Amount in Arrears");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 190, 20));

        txtpay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });
        getContentPane().add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 240, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   Main Menu");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 1050, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("setting");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 70, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list2MouseClicked(evt);
            }
        });
        list2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                list2KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(list2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 240, 90));

        txtitmn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtitmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitmnActionPerformed(evt);
            }
        });
        txtitmn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtitmnKeyReleased(evt);
            }
        });
        jPanel1.add(txtitmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 240, -1));

        txtav1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Avalabel");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 980, 190));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 980, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncume1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncume1MouseEntered
       btncume1.setBackground(Color.BLUE);
    }//GEN-LAST:event_btncume1MouseEntered

    private void btncume1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncume1MouseExited
       btncume1.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btncume1MouseExited

    private void btncume1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncume1ActionPerformed
       new suplayer_menegment().setVisible(true); 
    }//GEN-LAST:event_btncume1ActionPerformed

    private void btnretMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretMouseEntered
        btnret.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnretMouseEntered

    private void btnretMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretMouseExited
        btnret.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnretMouseExited

    private void btnretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretActionPerformed
            new sale_return().setVisible(true);        
    }//GEN-LAST:event_btnretActionPerformed

    private void btnrepoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrepoMouseEntered
        btnrepo.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnrepoMouseEntered

    private void btnrepoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrepoMouseExited
        btnrepo.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnrepoMouseExited

    private void btnrepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepoActionPerformed
                 new Sale_report().setVisible(true);   
    }//GEN-LAST:event_btnrepoActionPerformed

    private void btnadditemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadditemMouseEntered
          btnadditem.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnadditemMouseEntered

    private void btnadditemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadditemMouseExited
          btnadditem.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnadditemMouseExited

    private void btnadditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadditemActionPerformed
        new item_order().setVisible(true);    
    }//GEN-LAST:event_btnadditemActionPerformed

    private void btnsellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsellMouseEntered
         btnsell.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnsellMouseEntered

    private void btnsellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsellMouseExited
         btnsell.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnsellMouseExited

    private void btnsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellActionPerformed
                new sell_item().setVisible(true);        
    }//GEN-LAST:event_btnsellActionPerformed

    private void btnemreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnemreMouseEntered
         btnemre.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnemreMouseEntered

    private void btnemreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnemreMouseExited
         btnemre.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnemreMouseExited

    private void btnemreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemreActionPerformed
        new Emplooye_register().setVisible(true);     
    }//GEN-LAST:event_btnemreActionPerformed

    private void txtseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseachActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void btnsettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsettingMouseEntered
         btnsetting.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnsettingMouseEntered

    private void btnsettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsettingMouseExited
       btnsetting.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnsettingMouseExited

    private void btnsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsettingActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnadditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadditMouseEntered
        btnaddit.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnadditMouseEntered

    private void btnadditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadditMouseExited
         btnaddit.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnadditMouseExited

    private void btnadditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadditActionPerformed
      new GRN_viwe().setVisible(true);
    }//GEN-LAST:event_btnadditActionPerformed

    private void btnaaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaaMouseEntered
      btnaa.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnaaMouseEntered

    private void btnaaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaaMouseExited
         btnaa.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btnaaMouseExited

    private void btnaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaaActionPerformed
         new Viwe_item().setVisible(true);
    }//GEN-LAST:event_btnaaActionPerformed

    private void btnemre1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnemre1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnemre1MouseEntered

    private void btnemre1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnemre1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnemre1MouseExited

    private void btnemre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemre1ActionPerformed
          new useracc_viwe().setVisible(true);
    }//GEN-LAST:event_btnemre1ActionPerformed

    private void List2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List2MouseClicked
         if(evt.getClickCount()==2){
            txtseach.setText(List2.getSelectedValue().split("-")[0]);
            
            
            jScrollPane2.setVisible(false);

        }
    }//GEN-LAST:event_List2MouseClicked

    private void txtseachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseachKeyReleased
        try{
            if(!txtseach.getText().trim().equals("")){
            if(txtseach.getText().toUpperCase().contains("C")){
                ResultSet rs=  db.serch("SELECT * FROM customer_register WHERE stat=1 AND customer_id  LIKE '"+txtseach.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                       jScrollPane2.setVisible(false);
                while(rs.next()){
                     jScrollPane2.setVisible(true);
                    v.add(rs.getString("customer_id")+"-"+rs.getString("frist_name")+" "+rs.getString("last_name"));
                }
                List2.setListData(v);
            }else{
                ResultSet rs=  db.serch("SELECT * FROM customer_register WHERE stat=1 AND frist_name LIKE '"+txtseach.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                 jScrollPane2.setVisible(false);
                while(rs.next()){
                    jScrollPane2.setVisible(true);
                    v.add(rs.getString("customer_id")+"-"+rs.getString("frist_name")+" "+rs.getString("last_name"));  
                }
                List2.setListData(v);
            }
            }else{
             jScrollPane2.setVisible(false);
            }
}catch(Exception e){
e.printStackTrace();
}
    }//GEN-LAST:event_txtseachKeyReleased

    private void txtitmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitmnActionPerformed
       
    }//GEN-LAST:event_txtitmnActionPerformed

    private void txtitmnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitmnKeyReleased
        try{
            if(!txtitmn.getText().trim().equals("")){
                if(txtitmn.getText().toUpperCase().contains("I")){
                    ResultSet rs=  db.serch("SELECT * FROM item WHERE stat=1 AND item_id  LIKE '"+txtitmn.getText().toUpperCase()+"%'");
                    java.util.Vector v = new java.util.Vector();
                    jScrollPane4.setVisible(false);
                    while(rs.next()){
                        jScrollPane4.setVisible(true);
                        v.add(rs.getString("item_id")+"-"+rs.getString("name"));
                    }
                    list2.setListData(v);
                }else{
                    ResultSet rs=  db.serch("SELECT * FROM item WHERE stat=1 AND name LIKE '"+txtitmn.getText().toUpperCase()+"%'");
                    java.util.Vector v = new java.util.Vector();
                    jScrollPane4.setVisible(false);
                    while(rs.next()){
                        jScrollPane4.setVisible(true);
                        v.add(rs.getString("item_id")+"-"+rs.getString("name"));
                    }
                    list2.setListData(v);
                }
            }else{
                jScrollPane4.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtitmnKeyReleased

    private void list2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MouseClicked
        if(evt.getClickCount()==2){
            txtitmn.setText(list2.getSelectedValue().split("-")[0]);

          
            loadText2();
            jScrollPane4.setVisible(false);

        }
    }//GEN-LAST:event_list2MouseClicked

    private void list2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list2KeyReleased
        //
    }//GEN-LAST:event_list2KeyReleased

    private void btncume2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncume2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btncume2MouseEntered

    private void btncume2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncume2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncume2MouseExited

    private void btncume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncume2ActionPerformed
               new customer_menegment().setVisible(true);           
    }//GEN-LAST:event_btncume2ActionPerformed

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
                new main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List2;
    private javax.swing.JButton btnaa;
    private javax.swing.JButton btnaddit;
    private javax.swing.JButton btnadditem;
    private javax.swing.JButton btncume1;
    private javax.swing.JButton btncume2;
    private javax.swing.JButton btnemre;
    private javax.swing.JButton btnemre1;
    private javax.swing.JButton btnrepo;
    private javax.swing.JButton btnret;
    private javax.swing.JButton btnsell;
    private javax.swing.JButton btnsetting;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list2;
    private javax.swing.JTextField txtav1;
    private javax.swing.JTextField txtitmn;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtseach;
    // End of variables declaration//GEN-END:variables

    private void loadText2() {
        try {
            ResultSet serch = db.serch("SELECT * FROM customer_register WHERE customer_id='"+txtseach.getText().toUpperCase()+"'");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
}
