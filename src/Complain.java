
import java.io.Serializable;

public class Complain implements Serializable {
    private int slNo;
    private String body;
    private Client owner;

    public Complain(int slNo, Client client, String body) {
        this.slNo = slNo;
        this.owner = client;
        this.body = body;
    }

    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
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
