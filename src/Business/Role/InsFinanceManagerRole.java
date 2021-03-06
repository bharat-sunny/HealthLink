/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsFinanceOrganization;

import Business.Organization.InsPolicyPlannerOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.InsuranceFinanceOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsuranceFinanceRole.InsuranceFinanceWorkAreaJPanel;
import userinterface.InsurancePlannerRole.InsurancePlannerWorkAreaJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class InsFinanceManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (InsFinanceOrganization)organization, enterprise);
    }
    
}
