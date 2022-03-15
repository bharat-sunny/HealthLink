/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmaTransportRole;

import userinterface.GovernmentTreasurerRole.*;
import Business.Enterprise.Enterprise;
import Business.Map.MapViewer;
import Business.Map.SMS;
import Business.Map.SendEmail;
import Business.Order.ItemList;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Shesh Narayan
 */
public class TransportProcessRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private OrderWorkRequest orderItemRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public TransportProcessRequestJPanel(JPanel jPanel, OrderWorkRequest fundRequest) {
        initComponents();
        this.jPanel = jPanel;
        this.orderItemRequest = fundRequest;
        amountTxt.setText(String.valueOf(orderItemRequest.getOrder().getAmount()));
        locationTxt.setText(orderItemRequest.getReasonForVisit());
        populationTxt.setText(String.valueOf(orderItemRequest.getOrderMessage()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        populationTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mapButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 154, 115));

        submitJButton.setBackground(new java.awt.Color(255, 204, 51));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/yes.png"))); // NOI18N
        submitJButton.setText("Deliver");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 204, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 204, 51));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/no.png"))); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Delivery Message");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        locationTxt.setEnabled(false);

        populationTxt.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Order Message");

        amountTxt.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transport Work Area");

        mapButton.setBackground(new java.awt.Color(255, 204, 51));
        mapButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mapButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/direction.png"))); // NOI18N
        mapButton.setText("View Directions");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addGap(5, 5, 5)
                .addComponent(mapButton)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mapButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        submitJButton.setEnabled(true);
        String message = messageTxt.getText();
        String sub = "Your Order is delivered";
        String odrderDtl = "Order Details\n*************************************************\n";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        }
        else
        {
        orderItemRequest.setMessage(message);
         int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
         if (dialogResult == JOptionPane.YES_OPTION) {
        orderItemRequest.setStatus("Accepted");
        try{
                    
                    List<ItemList> itm = orderItemRequest.getOrder().getItems();
                    for(ItemList i:itm)
                    {
                        odrderDtl=odrderDtl+"Item: "+i.getItem()+" , Quantity: "+i.getQuantity()+", Item Price: $"+i.getTotal()+"\n";
                    }
                    odrderDtl = odrderDtl+"*************************************************\n";
                    odrderDtl=odrderDtl+"\n\nTotal Price: $"+orderItemRequest.getOrder().getAmount();
                SendEmail.send(orderItemRequest.getHospitalAdmin().getEmployee().getEmail(),"\nHi "+orderItemRequest.getHospitalAdmin().getEmployee().getName()+","+"\n\nYour Order# "+ orderItemRequest.getOrder().getNumber()+
                        " is delivered by: "+orderItemRequest.getReceiver().getEmployee().getName()
                +"\n\n\n\n"+odrderDtl+"\n\nThanks,\n",sub);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+orderItemRequest.getHospitalAdmin().getEmployee().getName()+","+"\nYour order# : "+orderItemRequest.getOrder().getNumber()+" is delivered!"+
                        "\n\nThanks");
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
        JOptionPane.showMessageDialog(null, "Order Delivered Successfully!!!");
        submitJButton.setEnabled(false);
        messageTxt.setText("");
        btnReject.setEnabled(false);
        }
         messageTxt.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransportWorkAreaJPanel dwjp = (TransportWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        String message = messageTxt.getText();
        String sub = "Your Order is Rejected";
        String odrderDtl = "Order Details\n*************************************************\n";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
        orderItemRequest.setMessage(message);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
        orderItemRequest.setStatus("Rejected");
        try{
                    
                    List<ItemList> itm = orderItemRequest.getOrder().getItems();
                    for(ItemList i:itm)
                    {
                        odrderDtl=odrderDtl+"Item: "+i.getItem()+" , Quantity: "+i.getQuantity()+", Item Price: $"+i.getTotal()+"\n";
                    }
                    odrderDtl = odrderDtl+"*************************************************\n";
                    odrderDtl=odrderDtl+"\n\nTotal Price: $"+orderItemRequest.getOrder().getAmount();
                SendEmail.send(orderItemRequest.getHospitalAdmin().getEmployee().getEmail(),"\nHi "+orderItemRequest.getHospitalAdmin().getEmployee().getName()+","+"\n\nYour Order# "+ orderItemRequest.getOrder().getNumber()+
                        " is Rejected by: "+orderItemRequest.getReceiver().getEmployee().getName()+"\nMessage: "+message
                +"\n\n\n\n"+odrderDtl+"\n\nThanks,\n",sub);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+orderItemRequest.getHospitalAdmin().getEmployee().getName()+","+"\nYour order# : "+orderItemRequest.getOrder().getNumber()+" is rejected\nMessage: "+message+
                        "\n\nThanks");
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
         messageTxt.setText("");
            btnReject.setEnabled(false);
            submitJButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Rejected");
        }
         messageTxt.setText("");   
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        // TODO add your handling code here:
        if (locationTxt.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Enter address first");  
        }else{
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MapViewer browser = new MapViewer();
                browser.setVisible(true);
                browser.loadURL("https://www.google.com/maps/dir/?api=1&destination="+locationTxt.getText().trim());
            }
        });
        }
    }//GEN-LAST:event_mapButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JButton mapButton;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JTextField populationTxt;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
