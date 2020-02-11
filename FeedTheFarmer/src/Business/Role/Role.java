/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author suhas
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        BankAdminRole("Bank Admin"),
        BankBackgroundCheckRole("Bank Background-Check Role"),
        BankManagerRole("BankManager Role"),
        EquipmentSupplierRole("Equipment Supplier Role"),
        FarmerAssoicationAdminRole("Farmer Assoication Admin Role"),
        FarmerRole("Farmer Assoication Admin Role"),
        FertlizerSupplierRole("Fertlizer Supplier Role"),
        MircofinanceBackgroundCheckRole("Mircofinance Background-Check Role"),
        MircofinanceInstitutionAdminRole("Mircofinance Institution Admin Role"),
        MircofinanceManagerRole("Mircofinance Manager Role"),
        NGOAdminRole("NGO Admin Role"),
        NGORole("NGO Role"),
        SeedSupplierRole("Seed Supplier Role"),
        SubsidyAdminRole("Subsidy Admin Role"),
        SubsidyBackgroundCheckRole("Subsidy Background-Check Role"),
        SubsidyManagerRole("Subsidy Manager Role"),
        SupplierAdminRole("Supplier Admin Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
