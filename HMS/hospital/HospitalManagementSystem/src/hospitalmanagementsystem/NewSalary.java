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
public class NewSalary extends javax.swing.JFrame {

    DBO dbo =new DBO();
    /**
     * Creates new form NewSalary
     */
    public NewSalary() {
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

        ddpdoby = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nsp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nseid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nsy = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nsm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        nsnooth = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nsrpd = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nsnoa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nsotrph = new javax.swing.JComboBox<>();
        SubmitSalary = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();

        ddpdoby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993" }));
        ddpdoby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddpdobyActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("New Salary");

        jLabel2.setText("Post");

        nsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "MaintenanceStaff" }));

        jLabel3.setText("Employee ID");

        nseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nseidActionPerformed(evt);
            }
        });

        jLabel4.setText("Year");

        nsy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993" }));
        nsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsyActionPerformed(evt);
            }
        });

        jLabel5.setText("Month");

        nsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        nsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsmActionPerformed(evt);
            }
        });

        jLabel6.setText("Number Of Attendance");

        nsnooth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", " " }));
        nsnooth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsnoothActionPerformed(evt);
            }
        });

        jLabel7.setText("Salory Rate Per Day");

        nsrpd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "600", "400" }));

        jLabel8.setText("Number Of OT Hours");

        nsnoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        nsnoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsnoaActionPerformed(evt);
            }
        });

        jLabel9.setText("OT Rate Per Hour");

        nsotrph.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200", "150", "100" }));

        SubmitSalary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        SubmitSalary.setText("SUBMIT");
        SubmitSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitSalaryActionPerformed(evt);
            }
        });

        jLabel10.setText("Salary ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nsnoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nsnooth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nsrpd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nsotrph, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubmitSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nsm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nsy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nseid)
                            .addComponent(nsp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nseid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nsy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsnoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsrpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsnooth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsotrph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addComponent(SubmitSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nseidActionPerformed

    private void ddpdobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddpdobyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddpdobyActionPerformed

    private void nsyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsyActionPerformed

    private void nsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsmActionPerformed

    private void nsnoothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsnoothActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsnoothActionPerformed

    private void nsnoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsnoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsnoaActionPerformed

    private void SubmitSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitSalaryActionPerformed
        
       int x=0;
       while(x==0){  
        Salary S=new Salary();
        String s1=sid.getText();
        String s2=nseid.getText();
        if(s1.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Salary ID");break;}else{S.setSalaryID(s1);}
        if(s2.isEmpty()){JOptionPane.showMessageDialog(this, "Please Enter Employee ID");break;}else{S.setEmpID(s2);}
        S.setPost(nsp.getSelectedItem().toString());
        S.setYear(new Integer(nsy.getSelectedItem().toString()).intValue());
        S.setMonth(nsm.getSelectedItem().toString());
        S.setNumberOfAttendance(new Integer(nsnoa.getSelectedItem().toString()).intValue());
        S.setSalaryRatePerDay(new Integer(nsrpd.getSelectedItem().toString()).intValue());
        S.setNumberOfOTHours(new Integer(nsnooth.getSelectedItem().toString()).intValue());
        S.setOTRatePerHour(new Integer(nsotrph.getSelectedItem().toString()).intValue());
        S.setTotal(((new Integer(nsnoa.getSelectedItem().toString()).intValue())*(new Integer(nsrpd.getSelectedItem().toString()).intValue()))+((new Integer(nsnooth.getSelectedItem().toString()).intValue())*(new Integer(nsotrph.getSelectedItem().toString()).intValue())));
        if(dbo.addSalary(S)) {
            JOptionPane.showMessageDialog(this, "Successfully Inserted");
            clearFields();
            break;
        } else {
            JOptionPane.showMessageDialog(this, "Error while Inserting");
            clearFields();
            break;
        }
   
      }
      
    }//GEN-LAST:event_SubmitSalaryActionPerformed

    void clearFields() {
        nseid.setText("");
        sid.setText("");
       
    }
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
            java.util.logging.Logger.getLogger(NewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitSalary;
    private javax.swing.JComboBox<String> ddpdoby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nseid;
    private javax.swing.JComboBox<String> nsm;
    private javax.swing.JComboBox<String> nsnoa;
    private javax.swing.JComboBox<String> nsnooth;
    private javax.swing.JComboBox<String> nsotrph;
    private javax.swing.JComboBox<String> nsp;
    private javax.swing.JComboBox<String> nsrpd;
    private javax.swing.JComboBox<String> nsy;
    private javax.swing.JTextField sid;
    // End of variables declaration//GEN-END:variables
}
