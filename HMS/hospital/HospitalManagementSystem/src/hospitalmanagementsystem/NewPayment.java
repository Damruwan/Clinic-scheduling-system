/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author AMSA Damruwan
 */
public class NewPayment extends javax.swing.JFrame {

    DBO dbo =new DBO();
    /**
     * Creates new form NewPayment
     */
    public NewPayment() {
        initComponents();
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
        payrf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SubmitPaymentDetails = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        paylcf = new javax.swing.JTextField();
        payrid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        payeadf = new javax.swing.JTextField();
        payff = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        payid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patient_age.setBackground(new java.awt.Color(204, 204, 255));
        patient_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Registration Fee");

        payrf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrfActionPerformed(evt);
            }
        });

        jLabel3.setText("Facilities Fee");

        SubmitPaymentDetails.setText("SUBMIT");
        SubmitPaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitPaymentDetailsActionPerformed(evt);
            }
        });

        jLabel12.setText("Leading Consultor's Fee");

        paylcf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paylcfActionPerformed(evt);
            }
        });

        payrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payridActionPerformed(evt);
            }
        });

        jLabel1.setText("Reg ID");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("New Payment");

        jLabel13.setText("Examin Another Doctor's Fee");

        payeadf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeadfActionPerformed(evt);
            }
        });

        payff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payffActionPerformed(evt);
            }
        });

        jLabel4.setText("Payment ID");

        javax.swing.GroupLayout patient_ageLayout = new javax.swing.GroupLayout(patient_age);
        patient_age.setLayout(patient_ageLayout);
        patient_ageLayout.setHorizontalGroup(
            patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_ageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(patient_ageLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paylcf, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(patient_ageLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(payeadf, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(patient_ageLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payrf, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(SubmitPaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(patient_ageLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payff, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(patient_ageLayout.createSequentialGroup()
                            .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(payrid, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(payid)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        patient_ageLayout.setVerticalGroup(
            patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_ageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(payid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payrid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payrf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payff, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paylcf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(48, 48, 48)
                .addGroup(patient_ageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeadf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(SubmitPaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payrfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payrfActionPerformed

    private void SubmitPaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitPaymentDetailsActionPerformed
        
       int x=0;
       while(x==0){  
        Payment PAY=new Payment();
        String s1=payid.getText();
        String s2=payrid.getText();
        String s3=payrf.getText();
        String s4=payff.getText();
        String s5=paylcf.getText();
        if(s1.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Payment ID");break;}else{PAY.setPaymentID(s1);}
        if(s2.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Patient ID");break;}else{PAY.setRegID(payrid.getText());}
        if(s3.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Registration fee");break;}else{PAY.setRegistrationFee(new Integer(s3).intValue());}
        if(s4.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Facilities Fee");break;}else{PAY.setFacilitiesFee(new Integer(s4).intValue());}
        if(s5.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Leading Consultant Fee");break;}else{PAY.setLeadingConsultantFee(new Integer(s5).intValue());}
        PAY.setExaminAnotherDoctorFee(new Integer(payeadf.getText()).intValue());
        PAY.setFullName(dbo.getName(PAY));
        PAY.setTotalTestFee(dbo.getAllTestAmount(PAY));
        PAY.setTotalTreatmentFee(dbo.getAllTreatmentAmount(PAY));
        if(dbo.addPayment(PAY)) {
            JOptionPane.showMessageDialog(this, "Successfully Inserted");
            clearFields();
            break;
        } else {
            JOptionPane.showMessageDialog(this, "Error while Inserting");
            clearFields();
            break;
        }
       
      }
      
    }//GEN-LAST:event_SubmitPaymentDetailsActionPerformed

    void clearFields() {
        payrid.setText("");
        payrf.setText("");
        payff.setText("");
        paylcf.setText("");
        payeadf.setText("");
        payid.setText("");
 
    }
    
    private void paylcfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paylcfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paylcfActionPerformed

    private void payridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payridActionPerformed

    private void payeadfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeadfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payeadfActionPerformed

    private void payffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payffActionPerformed

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
            java.util.logging.Logger.getLogger(NewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitPaymentDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel patient_age;
    private javax.swing.JTextField payeadf;
    private javax.swing.JTextField payff;
    private javax.swing.JTextField payid;
    private javax.swing.JTextField paylcf;
    private javax.swing.JTextField payrf;
    private javax.swing.JTextField payrid;
    // End of variables declaration//GEN-END:variables
}
