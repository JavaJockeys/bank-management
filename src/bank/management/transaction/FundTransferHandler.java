
package bank.management.transaction;

import bank.management.Client;
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
    @Override
    public void makeTransaction(double amount) {
        Transaction transaction = new Transaction(sender, receiver, amount, Transaction.TransactionType.CLIENT_TO_CLIENT);
        sender.withdraw(amount);
        receiver.deposit(amount);
        sender.getTransactionList().add(transaction);
        receiver.getTransactionList().add(transaction);
        try {
            db.updateClientDB();
            db.updateTransactionDB();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FundTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FundTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FundTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
