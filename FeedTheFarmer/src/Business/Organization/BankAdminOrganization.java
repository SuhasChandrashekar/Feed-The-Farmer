/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BankAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suhas
 */
public class BankAdminOrganization extends Organization{
    
    public BankAdminOrganization() {
        super(Organization.Type.BankAdminOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankAdminRole());
        return roles;
    }
}
