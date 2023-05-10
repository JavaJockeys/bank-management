package bank.management;


import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    
    public static enum TransactionType implements Serializable {
        CLIENT_TO_CLIENT,
        BILL_PAYMENT,
        FUND_TRANSFER,
        MOBILE_RECHARGE,
        WITHDRAW_CASH
    }
    private TransactionParty sender;
    private TransactionParty receiver;
    private double amount;
    private Date date;
    private TransactionType type;
    
    public Transaction(TransactionParty sender,
            TransactionParty receiver, double amount, TransactionType type) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.type = type;
        this.date = new Date();
    }
    

    public TransactionParty getSender() {
        return sender;
    }


    public TransactionParty getReceiver() {
        return receiver;
    }

    public Date getDate() {
        return date;
    }


    public double getAmount() {
        return amount;
    }


    public TransactionType getType() {
        return type;
    }


}
