/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AMSA Damruwan
 */
public class UpdatePayment extends javax.swing.JFrame {

    DBO dbo=new DBO();
    /**
     * Creates new form UpdatePayment
     */
    public UpdatePayment() {
        initComponents();
    }

    void setFields(Payment pay)  {
        vpn.setText(pay.getFullName());
        prid.setText(pay.getRegID());
        vprf.setText(new Integer(pay.getRegistrationFee()).toString());
        vpff.setText(new Integer(pay.getFacilitiesFee()).toString());
        vplcf.setText(new Integer(pay.getLeadingConsultantFee()).toString());
        vpeadf.setText(new Integer(pay.getExaminAnotherDoctorFee()).toString());
        vpttf.setText(new Integer(pay.getTotalTestFee()).toString());
        vpttrf.setText(new Integer(pay.getTotalTreatmentFee()).toString());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patient_age = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vprf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        vplcf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vpeadf = new javax.swing.JTextField();
        vpff = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vpttf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        vpttrf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        vpn = new javax.swing.JLabel();
        prid = new javax.swing.JLabel();
        UpdatePaymentDetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patient_age.setBackground(new java.awt.Color(204, 204, 255));
        patient_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Registration Fee");

        vprf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vprfActionPerformed(evt);
            }
        });

        jLabel3.setText("Facilities Fee");

        jLabel12.setText("Leading Consultor's Fee");

        vplcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vplcfActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Update Payment");

        jLabel13.setText("Examin Another Doctor's Fee");

        vpeadf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpeadfActionPerformed(evt);
            }
        });

        vpff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpffActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Test Fee");

        vpttf.setEditable(false);
        vpttf.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Total Treatment Fee");

        vpttrf.setEditable(false);
        vpttrf.setBackground(new java.awt.Color(255, 255, 255));

        vpn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpn.setText("Name");

        prid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        prid.setText("Reg ID");

        UpdatePaymentDetails.setText("UPDATE");
        UpdatePaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePaymentDetailsActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patient_ageLayout = new javax.swing.GroupLayout(patient_age);
        patient_age.setLayout(patient_ageLayout);
        patient_ageLayout.setHorizontalGroup(
            patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_ageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdatePaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patient_ageLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patient_ageLayout.createSequentialGroup()
                                .addComponent(prid)
                                .addGap(50, 50, 50)
                                .addComponent(vpn, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patient_ageLayout.createSequentialGroup()
                                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_ageLayout.createSequentialGroup()
                                        .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jButton1))
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_ageLayout.createSequentialGroup()
                                        .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vpttrf, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vpttf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                        .addComponent(vpeadf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vplcf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vpff, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vprf, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        patient_ageLayout.setVerticalGroup(
            patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_ageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vpn)
                    .addComponent(prid))
                .addGap(40, 40, 40)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vprf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vpff, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vplcf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(48, 48, 48)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vpeadf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vpttf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vpttrf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdatePaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patient_age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vprfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vprfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vprfActionPerformed

    private void vplcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vplcfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vplcfActionPerformed

    private void vpeadfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpeadfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpeadfActionPerformed

    private void vpffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpffActionPerformed

    private void UpdatePaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePaymentDetailsActionPerformed
        Payment PAY=new Payment();
        PAY.setRegID(prid.getText());
        PAY.setRegistrationFee(new Integer(vprf.getText()).intValue());
        PAY.setFacilitiesFee(new Integer(vpff.getText()).intValue());
        PAY.setLeadingConsultantFee(new Integer(vplcf.getText()).intValue());
        PAY.setExaminAnotherDoctorFee(new Integer(vpeadf.getText()).intValue());
        PAY.setTotalTestFee(dbo.getAllTestAmount(PAY));
        PAY.setTotalTreatmentFee(dbo.getAllTreatmentAmount(PAY));
        if(dbo.updatePayment(PAY)) {
            JOptionPane.showMessageDialog(this, "Successfully Updated");
            this.dispose();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Error while Updating");
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
        }
    }//GEN-LAST:event_UpdatePaymentDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdatePaymentDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel patient_age;
    private javax.swing.JLabel prid;
    private javax.swing.JTextField vpeadf;
    private javax.swing.JTextField vpff;
    private javax.swing.JTextField vplcf;
    private javax.swing.JLabel vpn;
    private javax.swing.JTextField vprf;
    private javax.swing.JTextField vpttf;
    private javax.swing.JTextField vpttrf;
    // End of variables declaration//GEN-END:variables
}
