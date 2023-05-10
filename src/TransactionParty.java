
public abstract class TransactionParty {
    
    protected String name;
    
    public TransactionParty() {
        
    }
    public TransactionParty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
