/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author suhas
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin"),
        FarmerAssoicationAdminOrganization("Farmer Assoication Admin Organization"), 
        FarmerOrganization("Farmer Organization"),
        NGOAdminOrganization("NGO Admin Organization"),
        NGOOrganization("NGO Organization"),
        SubsidyAdminOrganization("Subsidy Admin Organization"),
        SubsidyManagerOrganization("Subsidy Manager Organization"),
        SubsidyBackgroundCheckOrganization("Subsidy Background-Check Organization"),
        BankAdminOrganization("Bank Admin Organization"),
        BankManagerOrganization("Bank Manager Organization"),
        BankBackgroundCheckOrganization("Bank Background-Check Organization"),
        MircofinanceInstitutionAdminOrganization("Mircofinance Institution Admin Organization"),
        MircofinanceManagerOrganization("Mircofinance Manager Organization"),
        MircofinanceBackgroundCheckOrganization("Mircofinance Background-Check kOrganization"),
        SupplierAdminOrganization("Supplier Admin Organization"),
        FertlizerSupplierOrganization("Fertlizer Supplier Organization"),
        SeedSupplierOrganization("Seed Supplier Organization"),
        EquipmentSupplierOrganization("Equipment Supplier Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
