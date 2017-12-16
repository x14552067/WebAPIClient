/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dan
 * @author Paul
 */
@XmlRootElement
public class TransferBody {
    
    @JsonProperty("sender_account_number")
    private int senderAccountNumber;
    
    @JsonProperty("receiver_account_number")
    private int receiverAccountNumber;
    
    @JsonProperty("amount")
    private int amount;

    public TransferBody() {
    }

    public TransferBody(int senderAccount, int receiverAccount, int amount) {
        this.senderAccountNumber = senderAccount;
        this.receiverAccountNumber = receiverAccount;
        this.amount = amount;
    }

    public int getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(int senderAccount) {
        this.senderAccountNumber = senderAccount;
    }

    public int getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(int receiverAccount) {
        this.receiverAccountNumber = receiverAccount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
