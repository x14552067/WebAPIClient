/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.ArrayList;
import javax.ws.rs.core.MediaType;
import models.Account;
import models.Customer;
import org.glassfish.jersey.internal.util.Base64;

/**
 *
 * @author glennncullen
 */
public class BankingApp {
    
    final public static String baseUrlString = "http://localhost:49000/api";
    public static Customer currentCustomer;
    public static ArrayList<Account> allAccounts;
    
    public static boolean isCustomer(String email, String pin){
        final String isCustomerUrl = baseUrlString + "/customers";
        Client client = Client.create();
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
        WebResource target = client.resource(isRegisterCustomerUrl);
        ClientResponse response = target.header("Content-type", "application/json")
                .post(ClientResponse.class, customerToRegister);
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
        WebResource target = client.resource(isCustomerDeletedUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", "Basic " + encodedString)
                .delete(ClientResponse.class);
        if(response.getStatus() == 204){
            return true;
        }else{
            return false;
        }
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
        WebResource target = client.resource(isCustomerUpdatedUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", encodedString)
                .put(ClientResponse.class, customerToUpdate);
        if(response.getStatus() == 200){
            currentCustomer = (Customer) response.getEntity(Customer.class);
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean getAllAccounts(){
        final String getAllAccountsUrl = baseUrlString + "/accounts";
        Client client = new Client();
        WebResource target = client.resource(getAllAccountsUrl);
        String encodedString = Base64.encodeAsString(currentCustomer.getEmail() + ":" + currentCustomer.getCustomerPin());
        ClientResponse response = target.header("Content-Type", "application/json").header("Authorization", encodedString)
                .get(ClientResponse.class);
        System.out.println(response);
        if(response.getStatus() == 200){
            allAccounts = (ArrayList<Account>) response.getEntity(ArrayList.class);
            return true;
        }else{
            return false;
        }
    }
    
}
