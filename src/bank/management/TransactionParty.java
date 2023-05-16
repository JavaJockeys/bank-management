package bank.management;

import java.io.Serializable;


public class TransactionParty implements Serializable {
    
    protected String name;
    
    public TransactionParty() {
       
    }
    
    public TransactionParty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
