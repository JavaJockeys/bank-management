package bank.management;

import java.io.Serializable;
import java.util.*;
public class Client extends TransactionParty implements Serializable {
    private String phone;
    private String accountNo;
    private String nationalID;
    private String username;
    private String password;
    private double balance;
    private ArrayList<Transaction> transactions;
    private ArrayList<Complain> complains;
    
    public Client() {

    }

    public Client(String name, String phone, String accountNo, String address, String nationalID,
                  String username, String password, double balance) {
        super(name);
        this.phone = phone;
        this.accountNo = accountNo;
        this.nationalID = nationalID;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.complains = new ArrayList<>();
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (this.balance < amount) throw new InsufficientBalanceException();
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getPhone() {
        return phone;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactionList() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setComplains(ArrayList<Complain> complains) {
        this.complains = complains;
    }

    public ArrayList<Complain> getComplainList() {
        return this.complains;
    }

    public String getPassword() {
        return this.password;
    }

    public static class InsufficientBalanceException extends Exception {

        public InsufficientBalanceException() {
        }
    }
}
