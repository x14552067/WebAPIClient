/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import java.util.ArrayList;
import javax.ws.rs.core.Response;
import models.Account;
import models.AccountActionBody;
import models.Customer;
import models.TransferBody;
import org.glassfish.jersey.internal.util.Base64;

/**
 *
 * @author glennncullen
 */
public class BankingApp {
    
    final public static String baseUrlString = "http://localhost:49000/api";
    public static Customer currentCustomer = null;
    public static ArrayList<Account> allAccounts = new ArrayList();
    
    public static boolean isCustomer(String email, String pin){
        final String isCustomerUrl = baseUrlString + "/customers";
        Client client = Client.create();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isCustomerUrl);
        String encodedString = Base64.encodeAsString(email + ":" + pin);
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", "Basic " + encodedString)
                .get(ClientResponse.class);
        if(response.getStatus() == 200){
            currentCustomer = (Customer) response.getEntity(Customer.class);
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean isRegisterCustomerSuccessful(String address, String firstName, String lastName, String email, String pin){
        final String isRegisterCustomerUrl = baseUrlString + "/customers";
       
        Customer customerToRegister = new Customer();
        customerToRegister.setAddress(address);
        customerToRegister.setFirstName(firstName);
        customerToRegister.setLastName(lastName);
        customerToRegister.setEmail(email);
        customerToRegister.setCustomerPin(pin);           
        
        Client client = Client.create();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isRegisterCustomerUrl);
        ClientResponse response = target.header("Content-type", "application/json")
                .put(ClientResponse.class, customerToRegister);
        System.out.println(response);
        if(response.getStatus() == 201){
            currentCustomer = (Customer) response.getEntity(Customer.class);
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean isCustomerDeleted(){
        final String isCustomerDeletedUrl = baseUrlString + "/customers/" + currentCustomer.getCustomerNumber();
        Client client = new Client();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isCustomerDeletedUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", "Basic " + encodedString)
                .delete(ClientResponse.class);
        return response.getStatus() == 204;
    }
    
    
    public static boolean isCustomerUpdated(String address, String firstName, String lastName, String email, String pin){
        final String isCustomerUpdatedUrl = baseUrlString + "/customers/" + currentCustomer.getCustomerNumber();
        
        Customer customerToUpdate = new Customer();
        customerToUpdate.setAddress(address);
        customerToUpdate.setFirstName(firstName);
        customerToUpdate.setLastName(lastName);
        customerToUpdate.setEmail(email);
        customerToUpdate.setCustomerPin(pin);
        
        Client client = new Client();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isCustomerUpdatedUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", encodedString)
                .post(ClientResponse.class, customerToUpdate);
        if(response.getStatus() == 200){
            currentCustomer = (Customer) response.getEntity(Customer.class);
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean getAllAccounts(){
        if(!allAccounts.isEmpty()){
            allAccounts.clear();
        }
        final String getAllAccountsUrl = baseUrlString + "/accounts";
        Client client = new Client();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(getAllAccountsUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", encodedString)
                .get(ClientResponse.class);
        if(response.getStatus() == 200){
            allAccounts = response.getEntity(new GenericType<ArrayList<Account>>(){});
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean isOpenAccount(String depositAmount, String accountType){
        final String isOpenAccountUrl = baseUrlString + "/accounts" + "/" + accountType;
        
        Account newAccount = new Account();
        newAccount.setSortCode("990284");
        int balance;
        try{
            balance = Integer.parseInt(depositAmount);
        }catch(NumberFormatException e){
            return false;
        }
        switch(accountType){
            case "current_account":
                newAccount.setInterestRate(0);
                newAccount.setMonthlyRepayment(0);
                break;
            case "deposit_account":
                newAccount.setInterestRate(2);
                balance = balance + ((balance / 100) * 2);
                newAccount.setMonthlyRepayment(0);
                break;
            case "loan_account":
                newAccount.setInterestRate(3);
                balance = balance + ((balance / 100) * 3);
                newAccount.setMonthlyRepayment(balance / 60);
                break;
            default:
                break;
        }
        newAccount.setCurrentBalance(balance);
        
        Client client = new Client();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isOpenAccountUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", encodedString)
                .put(ClientResponse.class, newAccount);
        return response.getStatus() == 201;
    }
    
    
    public static boolean isAccountDeleted(int accountNumber, String accountType){
        final String isAccountDeletedUrl = baseUrlString + "/accounts/" + accountType + "/" + accountNumber;
        Client client = new Client();
        client.addFilter(new LoggingFilter(System.out));
        WebResource target = client.resource(isAccountDeletedUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", "Basic " + encodedString)
                .delete(ClientResponse.class);
        return response.getStatus() == 410;
    }
    
    
    public static boolean isTransactionSuccessful(int accountNumber, String amount, String accountType, String action){
        final String isTransactionSuccessfulUrl = baseUrlString + "/accounts/" + accountType + "/" + action;
        
        AccountActionBody accountAction = new AccountActionBody();
        accountAction.setAccountNumber(accountNumber);
        int transactionAmount;
        try{
            transactionAmount = Integer.parseInt(amount);
        }catch(NumberFormatException e){
            return false;
        }
        accountAction.setTransactionAmount(transactionAmount);
        
        Client client = new Client();
        WebResource target = client.resource(isTransactionSuccessfulUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.accept("application/json").header("Content-Type", "application/json").header("Authorization", encodedString)
                .post(ClientResponse.class, accountAction);
        return response.getStatus() == 200;
    }
    
    
    public static boolean isTransferSuccessful(String from, String to, String amount){
        final String isTransferSuccessfulUrl = baseUrlString + "/accounts/transfer";
        
        TransferBody transfer = new TransferBody();
        try{
            transfer.setSenderAccountNumber(Integer.parseInt(from));
            transfer.setReceiverAccountNumber(Integer.parseInt(to));
            transfer.setAmount(Integer.parseInt(amount));
        }catch(NumberFormatException e){
            return false;
        }
        
        Client client = new Client();
        WebResource target = client.resource(isTransferSuccessfulUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.accept("application/json").header("Content-Type", "application/json").header("Authorization", encodedString)
                .post(ClientResponse.class, transfer);
        return response.getStatus() == 200;
    }
    
}
