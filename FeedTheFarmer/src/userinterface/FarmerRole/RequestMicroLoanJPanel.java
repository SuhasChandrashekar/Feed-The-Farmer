/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MicrofinanceInstitutionEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MicroLoanWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestMicroLoanJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestMicroLoanJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        nameJTextField.setText(userAccount.getUsername());
        populateBankComboBox();
    }
    
     private void populateBankComboBox(){
        jComboBox1.removeAllItems();
         for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof MicrofinanceInstitutionEnterprise) {
                    jComboBox1.addItem(enterprise.getName());
                }
             }
        }
    }
     
      private boolean verifyEmailId(String email){
         Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;
     }
     
      private boolean verifyPhoneNumber(String phone){
         Pattern p = Pattern.compile("[0-9]{10,10}");
        Matcher m = p.matcher(phone);
        boolean b = m.matches();
        return b;
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
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loanAmountJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailIdJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        phoneNoJTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panCardPathJTextField = new javax.swing.JTextField();
        panUploadjButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Micro-Loan");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        nameJTextField.setEditable(false);
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 89, -1));

        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 89, -1));

        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 89, -1));

        jLabel5.setText("Microfinance Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setText("Loan Amount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));
        add(loanAmountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 89, -1));

        jLabel12.setText("Email Id");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        add(emailIdJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 89, -1));

        jLabel13.setText("Phone No.");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));
        add(phoneNoJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 89, -1));

        jLabel8.setText("Pan Card/ID");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        panCardPathJTextField.setEditable(false);
        add(panCardPathJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 89, -1));

        panUploadjButton.setText("Upload");
        panUploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panUploadjButtonActionPerformed(evt);
            }
        });
        add(panUploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 89, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        
        String address = addressJTextField.getText();
        String bankName = (String)jComboBox1.getSelectedItem();
        String emailId = emailIdJTextField.getText();
        String fn=panCardPathJTextField.getText();
        String message = messageJTextField.getText();
        String name = nameJTextField.getText();
        
        if(address.equals("")||bankName.equals("")||emailId.equals(""))
        {
             JOptionPane.showMessageDialog(null, "EmailId, Address are mandatory");
            return;
        }
        
        int age=0;
        
        try{
               age = Integer.parseInt(ageJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for age");
                return;
            }
        
        int loanAmount = 0;
        try{
               loanAmount = Integer.parseInt(loanAmountJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for Loan Amount");
                return;
            }
        
        if(!verifyEmailId(emailId)){
             JOptionPane.showMessageDialog(null,"Please enter proper email id","ERROR",JOptionPane.ERROR_MESSAGE);
             return;
        }
        long phoneNo=0;
        try{
               phoneNo = Long.parseLong(phoneNoJTextField1.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for Phone Number");
                return;
            }
        if(!verifyPhoneNumber(phoneNoJTextField1.getText())){
             JOptionPane.showMessageDialog(null,"Please enter proper phone number","ERROR",JOptionPane.ERROR_MESSAGE);
             return;
        } 
        
        MicroLoanWorkRequest request = new MicroLoanWorkRequest();
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setAge(age);
        request.setAddress(address);
        request.setBankName(bankName);
        request.setEmailId(emailId);
        request.setPhoneNo(phoneNo);
        request.setMessage(message);
        request.setLoanAmount(loanAmount);
        request.setName(name);
        
        if(!fn.isEmpty())
        {
        if(fn.endsWith(".pdf")||fn.endsWith(".docx"))
        {
           request.setPancardPath(fn);
        }
         else
           JOptionPane.showMessageDialog(null,"Please upload the Id in correct format","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null,"Please upload the Id","ERROR",JOptionPane.ERROR_MESSAGE);
        
        
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getName().equalsIgnoreCase(bankName)){
                if (enterprise instanceof MicrofinanceInstitutionEnterprise) {
                            org = enterprise;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;
                       
                }

            }}
        }
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel dwjp = (FarmerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void panUploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panUploadjButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser jc=new JFileChooser();
        jc.showOpenDialog(null);
        File f=jc.getSelectedFile();
        String filename=f.getAbsolutePath();
        panCardPathJTextField.setText(filename);
    }//GEN-LAST:event_panUploadjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField loanAmountJTextField;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField panCardPathJTextField;
    private javax.swing.JButton panUploadjButton;
    private javax.swing.JTextField phoneNoJTextField1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}


