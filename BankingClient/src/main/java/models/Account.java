/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Dan
 */
@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    
    @JsonProperty("account_number")
    @XmlElement(name = "account_number")
    private int accountNumer;
    
    @JsonProperty("account_type")
    @XmlElement(name = "account_type")
    private AccountType accountType;
    
    @JsonProperty("sort_code")
    @XmlElement(name = "sort_code")
    private String sortCode;
    
    @JsonProperty("current_balance")
    @XmlElement(name = "current_balance")
    private int currentBalance;
    
    @JsonProperty("interest_rate")
    @XmlElement(name = "interest_rate")
    private float interestRate;
    
    @JsonProperty("mothly_repayment")
    @XmlElement(name = "monthly_repayment")
    private int monthlyRepayment;
    
    private Customer accountHolder;

    public Integer getAccountNumer() {
        return accountNumer;
    }

    public void setAccountNumer(int accountNumer) {
        this.accountNumer = accountNumer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getMonthlyRepayment() {
        return monthlyRepayment;
    }

    public void setMonthlyRepayment(int monthlyRepayment) {
        this.monthlyRepayment = monthlyRepayment;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }
     
    /**
     * The different types of accounts that can be created
     */
    public enum AccountType {
        current,
        savings,
        loan,
        deposit;
        
        /**
        * Accepts a string value and returns the appropriate AccountType value
        * @param type the string value
        * @return the appropriate AccountType value, or throws an exception if invalid
        */
        public static AccountType fromString(String type) {
            switch(type.toLowerCase()) {
                case "current": 
                    return AccountType.current;
                case "savings": 
                    return AccountType.savings;
                case "loan": 
                    return AccountType.loan;
                case "deposit": 
                    return AccountType.deposit;
                default: 
                    throw new IllegalArgumentException();
            }
        }
    }
}
