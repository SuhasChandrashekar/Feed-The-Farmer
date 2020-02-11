/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author suhas
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.FarmerAssoicationAdminOrganization.getValue())){
            organization = new FarmerAssoicationAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FarmerOrganization.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.NGOAdminOrganization.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.NGOOrganization.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SubsidyAdminOrganization.getValue())){
            organization = new GovernmentAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SubsidyManagerOrganization.getValue())){
            organization = new SubsidyManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SubsidyBackgroundCheckOrganization.getValue())){
            organization = new SubsidyBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankAdminOrganization.getValue())){
            organization = new BankAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankManagerOrganization.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankBackgroundCheckOrganization.getValue())){
            organization = new BankBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MircofinanceInstitutionAdminOrganization.getValue())){
            organization = new MircofinanceInstitutionAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MircofinanceManagerOrganization.getValue())){
            organization = new MircofinanceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MircofinanceBackgroundCheckOrganization.getValue())){
            organization = new MircofinanceBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SupplierAdminOrganization.getValue())){
            organization = new SupplierAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FertlizerSupplierOrganization.getValue())){
            organization = new FertlizerSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SeedSupplierOrganization.getValue())){
            organization = new SeedSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EquipmentSupplierOrganization.getValue())){
            organization = new EquipmentSupplierOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
