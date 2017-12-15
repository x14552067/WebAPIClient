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
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
    
    @JsonProperty("customer_number")
    @XmlElement(name = "customer_number")
    private int customerNumber;
    
    @JsonProperty("first_name")
    @XmlElement(name = "first_name")
    private String firstName;
    
    @JsonProperty("last_name")
    @XmlElement(name = "last_name")
    private String lastName;
    
    @JsonProperty("email")
    @XmlElement(name = "email")
    private String email;
    
    @JsonProperty("address")
    @XmlElement(name = "address")
    private String address;
    
    @JsonProperty("customer_pin")
    @XmlElement(name = "customer_pin")
    private String customerPin;
    

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }
    
}
