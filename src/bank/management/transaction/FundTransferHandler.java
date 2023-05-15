
package bank.management.transaction;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.Transaction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osama
 */
public class FundTransferHandler extends TransactionHandler {
    
    private Client sender;
    private Client receiver;
    
    public FundTransferHandler(DBManager db, Client sender, Client receiver) {
        this.db = db;
        this.sender = sender;
        this.receiver = receiver;
    }
    @Override
    public void makeTransaction(double amount) throws Client.InsufficientBalanceException {
        Transaction transaction = new Transaction(sender, receiver, amount, Transaction.TransactionType.CLIENT_TO_CLIENT);
        sender.withdraw(amount);
        receiver.deposit(amount);
        db.getTransactionDB().add(transaction);
        sender.getTransactionList().add(transaction);
        receiver.getTransactionList().add(transaction);
    }
    
}
