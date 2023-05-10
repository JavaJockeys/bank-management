package bank.management;


import java.io.Serializable;

public class Complain implements Serializable {
    private String body;
    private Client owner;

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
}
