/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AccountantOrganization;
import Business.Organization.HealthOfficerOrganization;
import Business.Organization.Organization;
import Business.Organization.SecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountantBillingRequest;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.PatientVisitWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shesh Narayan
 */
public class RequestBillingJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PatientVisitWorkRequest patientTreatmentWorkRequest;
    private EcoSystem ecoSystem;
    private double consultationCharges = 50;

    /**
     * Creates new form RequestBillingJPanel
     */
    RequestBillingJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientVisitWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.patientTreatmentWorkRequest = workRequest;
        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAssignedDoctor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConsultationCharges = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMedicationCharges = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLabCharges = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMiscellaneousCharges = new javax.swing.JTextField();
        btnSendBillingRequest = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 154, 115));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Billing Request");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PATIENT INFORMATION");

        txtFirstName.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name :");

        txtLastName.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Assigned Doctor :");

        txtAssignedDoctor.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Id:");

        txtPatientId.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BILLING INFORMATION");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultaion Charges (USD) :");

        txtConsultationCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultationChargesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Medication Charges (USD):");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lab Test Charges (USD) :");

        txtLabCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabChargesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Miscellaneous Charges (USD):");

        btnSendBillingRequest.setBackground(new java.awt.Color(255, 204, 51));
        btnSendBillingRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendBillingRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/send_queue.png"))); // NOI18N
        btnSendBillingRequest.setText("Send Billing Request");
        btnSendBillingRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendBillingRequestActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 204, 51));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backBtn)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAssignedDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btnSendBillingRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(txtConsultationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLabCharges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMedicationCharges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMiscellaneousCharges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel3)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAssignedDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConsultationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiscellaneousCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addComponent(btnSendBillingRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLabChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabChargesActionPerformed

    private void txtConsultationChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultationChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultationChargesActionPerformed

    private void btnSendBillingRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendBillingRequestActionPerformed
        String consultationCharge = txtConsultationCharges.getText().trim();
        String labChargesStr = txtLabCharges.getText();
        String miscellaneouschargesStr = txtMiscellaneousCharges.getText();
        String medicationChargesStr = txtMedicationCharges.getText();
        if (consultationCharge.equals("") || labChargesStr.equals("") || miscellaneouschargesStr.equals("") || medicationChargesStr.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            
            try {
                Double.parseDouble(consultationCharge);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide a Numeric value for Consultation Charges");
                return;
            }
            
            try {
                Integer.parseInt(labChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Lab Charges");
                return;
            }
            try {
                Integer.parseInt(miscellaneouschargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Miscellaneous charges");
                return;
            }
            try {
                Integer.parseInt(medicationChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Medication charges");
                return;
            }
            double labCharges = Double.parseDouble(labChargesStr);
            double miscellaneouscharges = Double.parseDouble(miscellaneouschargesStr);
            double medicationCharges = Double.parseDouble(medicationChargesStr);
            double billingAmount = labCharges + consultationCharges + medicationCharges + miscellaneouscharges;
            //request.setBillAmount(billingAmount);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setStatus("Consultation Completed");
                patientTreatmentWorkRequest.setBillAmount(billingAmount);

                AccountantBillingRequest accountantBillingRequest = new AccountantBillingRequest();
                accountantBillingRequest.setBillingAmount(billingAmount);

                accountantBillingRequest.setSender(userAccount);
                accountantBillingRequest.setStatus("Sent");
                accountantBillingRequest.setPatient(patientTreatmentWorkRequest.getPatient());
                accountantBillingRequest.setVisitRequest(patientTreatmentWorkRequest);

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                    if (organization instanceof AccountantOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(accountantBillingRequest);
                    userAccount.getWorkQueue().getWorkRequests().add(accountantBillingRequest);
                }

                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                btnSendBillingRequest.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btnSendBillingRequestActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnSendBillingRequest;
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
    private javax.swing.JTextField txtAssignedDoctor;
    private javax.swing.JTextField txtConsultationCharges;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLabCharges;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMedicationCharges;
    private javax.swing.JTextField txtMiscellaneousCharges;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        txtFirstName.setText(patientTreatmentWorkRequest.getPatient().getPatientFirstName());
        txtLastName.setText(patientTreatmentWorkRequest.getPatient().getPatientLastName());
        txtPatientId.setText(String.valueOf(patientTreatmentWorkRequest.getPatient().getPatientId()));
        txtAssignedDoctor.setText(patientTreatmentWorkRequest.getAssignedDoctor().getEmployee().getName());
        txtConsultationCharges.setText(String.valueOf(consultationCharges));

    }
}
