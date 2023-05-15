
package bank.management.transaction;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.Organization;
import bank.management.Transaction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osama
 */
public class MoblieRechargeHandler extends TransactionHandler {

    private Client sender;
    private Organization receiver;
    
    public MoblieRechargeHandler(DBManager db, Client sender, Organization receiver) {
        this.db = db;
        this.sender = sender;
        this.receiver = receiver;
    }
    @Override
    public void makeTransaction(double amount) throws Client.InsufficientBalanceException {
        sender.withdraw(amount);
        Transaction transaction = new Transaction(sender, receiver, amount, Transaction.TransactionType.MOBILE_RECHARGE);
        db.getTransactionDB().add(transaction);
        sender.getTransactionList().add(transaction);
    }
    
}
