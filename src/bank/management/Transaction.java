package bank.management;


import java.io.Serializable;

public class Transaction implements Serializable {
    private int slNo;

    public static enum TransactionType implements Serializable {
        CLIENT_TO_CLIENT
    }
    private String id;
    private TransactionParty sender;
    private TransactionParty receiver;
    private double amount;
    private TransactionType type;
    
    public Transaction(int slNo, TransactionParty sender,
            TransactionParty receiver, double amount, TransactionType type) {
        this.slNo = slNo;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.type = type;
    }
    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TransactionParty getSender() {
        return sender;
    }

    public void setSender(TransactionParty sender) {
        this.sender = sender;
    }

    public TransactionParty getReceiver() {
        return receiver;
    }

    public void setReceiver(TransactionParty receiver) {
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void generateReceipt() {

    }
}
