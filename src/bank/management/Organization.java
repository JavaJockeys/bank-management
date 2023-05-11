package bank.management;

import java.io.Serializable;


public class Organization extends TransactionParty implements Serializable {
    public Organization(String name) {
        super(name);
    }
}