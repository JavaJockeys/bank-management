package bank.management;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    private final String currentDir = System.getProperty("user.dir");
    private final String clientPath = currentDir + "\\DB\\clients.db";
    private final String transactionPath = currentDir + "\\DB\\transactions.db";
    private final String complainPath = currentDir + "\\DB\\complains.db";
    private final String credentialsPath = currentDir + "\\DB\\credentials.db";
    private final String cachedLogin = currentDir + "\\DB\\cached_login.db";
    private ArrayList<Client> clientDB;
    private ArrayList<Transaction> transactionDB;
    private ArrayList<Complain> complainDB;
    private HashMap<String, String> credentialDB;
    private LoginInfo loginInfo;

    public HashMap<String, String> getCredentialDB() {
        return credentialDB;
    }
    
    public DBManager() {
        this.clientDB = new ArrayList<>();
        this.transactionDB = new ArrayList<>();
        this.complainDB = new ArrayList<>();
        this.credentialDB = new HashMap<>();
        
        try {
            loadAllDB();
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }
    
    private <T extends Serializable> T loadDB(String path) throws FileNotFoundException, IOException, ClassNotFoundException {;
        T db = null;
        FileInputStream fis = new FileInputStream(path);
        if (fis.getChannel().size() != 0) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            db = (T) ois.readObject();
            ois.close();
        }
        fis.close();
        return db;
    }
    private void loadClientDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object clients = loadDB(this.clientPath); 
        if (clients != null)
            this.clientDB = (ArrayList<Client>) clients;
    }
    private void loadTransactionDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object transactions = loadDB(this.transactionPath); 
        if (transactions != null)
            this.transactionDB = (ArrayList<Transaction>) transactions;
    }
    
    private void loadComplainDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object complains = loadDB(this.complainPath);
        if (complains != null)
            this.complainDB = (ArrayList<Complain>) complains;
    }
    
    private void loadCredentialDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object credentials = loadDB(this.credentialsPath);
        if (credentials != null)
            this.credentialDB = (HashMap<String, String>) credentials;
    }
    
    private void loadLoginInfo() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object login = loadDB(this.cachedLogin);
        if (login != null)
            this.loginInfo = (LoginInfo) login;
    }
    
    public void loadAllDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        loadClientDB();
        loadTransactionDB();
        loadComplainDB();
        loadCredentialDB();
        loadLoginInfo();
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }
    
    private <T extends Serializable> void updateDB(String path, T db) throws UnsupportedEncodingException, FileNotFoundException, IOException, ClassNotFoundException {
       
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(db);
        fos.close();
        oos.close();
        
    }
    
    private void updateClientDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(clientPath, this.clientDB);
    }
    private void updateTransactionDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(transactionPath, this.transactionDB);
    }
    private void updateComplainDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(complainPath, this.complainDB);
    }
    private void updateCredentialDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(credentialsPath, this.credentialDB);
    }

    private void updateLoginInfo() throws FileNotFoundException, IOException, UnsupportedEncodingException, ClassNotFoundException {
        updateDB(cachedLogin, this.loginInfo);
    }
    public void requestDBUpdate() throws IOException, ClassNotFoundException {

        updateClientDB();
        updateComplainDB();
        updateTransactionDB();
        updateCredentialDB();
        updateLoginInfo();

    }

    public ArrayList<Client> getClientDB() {
        return clientDB;
    }

    public ArrayList<Transaction> getTransactionDB() {
        return transactionDB;
    }

    public ArrayList<Complain> getComplainDB() {
        return complainDB;
    }
    
    
}
