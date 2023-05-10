
package bank.management.transaction;

import bank.management.Client;
import bank.management.DBManager;
import bank.management.TransactionParty;

/**
 *
 * @author Osama
 */
public abstract class TransactionHandler {
    protected DBManager db;
    abstract void makeTransaction(double amount) throws Client.InsufficientBalanceException;
}
