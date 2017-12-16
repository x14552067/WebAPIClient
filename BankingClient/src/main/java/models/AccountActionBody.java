/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dan
 * @author Paul
 */

@XmlRootElement
public class AccountActionBody {
    
    @JsonProperty("account_number")
    private int accountNumber;
    
    @JsonProperty("transaction_amount")
    private int transactionAmount;

    public AccountActionBody() {
        
    }

    public AccountActionBody(int accountNumber, int transactionAmount) {
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
    
    
}
