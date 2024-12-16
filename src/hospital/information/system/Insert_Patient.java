package hospital.information.system;

import static hospital.information.system.Application.statement;
import java.sql.*;
public class Insert_Patient extends javax.swing.JFrame {

    public Insert_Patient() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogInsertD = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        NewSubmit = new javax.swing.JButton();
        Bend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFPatient_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFPatient_first_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFPatient_last_name = new javax.swing.JTextField();
        DSubmit = new javax.swing.JButton();
        DCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TFPatient_phone_number = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFPatient_age = new javax.swing.JTextField();
        TFPatient_gender = new javax.swing.JTextField();

        jLabel5.setText("Η εγγραφή καταχωρήθηκε.");

        NewSubmit.setText("Νέα καταχώρηση");
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

        javax.swing.GroupLayout jDialogInsertDLayout = new javax.swing.GroupLayout(jDialogInsertD.getContentPane());
        jDialogInsertD.getContentPane().setLayout(jDialogInsertDLayout);
        jDialogInsertDLayout.setHorizontalGroup(
            jDialogInsertDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogInsertDLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDialogInsertDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogInsertDLayout.createSequentialGroup()
                        .addComponent(NewSubmit)
                        .addGap(28, 28, 28)
                        .addComponent(Bend))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogInsertDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jDialogInsertDLayout.setVerticalGroup(
            jDialogInsertDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogInsertDLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jDialogInsertDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewSubmit)
                    .addComponent(Bend))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        setTitle("Εισαγωγή Ασθενή");

        jLabel1.setText("ΦΟΡΜΑ ΕΙΣΑΓΩΓΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabel2.setText("Κωδικός  Ασθενή:");

        jLabel3.setText("Όνομα  Ασθενή:");

        jLabel4.setText("Επίθετο  Ασθενή:");

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

        jLabel7.setText("Αριθμός Τηλεφώνου:");

        jLabel6.setText("Ηλικία: ");

        jLabel8.setText("Φύλο (M ή F) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(DCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFPatient_gender)
                            .addComponent(TFPatient_age, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFPatient_phone_number, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFPatient_last_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFPatient_first_name)
                            .addComponent(TFPatient_code, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPatient_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFPatient_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFPatient_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFPatient_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFPatient_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFPatient_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSubmit)
                    .addComponent(DCancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSubmitActionPerformed
        
    int pcode = Integer.valueOf(TFPatient_code.getText());
    String pFirst_name = TFPatient_first_name.getText();
    String pLast_name = TFPatient_last_name.getText();
    String pPhone = TFPatient_phone_number.getText();
    int pAge = Integer.valueOf(TFPatient_age.getText());
    String pGender = TFPatient_gender.getText();
    try {
        CallableStatement callableStatement  = dbConnection.prepareCall("{call insert_Patient(?, ?, ?, ?, ?, ?)}");
        callableStatement.setInt(1, pcode);
        callableStatement.setString(2, pFirst_name);
        callableStatement.setString(3, pLast_name);
        callableStatement.setString(4, pPhone);
        callableStatement.setInt(5, pAge);
        callableStatement.setString(6, pGender);       
        
        callableStatement.execute();
        callableStatement.close();
    } catch(SQLException ex) {
        // Exception handling
        System.out.println("\n -- SQL Exception --- \n");
        while(ex != null) {
            System.out.println("Message: " + ex.getMessage());
            ex = ex.getNextException();
        }
    }
    
    jDialogInsertD.setVisible(true);
    jDialogInsertD.setSize(300, 200);
    }//GEN-LAST:event_DSubmitActionPerformed

    private void NewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitActionPerformed
         TFPatient_code.setText("");
         TFPatient_first_name.setText("");
         TFPatient_last_name.setText("");
         TFPatient_phone_number.setText("");
         TFPatient_age.setText("");
         TFPatient_gender.setText("");
         jDialogInsertD.setVisible(false);
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
        jDialogInsertD.setVisible(false);
        setVisible(false);
    }//GEN-LAST:event_BendActionPerformed

    private void BCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelActionPerformed
         TFPatient_code.setText("");
         TFPatient_first_name.setText("");
         TFPatient_last_name.setText("");
         TFPatient_phone_number.setText("");
         TFPatient_age.setText("");
         TFPatient_gender.setText("");         
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
            java.util.logging.Logger.getLogger(Insert_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Doctor().setVisible(true);
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
    private javax.swing.JTextField TFPatient_age;
    private javax.swing.JTextField TFPatient_code;
    private javax.swing.JTextField TFPatient_first_name;
    private javax.swing.JTextField TFPatient_gender;
    private javax.swing.JTextField TFPatient_last_name;
    private javax.swing.JTextField TFPatient_phone_number;
    private javax.swing.JDialog jDialogInsertD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
