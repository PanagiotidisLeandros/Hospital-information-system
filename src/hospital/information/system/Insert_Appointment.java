package hospital.information.system;

import static hospital.information.system.Application.statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Insert_Appointment extends javax.swing.JFrame {

    public Insert_Appointment() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFPatient_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFDoctor_code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFDate = new javax.swing.JTextField();
        DSubmit = new javax.swing.JButton();
        DCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFtime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFAppointment_code = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFappointment_type = new javax.swing.JTextField();
        TFFollow_up_requiret = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        jScrollPane1.setViewportView(jTextPane1);

        setTitle("Εισαγωγή Ραντεβού");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ΦΟΡΜΑ ΕΙΣΑΓΩΓΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabel2.setText("Κωδικός Ασθενή:");

        jLabel3.setText("Κωδικός Γιατρού:");

        jLabel4.setText("Ημερομηνία :");

        TFDate.setToolTipText("YYYY-MM-DD");
        TFDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDateActionPerformed(evt);
            }
        });

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

        jLabel6.setText("Ωρα:");

        TFtime.setToolTipText("");

        jLabel7.setText("(YYYY-MM-DD)");

        jLabel8.setText("(HH:MM:SS)");

        jLabel9.setText("Κωδικός Ραντεβού:");

        jLabel10.setText("Τύπος Ραντεβού:");

        jLabel11.setText("Απαιτείται Παρακολούθηση:");

        jLabel12.setText("Check up ή Follow up");

        jLabel13.setText("(Υ ή Ν)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(DSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFPatient_code, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFDoctor_code, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFtime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFappointment_type, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFFollow_up_requiret)
                            .addComponent(TFAppointment_code)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFAppointment_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFPatient_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFDoctor_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFappointment_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFFollow_up_requiret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DSubmit)
                    .addComponent(DCancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSubmitActionPerformed
    int acode = Integer.valueOf(TFAppointment_code.getText());
    int dcode = Integer.valueOf(TFPatient_code.getText());
    int pcode = Integer.valueOf(TFDoctor_code.getText());
    String Str_date = TFDate.getText();
    String Str_time = TFtime.getText();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    String aType = TFappointment_type.getText();
    String Follow_up = TFFollow_up_requiret.getText();    
    java.util.Date utilDate = null;
    Time time = null;
        try {
            utilDate = dateFormat.parse(Str_date);
            time = new Time(timeFormat.parse(Str_time).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Insert_Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
        CallableStatement callableStatement  = dbConnection.prepareCall("{call insert_appointment(?, ?, ?, ?, ?, ?, ?)}");
        callableStatement.setInt(1, acode);
        callableStatement.setInt(2, dcode);
        callableStatement.setInt(3, pcode);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        callableStatement.setDate(4, sqlDate);
        callableStatement.setTime(5, time);
        callableStatement.setString(6, aType);
        callableStatement.setString(7, Follow_up);        
        
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
        TFAppointment_code.setText(""); 
        TFPatient_code.setText("");
         TFDoctor_code.setText("");
         TFDate.setText("");
         TFtime.setText("");
         TFappointment_type.setText("");
         TFFollow_up_requiret.setText("");
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
         TFAppointment_code.setText(""); 
         TFPatient_code.setText("");
         TFDoctor_code.setText("");
         TFDate.setText("");
         TFtime.setText("");
         TFappointment_type.setText("");
         TFFollow_up_requiret.setText("");         
    }//GEN-LAST:event_BCancelActionPerformed

    private void TFDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDateActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JTextField TFAppointment_code;
    private javax.swing.JTextField TFDate;
    private javax.swing.JTextField TFDoctor_code;
    private javax.swing.JTextField TFFollow_up_requiret;
    private javax.swing.JTextField TFPatient_code;
    private javax.swing.JTextField TFappointment_type;
    private javax.swing.JTextField TFtime;
    private javax.swing.JDialog jDialogInsertD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
