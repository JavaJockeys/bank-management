package bank.management;


import java.io.Serializable;
import java.util.Date;

public class Complain implements Serializable {
    private String body;
    private Client owner;
    private Date TXNDate;

    public Complain(Client client, String body) {
        this.owner = client;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
    
    public void setTXNDate(Date d) {
        this.TXNDate=d;
    }
    public Date getTXNDate() {
        return this.TXNDate;
    }
    
}
