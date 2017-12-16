package bankinggui;

import bankingclient.BankingApp;
import java.util.Arrays;
import models.Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glennncullen
 */
public class BankingFrame extends javax.swing.JFrame {

    /**
     * Creates new form BankingFrame
     */
    public BankingFrame() {
        initComponents();
        logout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        pinTxt = new javax.swing.JPasswordField();
        logoutBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        closeAccountTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        closeAccountBtn = new javax.swing.JButton();
        closeAccountCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        openAccountBtn = new javax.swing.JButton();
        openAccountCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountInfoTextArea = new javax.swing.JTextPane();
        addressTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        openAccountLbl = new javax.swing.JLabel();
        openAccountTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginBtn.setText("Login");
        loginBtn.setActionCommand("loginBtn");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Email");

        jLabel4.setText("PIN");

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Information");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        pinTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinTxtActionPerformed(evt);
            }
        });

        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Close Account");
        jLabel6.setFocusable(false);

        jLabel7.setText("Account No.");

        closeAccountBtn.setText("Close Account");

        closeAccountCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Account-", "Current Account", "Deposit Account", "Loan Account" }));
        closeAccountCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAccountComboActionPerformed(evt);
            }
        });

        jLabel8.setText("Account Type");

        jLabel9.setText("Information");

        openAccountBtn.setText("Open Account");
        openAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAccountBtnActionPerformed(evt);
            }
        });

        openAccountCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Account-", "Current Account", "Deposit Account", "Loan Account" }));
        openAccountCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAccountComboActionPerformed(evt);
            }
        });

        jLabel10.setText("Account Type");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Open Account");
        jLabel11.setToolTipText("");

        infoTextArea.setEditable(false);
        jScrollPane3.setViewportView(infoTextArea);

        accountInfoTextArea.setEditable(false);
        jScrollPane2.setViewportView(accountInfoTextArea);

        jLabel12.setText("Address");

        openAccountLbl.setText("     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addressTxt)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(openAccountCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(openAccountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(openAccountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(openAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(closeAccountCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(closeAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(closeAccountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(355, 355, 355))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(loginBtn)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openAccountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openAccountLbl)
                            .addComponent(openAccountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(openAccountBtn)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeAccountCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeAccountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeAccountBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String email = emailTxt.getText();
        String pin = new String(pinTxt.getPassword());
        String address = addressTxt.getText();
        if(firstName.equalsIgnoreCase("") || lastName.equalsIgnoreCase("") || email.equalsIgnoreCase("") || pin.equalsIgnoreCase("") || address.equalsIgnoreCase("")){
            infoTextArea.setText("All Fields Required");
        }else{
            if(BankingApp.isCustomer(email, pin)){
                login();
                infoTextArea.setText("");
            }else{
                infoTextArea.setText("Invalid Details or \ncustomer not registered");
            }
        }
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String email = emailTxt.getText();
        String pin = new String(pinTxt.getPassword());
        String address = addressTxt.getText();
        if(firstName.equalsIgnoreCase("") || lastName.equalsIgnoreCase("") || email.equalsIgnoreCase("") || pin.equalsIgnoreCase("") || address.equalsIgnoreCase("")){
            infoTextArea.setText("All Fields Required");
        }else{
            if(BankingApp.isRegisterCustomerSuccessful(address, firstName, lastName, email, pin)){
                login();
                infoTextArea.setText("");
            }else{
                infoTextArea.setText("Invalid Details");
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void pinTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinTxtActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String email = emailTxt.getText();
        String pin = new String(pinTxt.getPassword());
        String address = addressTxt.getText();
        if(firstName.equalsIgnoreCase("") || lastName.equalsIgnoreCase("") || email.equalsIgnoreCase("") || pin.equalsIgnoreCase("") || address.equalsIgnoreCase("")){
            infoTextArea.setText("All Fields Required");
        }else{
            if(BankingApp.isCustomerDeleted()){
                logout();
                infoTextArea.setText("Customer Deleted");
            }else{
                infoTextArea.setText("Unable to Delete Customer");
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String email = emailTxt.getText();
        String pin = new String(pinTxt.getPassword());
        String address = addressTxt.getText();
        if(firstName.equalsIgnoreCase("") || lastName.equalsIgnoreCase("") || email.equalsIgnoreCase("") || pin.equalsIgnoreCase("") || address.equalsIgnoreCase("")){
            infoTextArea.setText("All Fields Required");
        }else{
            if(BankingApp.isCustomerUpdated(address, firstName, lastName, email, pin)){
                infoTextArea.setText("Customer Details Updated");
            }else{
                infoTextArea.setText("Unable to Update \nCustomer Details");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    // -Select Account-, Current Account, Deposit Account, Loan Account
    private void openAccountComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAccountComboActionPerformed
        switch((String) openAccountCombo.getSelectedItem()){
            case "-Select Account-":
                openAccountLbl.setText("    ");
                openAccountTxt.setVisible(false);
                openAccountBtn.setEnabled(false);
                break;
            case "Current Account":
                openAccountLbl.setText("Deposit");
                openAccountTxt.setVisible(true);
                openAccountBtn.setEnabled(true);
                break;
            case "Deposit Account":
                openAccountLbl.setText("Deposit");
                openAccountTxt.setVisible(true);
                openAccountBtn.setEnabled(true);
                break;
            case "Loan Account":
                openAccountLbl.setText("Loan Amount");
                openAccountTxt.setVisible(true);
                openAccountBtn.setEnabled(true);
                break;
            default:
                openAccountLbl.setText("    ");
                openAccountTxt.setVisible(false);
                openAccountBtn.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_openAccountComboActionPerformed

    private void closeAccountComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAccountComboActionPerformed
        switch((String) closeAccountCombo.getSelectedItem()){
            case "-Select Account-":
                closeAccountTxt.setVisible(false);
                closeAccountBtn.setEnabled(false);
                break;
            case "Current Account":
                closeAccountTxt.setVisible(true);
                closeAccountBtn.setEnabled(true);
                break;
            case "Deposit Account":
                closeAccountTxt.setVisible(true);
                closeAccountBtn.setEnabled(true);
                break;
            case "Loan Account":
                closeAccountTxt.setVisible(true);
                closeAccountBtn.setEnabled(true);
                break;
            default:
                closeAccountTxt.setVisible(false);
                closeAccountBtn.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_closeAccountComboActionPerformed

    private void openAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAccountBtnActionPerformed
        String amount = openAccountTxt.getText();
        if(amount.contains(".")){
            infoTextArea.setText("Whole numbers only");
            return;
        }
        if(!amount.equalsIgnoreCase("")){
            switch((String) openAccountCombo.getSelectedItem()){
                case "Current Account":
                if(BankingApp.isOpenAccount(amount, "current_account")){
                    infoTextArea.setText("Current Account Created");
                    showAccountInfo();
                    openAccountLbl.setText("    ");
                    openAccountTxt.setVisible(false);
                    openAccountBtn.setEnabled(false);
                }else{
                    infoTextArea.setText("Unable to Create\nCurrent Account");
                }
                break;
            case "Deposit Account":
                if(BankingApp.isOpenAccount(amount, "deposit_account")){
                    infoTextArea.setText("Deposit Account Created");
                    showAccountInfo();
                    openAccountLbl.setText("    ");
                    openAccountTxt.setVisible(false);
                    openAccountBtn.setEnabled(false);
                }else{
                    infoTextArea.setText("Unable to Create\nDeposit Account");
                }
                break;
            case "Loan Account":
                if(BankingApp.isOpenAccount(amount, "loan_account")){
                    infoTextArea.setText("Loan Account Created");
                    showAccountInfo();
                    openAccountLbl.setText("    ");
                    openAccountTxt.setVisible(false);
                    openAccountBtn.setEnabled(false);
                }else{
                    infoTextArea.setText("Unable to Create\nLoan Account");
                }
                break;
            default:
                break;
            }
        }
    }//GEN-LAST:event_openAccountBtnActionPerformed

    
    public void showAccountInfo(){
        if(BankingApp.getAllAccounts()){
            String accountInfo = "";
            for(Account account : BankingApp.allAccounts){
                accountInfo = accountInfo + 
                        "Account Number:\t" + 
                        account.getAccountNumer() + 
                        "\nAccount Type:\t" + 
                        account.getAccountType() + 
                        "\nSort Code:\t\t" + 
                        account.getSortCode() +
                        "\nBalance:\t\t" + 
                        account.getCurrentBalance() + 
                        "\nInterest Rate:\t" + 
                        account.getInterestRate() + 
                        "\nRepayment p/m:\t" + 
                        account.getMonthlyRepayment() + 
                        "\n-----------------\n";
            }
            accountInfoTextArea.setText(accountInfo);
        }
    }
    
    public void login(){
        loginBtn.setEnabled(false);
        registerBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        closeAccountBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        openAccountCombo.setEnabled(true);
        closeAccountCombo.setEnabled(true);
        closeAccountTxt.setEnabled(true);
        showAccountInfo();
    }
    
    public void logout(){
        BankingApp.currentCustomer = null;
        BankingApp.allAccounts = null;
        firstNameTxt.setText("");
        lastNameTxt.setText("");
        addressTxt.setText("");
        emailTxt.setText("");
        pinTxt.setText("");
        infoTextArea.setText("");
        accountInfoTextArea.setText("");
        loginBtn.setEnabled(true);
        registerBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        closeAccountBtn.setEnabled(false);
        openAccountBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        openAccountCombo.setEnabled(false);
        closeAccountCombo.setEnabled(false);
        closeAccountTxt.setEnabled(false);
        openAccountTxt.setVisible(false);
        openAccountLbl.setText("    ");
    }
    
    
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
            java.util.logging.Logger.getLogger(BankingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane accountInfoTextArea;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton closeAccountBtn;
    private javax.swing.JComboBox<String> closeAccountCombo;
    private javax.swing.JTextField closeAccountTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextPane infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton openAccountBtn;
    private javax.swing.JComboBox<String> openAccountCombo;
    private javax.swing.JLabel openAccountLbl;
    private javax.swing.JTextField openAccountTxt;
    private javax.swing.JPasswordField pinTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
