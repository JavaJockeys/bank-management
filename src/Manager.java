import java.util.*;
public class Manager {
    private ArrayList<Client> clients;
    private ArrayList<Complain> complains;
    private ArrayList<Transaction> transactions;

    public Manager() {
        clients = new ArrayList<>();
        complains = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public ArrayList<Client> getClientList() {
        return clients;
    }

    public ArrayList<Complain> getComplainList() {
        return complains;
    }
}

