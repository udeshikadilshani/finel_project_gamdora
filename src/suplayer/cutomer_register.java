/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suplayer;

import customer.*;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.Checknull;
import common.SystemData;
import common.TbView;
import common.db;
import static common.db.serch;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udesh
 */
public class cutomer_register extends javax.swing.JFrame {

    /**
     * Creates new form cutomer_register
     */
    public cutomer_register() {
        initComponents();
        screensize();
        TbView.tableSettings(jTable1);
        genareteCustomerID();
        Loadcustomer();
    }

    private void screensize() {

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    boolean textInput = true;

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
        jLabel21 = new javax.swing.JLabel();
        txtcmid = new javax.swing.JTextField();
        btndash = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtnic1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtln = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtea = new javax.swing.JTextField();
        txtfn = new javax.swing.JTextField();
        txtcn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 11, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Supalyer ID");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 150, 30));

        txtcmid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmidActionPerformed(evt);
            }
        });
        getContentPane().add(txtcmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 80, 270, 30));

        btndash.setBackground(new java.awt.Color(0, 0, 51));
        btndash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndash.setForeground(new java.awt.Color(255, 255, 255));
        btndash.setText("Back");
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
        getContentPane().add(btndash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 30));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1220));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Suplayer Register");
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

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("NIC");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 150, 30));

        txtnic1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnic1MouseClicked(evt);
            }
        });
        txtnic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnic1ActionPerformed(evt);
            }
        });
        txtnic1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnic1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnic1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnic1KeyTyped(evt);
            }
        });
        getContentPane().add(txtnic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 240, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, 30));

        txtln.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnActionPerformed(evt);
            }
        });
        txtln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlnKeyTyped(evt);
            }
        });
        getContentPane().add(txtln, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 240, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Company");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 130, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Email address");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suplayer ID", "NIC", "Name", "Company", "Contact No", "Email", "Register Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 660, -1));

        jButton8.setBackground(new java.awt.Color(0, 0, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 580, 180, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Contact NO");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 150, 30));

        txtea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteaActionPerformed(evt);
            }
        });
        getContentPane().add(txtea, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 240, 30));

        txtfn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnActionPerformed(evt);
            }
        });
        txtfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfnKeyTyped(evt);
            }
        });
        getContentPane().add(txtfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 240, 30));

        txtcn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnActionPerformed(evt);
            }
        });
        txtcn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcnKeyTyped(evt);
            }
        });
        getContentPane().add(txtcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseEntered
        btndash.setBackground(Color.BLUE);
    }//GEN-LAST:event_btndashMouseEntered

    private void btndashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseExited
        btndash.setBackground(new Color(0, 0, 51));
    }//GEN-LAST:event_btndashMouseExited

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        new suplayer_menegment().setVisible(true);
    }//GEN-LAST:event_btndashActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnic1ActionPerformed
         Checknull.checkNull(txtnic1, "nic", txtfn);
    }//GEN-LAST:event_txtnic1ActionPerformed

    private void txtlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnActionPerformed
         Checknull.checkNull(txtln, "lname", txtln);
    }//GEN-LAST:event_txtlnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            ResultSet serch = db.serch("SELECT * FROM suplayer WHERE nic='"+txtnic1.getText()+"'");
            if(serch.next()){
            JOptionPane.showMessageDialog(this,"Alredy Registered Suplayer", "Suplayer Register",1);
            }else{
             insert();
            }

        }catch(Exception e){
          e.printStackTrace();
          
        }
           
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteaActionPerformed
         Checknull.checkNull(txtea, "email", txtea);
         jButton8.grabFocus();
    }//GEN-LAST:event_txteaActionPerformed

    private void txtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnActionPerformed
           Checknull.checkNull(txtfn, "fname", txtln);        
    }//GEN-LAST:event_txtfnActionPerformed

    private void txtcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnActionPerformed
      Checknull.checkNull(txtcn, "contact", txtea);
    }//GEN-LAST:event_txtcnActionPerformed

    private void txtnic1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnic1KeyTyped
                                     
       if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
               // JOptionPane.showMessageDialog(this, "Sorry your enter string type");
        }
    }//GEN-LAST:event_txtnic1KeyTyped

    private void txtlnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnKeyTyped
       char keychar =evt.getKeyChar();
        boolean isDigit = Character.isDigit(keychar);
        if(isDigit){
        evt.consume();
        }
    }//GEN-LAST:event_txtlnKeyTyped

    private void txtfnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnKeyTyped
        char keychar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keychar);
        if (isDigit) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfnKeyTyped

    private void txtcnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnKeyTyped
        if(txtcn.getText().length()==10){
          evt.consume();
         }
        
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
               // JOptionPane.showMessageDialog(this, "Sorry your enter string type");
        }
    }//GEN-LAST:event_txtcnKeyTyped

    private void txtcmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmidActionPerformed
         Checknull.checkNull(txtcmid, "customer Id", txtnic1);
    }//GEN-LAST:event_txtcmidActionPerformed

    private void txtnic1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnic1KeyPressed
         if(evt.getKeyCode()==8){
       txtnic1.setEditable(true);
       }
    }//GEN-LAST:event_txtnic1KeyPressed

    private void txtnic1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnic1KeyReleased
         if(txtnic1.getText().length()==9){
              txtnic1.setText(txtnic1.getText().concat("V"));
            }else
              if(txtnic1.getText().contains("V")||txtnic1.getText().length()!=10){
             txtnic1.setText(txtnic1.getText().replace("V", ""));
          }
         if(txtnic1.getText().length()==12){
                txtnic1.setEditable(false);
                  }
    }//GEN-LAST:event_txtnic1KeyReleased

    private void txtnic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnic1MouseClicked
         txtnic1.setEditable(true);

    }//GEN-LAST:event_txtnic1MouseClicked

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
                new cutomer_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndash;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcmid;
    private javax.swing.JTextField txtcn;
    private javax.swing.JTextField txtea;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtnic1;
    // End of variables declaration//GEN-END:variables

    private void genareteCustomerID() {

        try {
            ResultSet rs = db.serch("select count(suplayer_id) as x from suplayer");
            if (rs.next()) {
                String counts = rs.getString("x");

                int count = Integer.parseInt(counts);
                ++count;
                if (count < 10) {
                    txtcmid.setText("S000" + count);
                    // txtmi.setEditable(false);
                } else if (count < 100) {
                    txtcmid.setText("S00" + count);
                    // txtmi.setEditable(false);
                } else if (count < 1000) {
                    txtcmid.setText("S0" + count);
                    //txtmi.setEditable(false);
                } else if (count < 10000) {
                    txtcmid.setText("S" + count);
                    // txtmi.setEditable(false);
                }
                txtnic1.grabFocus();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void Testtxt() {
        if (!txtnic1.getText().trim().equals("")) {
            textInput=true;
            if (!txtln.getText().trim().equals("")) {
                textInput=true;
                if (!txtea.getText().trim().equals("")) {
                   textInput=true;
                } else {
                    JOptionPane.showMessageDialog(this, "Please Enter your Tel Number", "Phone Number", 2);
                    textInput = false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter your Name", " Name", 2);
                textInput = false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter your NIC Number", "NIC", 2);
            textInput = false;
        }
    }

    private void Loadcustomer() {
        try {
            ResultSet rs = db.serch("select * from suplayer where stat =1");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
               
         java.util.Vector v =new java.util.Vector ();
         v.add(rs.getString("suplayer_id"));
         v.add(rs.getString("nic"));
          v.add(rs.getString("name"));
            v.add(rs.getString("company"));
         v.add(rs.getString("phone"));
         v.add(rs.getString("email"));
         v.add(rs.getString("register_date"));
         dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insert() {
        try{
         Testtxt();
            System.out.println("1"); 
            if (textInput) {
                   System.out.println("2");
              String suplayerId = txtcmid.getText().toUpperCase();
             String nic= txtnic1.getText().toUpperCase();
            String name= txtfn.getText().toUpperCase();
            String company= txtln.getText().toUpperCase();
            String phone =txtcn.getText().toUpperCase();
             String email =txtea.getText().toUpperCase();
           String register_Date = new SimpleDateFormat("yyyy-MM-dd ").format(new Date());
                System.out.println("sdsdes");
           db.iud("insert into suplayer values('" + suplayerId + "','" + nic + "','" + name + "','" + company + "','"  + phone + "','" + email + "','"  + register_Date + "','" + 1 + "')");
                      System.out.println("2");
                JOptionPane.showMessageDialog(this, "" + txtcmid.getText() + "Suplayer is register");
                textInput = true;
                txtcmid.setText(null);            Testtxt();

                txtnic1.setText(null);
                txtfn.setText(null);
                txtln.setText(null);
                txtcn.setText(null);
                txtea.setText(null);

                genareteCustomerID();

                ResultSet rs = db.serch("select * from suplayer");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                   
         java.util.Vector v =new java.util.Vector ();
         v.add(rs.getString("suplayer_id"));
         v.add(rs.getString("nic"));
          v.add(rs.getString("name"));
            v.add(rs.getString("company"));
         v.add(rs.getString("phone"));
         v.add(rs.getString("email"));
         v.add(rs.getString("register_date"));
         dtm.addRow(v);

                }
            }else{
                System.out.println("3");
            }

        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "Please  Fill Text Files");
        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }