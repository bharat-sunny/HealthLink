/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientVisitWorkRequest;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shesh Narayan
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PatientVisitWorkRequest request;

    /**
     * Creates new form ViewPatientJPanel
     */

    ViewPatientJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientVisitWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHomePhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrescription = new javax.swing.JTextArea();
        txtPatientId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMedicalCondition = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        personImageLabels = new javax.swing.JLabel();

        setBackground(new java.awt.Color(77, 154, 115));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHomePhone.setEditable(false);
        txtHomePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomePhoneActionPerformed(evt);
            }
        });
        add(txtHomePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 176, 128, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PATIENT INFORMATION");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 69, 146, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Home phone No :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 177, -1, -1));

        txtFirstName.setEditable(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 102, 123, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 103, -1, -1));

        jScrollPane1.setEnabled(false);

        txtAddress.setEditable(false);
        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 213, 385, 58));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 213, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENT DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 11, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 103, -1, -1));

        txtLastName.setEditable(false);
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 102, 131, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 139, 134, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Age :");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Medical Condition");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 302, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prescription :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 361, -1, -1));

        txtPrescription.setEditable(false);
        txtPrescription.setColumns(20);
        txtPrescription.setRows(5);
        jScrollPane2.setViewportView(txtPrescription);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 338, 389, 55));

        txtPatientId.setEditable(false);
        add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 139, 128, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Patient ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 140, -1, -1));

        txtMedicalCondition.setEditable(false);
        add(txtMedicalCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 301, 160, -1));

        backJButton.setBackground(new java.awt.Color(255, 204, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/view.png"))); // NOI18N
        jButton1.setText("View Diagnosis codes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 426, -1, -1));
        add(personImageLabels, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void txtHomePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomePhoneActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
//        dwjp.populateTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String filePath = "ICD.xlsx";
        Desktop dt = Desktop.getDesktop();
        
        try{
        dt.open(new File(filePath));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot open file due to technical issue");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel personImageLabels;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHomePhone;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMedicalCondition;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextArea txtPrescription;
    // End of variables declaration//GEN-END:variables

    private void populate() {

        txtFirstName.setText(request.getPatient().getPatientFirstName());
        txtLastName.setText(request.getPatient().getPatientLastName());
        txtPatientId.setText(String.valueOf(request.getPatient().getPatientId()));
        txtAddress.setText(request.getPatient().getAddress());
        txtHomePhone.setText(request.getPatient().getPhoneNumber());
        txtAge.setText(String.valueOf(request.getPatient().getAge()));
        txtMedicalCondition.setText(request.getReasonForVisit());
        txtPrescription.setText(request.getPrescription());
        
        String Path;
        Path = txtPatientId.getText()+".jpg";
        ImageIcon icon = new ImageIcon(Path);
        Image img = icon.getImage();
        Image imagescaled = img.getScaledInstance(130,120,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imagescaled);
        personImageLabels.setIcon(scaledIcon);
        
    }
}