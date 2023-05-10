
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
    public void makeTransaction(double amount) {
        withdrawer.withdraw(amount);
        Transaction transaction = new Transaction(withdrawer, null, amount, Transaction.TransactionType.WITHDRAW_CASH);
        db.getTransactionDB().add(transaction);
        try {
            db.updateClientDB();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WithdrawHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WithdrawHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WithdrawHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
