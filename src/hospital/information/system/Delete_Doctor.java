package hospital.information.system;

import static hospital.information.system.Application.statement;
import java.sql.*;
public class Delete_Doctor extends javax.swing.JFrame {

    public Delete_Doctor() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogEditD = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        NewSubmit = new javax.swing.JButton();
        Bend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFDoctor_code = new javax.swing.JTextField();
        DSubmit = new javax.swing.JButton();
        DCancel = new javax.swing.JButton();

        jLabel5.setText("Η εγγραφή διαγράφηκε.");

        NewSubmit.setText("Νέα διαγραφή");
        NewSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSubmitActionPerformed(evt);
            }
        });

        Bend.setText("Τέλος");
        Bend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogEditDLayout = new javax.swing.GroupLayout(jDialogEditD.getContentPane());
        jDialogEditD.getContentPane().setLayout(jDialogEditDLayout);
        jDialogEditDLayout.setHorizontalGroup(
            jDialogEditDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDialogEditDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogEditDLayout.createSequentialGroup()
                        .addComponent(NewSubmit)
                        .addGap(28, 28, 28)
                        .addComponent(Bend))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogEditDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jDialogEditDLayout.setVerticalGroup(
            jDialogEditDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jDialogEditDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewSubmit)
                    .addComponent(Bend))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        setTitle("Διαγραφή Γιατρού");

        jLabel1.setText("ΦΟΡΜΑ ΔΙΑΓΡΑΦΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabel2.setText("Κωδικός Γιατρού:");

        DSubmit.setText("Καταχώρηση");
        DSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSubmitActionPerformed(evt);
            }
        });

        DCancel.setText("Άκυρο");
        DCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(TFDoctor_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(DCancel)))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFDoctor_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSubmit)
                    .addComponent(DCancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSubmitActionPerformed
    
    int dcode = Integer.valueOf(TFDoctor_code.getText());
    
    try {
        CallableStatement callableStatement  = dbConnection.prepareCall("{call delete_doctor(?)}");
        callableStatement.setInt(1, dcode);
        callableStatement.execute();
        callableStatement.close();
    } catch(SQLException ex) {
        // Exception handling
        System.out.println("\n -- SQL Exception --- \n");
        System.out.println("Message: " + ex.getMessage());
        ex = ex.getNextException();
    }
    
    jDialogEditD.setVisible(true);
    jDialogEditD.setSize(300, 200);
    }//GEN-LAST:event_DSubmitActionPerformed

    private void NewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitActionPerformed
         TFDoctor_code.setText("");
         jDialogEditD.setVisible(false);
    }//GEN-LAST:event_NewSubmitActionPerformed

    private void BendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BendActionPerformed
        try {
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }    
        jDialogEditD.setVisible(false);
        setVisible(false);
        
    }//GEN-LAST:event_BendActionPerformed

    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
         TFDoctor_code.setText("");
    }//GEN-LAST:event_BCancelActionPerformed

    void myconnection () {
            try {
                Class.forName (driverClassName);
            } catch (ClassNotFoundException ex) {
            }
        try {    
        dbConnection = DriverManager.getConnection (url, username, passwd);
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
       }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Delete_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Doctor().setVisible(true);
            }
        });
    }
    
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/iee2020246" ;
    static Connection dbConnection = null;
    static String     username = "iee2020246";
    static String     passwd = "Lp951753!";
    static PreparedStatement  statement       = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bend;
    private javax.swing.JButton DCancel;
    private javax.swing.JButton DSubmit;
    private javax.swing.JButton NewSubmit;
    private javax.swing.JTextField TFDoctor_code;
    private javax.swing.JDialog jDialogEditD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
