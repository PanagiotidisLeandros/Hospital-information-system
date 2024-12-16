package hospital.information.system;

import static hospital.information.system.Application.statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Edit_Prescription extends javax.swing.JFrame {

    public Edit_Prescription() {
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
        TFPrescription_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFDate = new javax.swing.JTextField();
        DSubmit = new javax.swing.JButton();
        DCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFcost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFPrescription_code = new javax.swing.JTextField();
        TFInsurance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFFrequency = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel5.setText("Η εγγραφή ενημερώθηκε.");

        NewSubmit.setText("Νέα ενημέρωση");
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

        setTitle("Τροποποίηση Συνταγής ");

        jLabel1.setText("ΦΟΡΜΑ ΕΝΗΜΕΡΩΣΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabel2.setText("Κωδικός Ασθενή:");

        jLabel3.setText("Όνομα Φαρμάκου:");

        jLabel4.setText("Ημερομηνία :");

        TFDate.setToolTipText("YYYY-MM-DD");

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

        jLabel6.setText("Κόστος:");

        TFcost.setToolTipText("");

        jLabel7.setText("(YYYY-MM-DD)");

        jLabel9.setText("Κωδικός Συνταγής:");

        jLabel8.setText("(Y ή N)");

        jLabel10.setText("(1-7 days/week)");

        jLabel11.setText("Ασφαλιστική Κάλυψη:");

        jLabel12.setText("Συχνότητα:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFPrescription_name)
                            .addComponent(TFDate)
                            .addComponent(TFcost)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addComponent(TFInsurance)
                            .addComponent(TFFrequency)
                            .addComponent(TFPatient_code)
                            .addComponent(TFPrescription_code))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFPrescription_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPatient_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFPrescription_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSubmit)
                    .addComponent(DCancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSubmitActionPerformed
    
    int prescription_code = Integer.valueOf(TFPrescription_code.getText());
    int patient_code = Integer.valueOf(TFPatient_code.getText());
    String prescription_name = TFPrescription_name.getText();
    String Str_date = TFDate.getText();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    int cost = Integer.valueOf(TFcost.getText());
    String Insurance = TFInsurance.getText();
    String Frequency = TFFrequency.getText();    
    java.util.Date utilDate = null;
           try {
            utilDate = dateFormat.parse(Str_date);
        } catch (ParseException ex) {
            Logger.getLogger(Insert_Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
        CallableStatement callableStatement  = dbConnection.prepareCall("{call update_prescription(?, ?, ?, ?, ?, ?, ?)}");
        callableStatement.setInt(1, prescription_code);
        callableStatement.setInt(2, patient_code);
        callableStatement.setString(3, prescription_name);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        callableStatement.setDate(4, sqlDate);
        callableStatement.setInt(5, cost); 
        callableStatement.setString(6, Insurance);
        callableStatement.setString(7, Frequency);           
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
         TFPrescription_code.setText("");  
         TFPatient_code.setText("");
         TFPrescription_name.setText("");
         TFDate.setText("");
         TFcost.setText("");
         TFInsurance.setText("");
         TFFrequency.setText("");         
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
         TFPrescription_code.setText(""); 
         TFPatient_code.setText("");
         TFPrescription_name.setText("");
         TFDate.setText("");
         TFcost.setText("");
         TFInsurance.setText("");
         TFFrequency.setText("");         
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
            java.util.logging.Logger.getLogger(Edit_Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
    private javax.swing.JTextField TFDate;
    private javax.swing.JTextField TFFrequency;
    private javax.swing.JTextField TFInsurance;
    private javax.swing.JTextField TFPatient_code;
    private javax.swing.JTextField TFPrescription_code;
    private javax.swing.JTextField TFPrescription_name;
    private javax.swing.JTextField TFcost;
    private javax.swing.JDialog jDialogInsertD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
