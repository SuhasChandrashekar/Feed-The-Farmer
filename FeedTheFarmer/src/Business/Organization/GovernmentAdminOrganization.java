/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.GovernmentAdminRole;
import java.util.ArrayList;

/**
 *
 * @author suhas
 */
public class GovernmentAdminOrganization extends Organization{
    public GovernmentAdminOrganization() {
        super(Organization.Type.SubsidyAdminOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
    
}
