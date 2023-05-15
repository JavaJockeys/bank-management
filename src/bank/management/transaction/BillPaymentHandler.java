
package bank.management.transaction;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.Organization;
import bank.management.Transaction;
import bank.management.TransactionParty;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osama
 */
public class BillPaymentHandler extends TransactionHandler {
    private Client sender;
    private Organization receiver;
    
    public BillPaymentHandler(DBManager db, Client sender, Organization receiver) {
        this.db = db;
        this.sender = sender;
        this.receiver = receiver;
    }
    @Override
    public void makeTransaction(double amount) throws Client.InsufficientBalanceException {
        sender.withdraw(amount);
        Transaction transaction = new Transaction(sender, receiver, amount, Transaction.TransactionType.BILL_PAYMENT);
        db.getTransactionDB().add(transaction);
        sender.getTransactionList().add(transaction);
    }
    
}
