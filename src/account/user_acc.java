/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.Checknull;
import common.TbView;
import common.MD5;
import common.db;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udesh
 */
public class user_acc extends javax.swing.JFrame {

    /**
     * Creates new form user_acc
     */
    public user_acc() {
        initComponents();
        screensize();
        TbView.tableSettings(jTable1);
        jScrollPane2.setVisible(false);
        comboData();
        Loadmember() ;
    }
     private void screensize() {
      
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
}
 boolean stop =false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtemid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btndash = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sb = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtcompw = new javax.swing.JPasswordField();
        txtpw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1840, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1219, 76, -1, -1));

        txtemid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemidActionPerformed(evt);
            }
        });
        txtemid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemidKeyReleased(evt);
            }
        });
        getContentPane().add(txtemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 240, 30));

        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        list1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                list1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(list1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 240, 90));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("  Employee ID");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("  Gamdora Distriburtors");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

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

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1220));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  User Account");
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

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 240, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Account Type");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 150, 30));

        txtnic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnicMouseClicked(evt);
            }
        });
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        txtnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnicKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnicKeyTyped(evt);
            }
        });
        getContentPane().add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("User Name");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 130, 30));

        txtuname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        txtuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtunameKeyTyped(evt);
            }
        });
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 240, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Comfrom Password");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 180, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee id", "Account Type", "User Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 630, 360));

        sb.setBackground(new java.awt.Color(0, 0, 102));
        sb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sb.setForeground(new java.awt.Color(255, 255, 255));
        sb.setText("Submit");
        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });
        getContentPane().add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 520, 180, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Password");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 120, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("NIC");
        jLabel25.setToolTipText("");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 150, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seach User Type" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 240, 30));

        txtcompw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompwActionPerformed(evt);
            }
        });
        txtcompw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcompwKeyTyped(evt);
            }
        });
        getContentPane().add(txtcompw, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 240, 30));

        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        txtpw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpwKeyTyped(evt);
            }
        });
        getContentPane().add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseEntered
        btndash.setBackground(Color.BLUE);
    }//GEN-LAST:event_btndashMouseEntered

    private void btndashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashMouseExited
        btndash.setBackground(new Color(0,0,51));
    }//GEN-LAST:event_btndashMouseExited

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        new useracc_viwe().setVisible(true);
    }//GEN-LAST:event_btndashActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        Checknull.checkNull(txtname, "name", txtname);
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
       Checknull.checkNull(txtnic, "nic", txtname);
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
         Checknull.checkNull(txtuname, "user name", txtpw);
    }//GEN-LAST:event_txtunameActionPerformed

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        try {
           createUserAcc();   
      ResultSet rs = db.serch("SELECT * FROM user_account WHERE stat=1");
         DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
         dtm.setRowCount(0);
         while(rs.next()){
         
         Vector v =new Vector ();
         v.add(rs.getString("employee_id"));
         v.add(rs.getString("acc_type"));
          v.add(rs.getString("user_name"));
         
           
            dtm.addRow(v);
         
         
         }
                       
        }catch (NullPointerException n){
          JOptionPane.showMessageDialog(this, "Please  Fill Text Files");
        
        }catch(Exception e){
                e.printStackTrace();
        }
          
       

       

    }//GEN-LAST:event_sbActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void txtemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemidActionPerformed
              Checknull.checkNull(txtemid, "search", txtnic);      
    }//GEN-LAST:event_txtemidActionPerformed

    private void txtemidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemidKeyReleased
        try{
            if(!txtemid.getText().trim().equals("")){
                if(txtemid.getText().toUpperCase().contains("E")){
                    ResultSet rs=  db.serch("SELECT * FROM employee WHERE stat=1 AND employee_id  LIKE '"+txtemid.getText().toUpperCase()+"%'");
                    Vector v = new Vector();
                    jScrollPane2.setVisible(false);
                    while(rs.next()){
                        jScrollPane2.setVisible(true);
                        v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                    }
                    list1.setListData(v);
                }else{
                    ResultSet rs=  db.serch("SELECT * FROM employee WHERE stat=1 AND first_name LIKE '"+txtemid.getText().toUpperCase()+"%'");
                    Vector v = new Vector();
                    jScrollPane2.setVisible(false);
                    while(rs.next()){
                        jScrollPane2.setVisible(true);
                        v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                    }
                    list1.setListData(v);
                }
            }else{
                jScrollPane2.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtemidKeyReleased

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        if(evt.getClickCount()==2){
            txtemid.setText(list1.getSelectedValue().split("-")[0]);
           
            loadText2();
            jScrollPane2.setVisible(false);

        }
    }//GEN-LAST:event_list1MouseClicked

    private void list1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list1KeyReleased

    }//GEN-LAST:event_list1KeyReleased

    private void txtnicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
               // JOptionPane.showMessageDialog(this, "Sorry your enter string type");
        }
    }//GEN-LAST:event_txtnicKeyTyped

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        char keychar =evt.getKeyChar();
        boolean isDigit = Character.isDigit(keychar);
        if(isDigit){
        evt.consume();
        }
    }//GEN-LAST:event_txtnameKeyTyped

    private void txtunameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunameKeyTyped
         if(txtuname.getText().length()==12){
          evt.consume();
       }

    }//GEN-LAST:event_txtunameKeyTyped

    private void txtpwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpwKeyTyped
        if(txtpw.getText().length()==5){
          evt.consume();
       }

    }//GEN-LAST:event_txtpwKeyTyped

    private void txtcompwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcompwKeyTyped
         if(txtnic.getText().length()==5){
          evt.consume();
       }

    }//GEN-LAST:event_txtcompwKeyTyped

    private void txtnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyPressed
         if(evt.getKeyCode()==8){
       txtnic.setEditable(true);
       }
    }//GEN-LAST:event_txtnicKeyPressed

    private void txtnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyReleased
       if(txtnic.getText().length()==9){
              txtnic.setText(txtnic.getText().concat("V"));
            }else
              if(txtnic.getText().contains("V")||txtnic.getText().length()!=10){
             txtnic.setText(txtnic.getText().replace("V", ""));
          }
         if(txtnic.getText().length()==12){
                txtnic.setEditable(false);
                  }
    }//GEN-LAST:event_txtnicKeyReleased

    private void txtnicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnicMouseClicked
         txtnic.setEditable(true);
    }//GEN-LAST:event_txtnicMouseClicked

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
     Checknull.checkNull(txtpw, "pass word", txtcompw);
    }//GEN-LAST:event_txtpwActionPerformed

    private void txtcompwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompwActionPerformed
         Checknull.checkNull(txtcompw, "nic", txtcompw);
         sb.grabFocus();
    }//GEN-LAST:event_txtcompwActionPerformed

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
                new user_acc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndash;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> list1;
    private javax.swing.JButton sb;
    private javax.swing.JPasswordField txtcompw;
    private javax.swing.JTextField txtemid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables

    private void comboData() {
        try {
            ResultSet search = db.serch("SELECT * FROM user_type WHERE stat=1");
            while(search.next()){
            jComboBox1.addItem(search.getString("acc_type"));
            }
        } catch (Exception e) {
        }
    }

    private void Loadmember() {
          try {
            ResultSet rs = db.serch("SELECT * FROM user_account WHERE stat =1");
            DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
             while(rs.next()){
         Vector v =new Vector ();
        v.add(rs.getString("employee_id"));
         v.add(rs.getString("acc_type"));
          v.add(rs.getString("user_name"));
         
          
            dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createUserAcc() {
        if(!txtuname.getText().equals("")){

           if(String.valueOf(txtpw.getPassword()).equals(String.valueOf(txtcompw.getPassword()))){
               if(!jComboBox1.getSelectedItem().equals("Seach User Type")){
                   try {
                      String accId=null;
                       ResultSet search = db.serch("SELECT * FROM user_type WHERE acc_type='"+jComboBox1.getSelectedItem()+"'");
                          if(search.next()){
                         accId=search.getString("acc_id");
                          }
                          ResultSet search1 = db.serch("SELECT * FROM user_account WHERE employee_id='"+txtemid.getText()+"'");
                          if(search1.next()){
                       JOptionPane.showMessageDialog (null, "Now you have account", "Error", JOptionPane.ERROR_MESSAGE);
                       }else{
                         String registerDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    
                     db.iud("INSERT INTO user_account VALUES('"+txtemid.getText()+"','"+accId+"','"+txtuname.getText()+"','"+MD5.getMd5(String.valueOf(txtpw.getPassword()))+"','"+registerDate+"','"+1+"')");
                       JOptionPane.showMessageDialog(this,""+txtemid.getText()+"Employee is creat account");
                          }
                          clear();
           
             
             
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
           
               }else{
                   System.out.println("combo");
                   JOptionPane.showMessageDialog (null, "select account type", "Error", JOptionPane.ERROR_MESSAGE);

               }
           }else{
               System.out.println("password");
               JOptionPane.showMessageDialog (null, "check password", "Error", JOptionPane.ERROR_MESSAGE);

           }
       }else{
           System.out.println("null");
           JOptionPane.showMessageDialog (null, "Enter User Name", "Error", JOptionPane.ERROR_MESSAGE);

       }
    }

    private void clear() {
         txtemid.setText(null);
           txtnic.setText(null);
           txtname.setText(null);
          jComboBox1.setSelectedIndex(0);
           txtuname.setText(null);
           txtpw.setText(null);
            txtcompw.setText(null);
    }

   
    private void loadText2() {
         try {
            ResultSet serch = db.serch("SELECT * FROM employee WHERE employee_id='"+txtemid.getText().toUpperCase()+"'");
            if(serch.next()){
          Vector v =new Vector ();
           txtnic.setText(serch.getString("nic"));
            String name =serch.getString("first_name")+" "+serch.getString("last_name");
           txtname.setText(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


