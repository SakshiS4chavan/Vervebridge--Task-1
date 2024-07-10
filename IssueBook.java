/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;
import java.util.Date;
import java.sql.Connection;

//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Sakshi
 */
public class IssueBook extends javax.swing.JFrame {
    //Connection c = Connect.getConnection();
    
    
    /**
     * Creates new form IssueBook
     */
   //
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtstudent = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtdue = new javax.swing.JTextField();
        btnclose = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/isue.jpg"))); // NOI18N
        jLabel1.setText("   Add Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 79, 234, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 232, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 294, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Student Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 363, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 426, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 485, -1, -1));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 210, 450, 43));

        txtstudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 290, 450, 40));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 359, 450, 40));

        txtdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 450, -1));

        txtdue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 481, 450, -1));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/close icon.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 0, 42, -1));

        btnsave.setBackground(new java.awt.Color(255, 51, 51));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(242, 242, 242));
        btnsave.setText("Issue");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 546, 107, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/All Page Backgraound (1).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
  PreparedStatement pst=null;
                ResultSet rs=null;
        
        if(txtid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "please enter book id");
                txtid.requestFocus();
   }
        else{
            try{
              Connection c = Connect.getConnection();
    
// Connection   c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "Sakshi@123");
            pst=c.prepareStatement("select * from book where id=?"); 
            pst.setString(1, txtid.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                txtname.setText(rs.getString(2));
            }
            else
            {
             JOptionPane.showMessageDialog(rootPane, "Please enter valid book id");
                txtid.requestFocus();
            
   }   
            }
            catch (SQLException ex) {
            Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    }

     public IssueBook() {
        initComponents();
        SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
       JTextField txtissue=new JTextField ();
txtissue.setText(sfd.format(d));
    }

    private void txtstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstudent;
    // End of variables declaration//GEN-END:variables
}
