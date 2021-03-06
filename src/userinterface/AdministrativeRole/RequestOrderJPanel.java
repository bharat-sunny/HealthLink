/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthCenterEnterprise;
import Business.Enterprise.PharmaEnterprise;
import Business.Map.SMS;

import Business.Order.ItemList;
import Business.Order.Order;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.Map.SendEmail;
import Business.Network.Network;
import Business.Organization.HealthOfficerOrganization;
import Business.Organization.ManagerOrganization;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shesh Narayan
 */
public class RequestOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private OrderWorkRequest orderTreatmentWorkRequest;
    private List<ItemList> items ;
    private EcoSystem ecosystem;
    ArrayList<String> names = new ArrayList<>();
    String pharmaname;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestOrderJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.orderTreatmentWorkRequest = new OrderWorkRequest();
        this.items = new ArrayList<ItemList>();
        this.ecosystem = ecoSystem;
        valueLabel.setText(enterprise.getName());
        requestTestJButton.setEnabled(true);
        priceTextField.setText("0.0");
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

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLabMessage = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 154, 115));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 204, 0));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/yes.png"))); // NOI18N
        requestTestJButton.setText("Place Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 70, -1));

        txtLabMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabMessageActionPerformed(evt);
            }
        });
        add(txtLabMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 30));

        backJButton.setBackground(new java.awt.Color(255, 204, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 130, 20));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Final Order ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        orderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        orderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboActionPerformed(evt);
            }
        });
        add(orderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 130, -1));

        menuTable.setBackground(new java.awt.Color(204, 255, 153));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mienu Item", "Item Price", "Pharmacy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 140));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        priceTextField.setEditable(false);
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 130, 30));

        orderTable.setBackground(new java.awt.Color(204, 255, 153));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Order Menu");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        addItemButton.setBackground(new java.awt.Color(255, 204, 0));
        addItemButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/add.png"))); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 130, 30));

        removeItemButton.setBackground(new java.awt.Color(255, 204, 0));
        removeItemButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        removeItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/remove.png"))); // NOI18N
        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });
        add(removeItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 140, 30));

        viewButton.setBackground(new java.awt.Color(255, 204, 0));
        viewButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/view.png"))); // NOI18N
        viewButton.setText("Vew All Orders");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        
        String message = txtLabMessage.getText().trim();
        
        String labType ="" ;//= orderCombo.getSelectedItem().toString();
        
        int selectedRow = menuTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
            for(ItemList itm: items)
            {
                labType = labType+" "+itm.getItem();
            
            }
        }

        if (labType.equals("")) {
            JOptionPane.showMessageDialog(null, "At least one Order is mandatory!");
            return;
        }
       
        
        Order order = new Order();
        
        order.setItem(labType);
        order.setCustomerRole(userAccount);
        order.setDeliveryRole(null);
        order.setAmount(Double.parseDouble(priceTextField.getText()));
        order.setItems(items);
        
        HealthCenterEnterprise res = (HealthCenterEnterprise) enterprise;
        res.getOrderDirectory().addOrder(order);
        orderTreatmentWorkRequest.setOrderMessage(message);
        orderTreatmentWorkRequest.setSender(userAccount);
        orderTreatmentWorkRequest.setStatus("Sent to Pharma");
        orderTreatmentWorkRequest.setReceiver(null);
        orderTreatmentWorkRequest.setOrder(order);
        orderTreatmentWorkRequest.setReasonForVisit(res.getAddress());
        orderTreatmentWorkRequest.setBillAmount(Double.parseDouble(priceTextField.getText()));
        orderTreatmentWorkRequest.setHospitalAdmin(userAccount);
        Organization org = null;

            List<Network> networks = ecosystem.getNetworks();
            int zip = enterprise.getZipcode();
            //Find managerorganization in same Network
            PharmaEnterprise matchedphrma = null;

            for (Network network : networks) {
                if(network.getZip()==zip)
                    {
                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enter : enterprises) {
                    if (enter instanceof PharmaEnterprise) {
                        if(enter.getName().equals(pharmaname))
                        {
                          matchedphrma =  (PharmaEnterprise) enter; 
                        }
                        }
                    }
                }
            }
                    //PharmaEnterprise pharma = (PharmaEnterprise) enter;
                    //pharma.getOrderDirectory().addOrder(order);
                    List<Organization> organizations = matchedphrma.getOrganizationDirectory().getOrganizations();
                    for (Organization organization : organizations) {
                        if (organization instanceof ManagerOrganization) {
                            org = organization;
                            break;
                            }
                           }
                        
        if (org != null) {
            org.getWorkQueue().getWorkRequests().add(orderTreatmentWorkRequest);
            userAccount.getWorkQueue().getWorkRequests().add(orderTreatmentWorkRequest);
            
            txtLabMessage.setText("");
            //orderJtext.setText("");
            requestTestJButton.setEnabled(false);
            //send email for order placed
            String sub = "Your Order is placed";
            String odrderDtl = "Order Details\n*************************************************\n";
            try{
                    
                    List<ItemList> itm = orderTreatmentWorkRequest.getOrder().getItems();
                    for(ItemList i:itm)
                    {
                        odrderDtl=odrderDtl+"Item: "+i.getItem()+" , Quantity: "+i.getQuantity()+", Item Price: $"+i.getTotal()+"\n";
                    }
                    odrderDtl = odrderDtl+"*************************************************\n";
                    odrderDtl=odrderDtl+"\n\nTotal Price: $"+orderTreatmentWorkRequest.getOrder().getAmount();
                    SendEmail.send(res.getEmail(),"\nHi "+res.getName()+","+"\n\nYour Order# "+ orderTreatmentWorkRequest.getOrder().getNumber()+
                        " is placed "
                +"\n\n\n\n"+odrderDtl+"\n\nThanks,\n"+pharmaname+" Team",sub);
                //SendEmail.send("shesh.cool@gmail.com ","Shesh"+","+"\n\nYour Order# "+ orderTreatmentWorkRequest.getOrder().getNumber()+" is placed ",sub);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
            //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+orderTreatmentWorkRequest.getHospitalAdmin().getEmployee().getName()+","+"\nYour order# : "+orderTreatmentWorkRequest.getOrder().getNumber()+" is placed"+
                        "\n\nThanks,\n"+pharmaname+" Team");
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
         JOptionPane.showMessageDialog(null, "Order Placed");
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtLabMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabMessageActionPerformed

    private void orderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboActionPerformed
        // TODO add your handling code here:
        /*int selectedRow = menuTable.getSelectedRow();
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            itemtotal = (Double) menuTable.getValueAt(selectedRow, 1)*Double.parseDouble(orderCombo.getSelectedItem().toString());
            priceTextField.setText(String.valueOf(total+itemtotal));
            
        }*/
    }//GEN-LAST:event_orderComboActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
                
        String labType ="" ;//= orderCombo.getSelectedItem().toString();
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        ItemList newitem = new ItemList();
        //ArrayList<String> names = new ArrayList<>();
        int selectedRow = menuTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to add item", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(!(names.isEmpty())&&!(menuTable.getValueAt(selectedRow, 2).toString().equals(names.get(0))))
        {
           JOptionPane.showMessageDialog(null, "Please order from one pharmacy only", "Warning!", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        else{
            labType = (String) menuTable.getValueAt(selectedRow, 0);
            itemtotal = (Double) menuTable.getValueAt(selectedRow, 1)*Double.parseDouble(orderCombo.getSelectedItem().toString());
            newitem.setItem(labType);
            newitem.setPrice((Double) menuTable.getValueAt(selectedRow, 1));
            newitem.setTotal(itemtotal);
            newitem.setQuantity(Double.parseDouble(orderCombo.getSelectedItem().toString()));
            items.add(newitem);
            priceTextField.setText(String.valueOf(total+itemtotal));
            names.add(menuTable.getValueAt(selectedRow, 2).toString());
            pharmaname=menuTable.getValueAt(selectedRow, 2).toString();
            populateItemTable();
            
        }

        
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            
            itemtotal=(Double)orderTable.getValueAt(selectedRow, 3);
            items.remove(orderTable.getValueAt(selectedRow, 0));
            priceTextField.setText(String.valueOf(total-itemtotal));
            if (items.isEmpty())
            {
                names.clear();
            }
            populateItemTable();
        }
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        ViewAllOrderJPanel viewallJPanel = new ViewAllOrderJPanel(userProcessContainer, enterprise, userAccount, ecosystem);
        userProcessContainer.add("viewJPanel", viewallJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JComboBox<String> orderCombo;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtLabMessage;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        Organization org = null;
        PharmaEnterprise restaurant = null;
        HashMap menuItem;
        int rowcount=0;
        List<Network> networks = ecosystem.getNetworks();
            int zip = enterprise.getZipcode();
            //
            Object[] row = new Object[3];
            for (Network network : networks) {
                if(network.getZip()==zip)
                    {
                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enter : enterprises) {
                    
                    
                        if (enter instanceof PharmaEnterprise) {
                            restaurant = (PharmaEnterprise) enter;
                            menuItem = restaurant.getMenu();
                            model.setRowCount(rowcount);

                            for (Object i: menuItem.keySet()) {
                                //Object[] row = new Object[2];
                                row[0] = i;
                                row[1] = menuItem.get(i);
                                row[2] = restaurant.getName();

                                model.addRow(row);
                                rowcount++;
                            }
                        }
                        restaurant = null;
                    }
                }
            }
        
    }
    private void populateItemTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);

        for (ItemList itm: items) {
            Object[] row = new Object[4];
            row[0] = itm;
            row[1] = itm.getPrice();
            row[2] = itm.getQuantity();
            row[3] = itm.getTotal();

            model.addRow(row);
        }
    }
}


