package bank.management;


public class TransactionParty {
    
    protected String name;
    
    public TransactionParty() {
        // Object serialization
    }
    
    public TransactionParty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
