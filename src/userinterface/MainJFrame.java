/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shesh Narayan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
       
        initComponents();
        ecosystem = dB4OUtil.retrieveSystem();
        
        this.setSize(1300, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        imageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(77, 154, 115));
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);

        loginJButton.setBackground(new java.awt.Color(255, 153, 0));
        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/login.png"))); // NOI18N
        loginJButton.setText("Login");
        loginJButton.setDisabledIcon(null);
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        usernameJLabel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        usernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/user.png"))); // NOI18N
        usernameJLabel.setText("User Name");

        passwordJLabel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        passwordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/padlock.png"))); // NOI18N
        passwordJLabel.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(255, 0, 51));
        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/logout.png"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setDisabledIcon(null);
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/Logo_health_link.PNG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(loginJLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(usernameJLabel)
                        .addComponent(passwordJLabel)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(loginJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(loginJLabel)
                .addGap(50, 50, 50)
                .addComponent(usernameJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginJButton)
                .addGap(85, 85, 85)
                .addComponent(logoutJButton)
                .addContainerGap(794, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/healthcare.jpg"))); // NOI18N
        container.add(imageLbl, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        imageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/logout_pic.png"))); // NOI18N
        imageLbl.setMaximumSize(new java.awt.Dimension(1300, 750));
        imageLbl.setMinimumSize(new java.awt.Dimension(1300, 750));
        blankJP.add(imageLbl, "card2");
        imageLbl.getAccessibleContext().setAccessibleName("imgLbl");
        
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=ecosystem.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:ecosystem.getNetworks()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizations()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            
            JOptionPane.showMessageDialog(null, "Invalid credentials");

            return;
        }
        else{
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            
            passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, ecosystem));
            layout.next(container);
        }

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed


    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    public javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField userNameJTextField;
    public javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
