
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
public class WithdrawHandler extends TransactionHandler {
    private Client withdrawer;
    
    public WithdrawHandler(DBManager db, Client withdrawer) {
        this.db = db;
        this.withdrawer = withdrawer;
    }
    @Override
    public void makeTransaction(double amount) throws Client.InsufficientBalanceException {
        withdrawer.withdraw(amount);
        Transaction transaction = new Transaction(withdrawer, null, amount, Transaction.TransactionType.WITHDRAW_CASH);
        withdrawer.getTransactionList().add(transaction);
        db.getTransactionDB().add(transaction);
    }
    
}
