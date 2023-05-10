
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;

public class DBManager {
    private final String currentDir = System.getProperty("user.dir");
    private final String clientPath = currentDir + "\\DB\\clients.db";
    private final String transactionPath = currentDir + "\\DB\\ransactions.db";
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
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }
    
    private <T extends Object> T loadDB(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println(path);
        T db = null;
        FileInputStream fis = new FileInputStream(path);
        if (fis.getChannel().size() != 0) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            db = (T) ois.readObject();
            System.out.println(db);
            ois.close();
        }
        fis.close();
        return db;
    }
    public void loadClientDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object clients = loadDB(this.clientPath); 
        if (clients != null)
            this.clientDB = (ArrayList<Client>) clients;
    }
    public void loadTransactionDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object transactions = loadDB(this.transactionPath); 
        if (transactions != null)
            this.transactionDB = (ArrayList<Transaction>) transactions;
    }
    
    public void loadComplainDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object complains = loadDB(this.complainPath);
        if (complains != null)
            this.complainDB = (ArrayList<Complain>) complains;
    }
    
    public void loadCredentialDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object credentials = loadDB(this.credentialsPath);
        if (credentials != null)
            this.credentialDB = (HashMap<String, String>) credentials;
    }
    
    public void loadLoginInfo() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object login = loadDB(this.cachedLogin);
        if (login != null)
            this.loginInfo = (LoginInfo) login;
    }
    
    public void loadAllDB() throws FileNotFoundException, IOException, ClassNotFoundException {
        loadClientDB();
        loadTransactionDB();
        loadComplainDB();
        loadCredentialDB();
//        FileInputStream cfis = new FileInputStream(URLDecoder.decode(clientPath.getPath(), "UTF-8"));
//        FileInputStream tfis = new FileInputStream(URLDecoder.decode(transactionPath.getPath(), "UTF-8"));
//        FileInputStream cmfis = new FileInputStream(URLDecoder.decode(complainPath.getPath(), "UTF-8"));
//        
//        
//        if (cfis.getChannel().size() != 0) {
//            ObjectInputStream cis = new ObjectInputStream(cfis);
//            this.clientDB = (ArrayList<Client>) cis.readObject();
//            cis.close();
//        }
//        
//        if (tfis.getChannel().size() != 0) {
//            ObjectInputStream tis = new ObjectInputStream(tfis);
//            this.transactionDB = (ArrayList<Transaction>) tis.readObject();
//            tis.close();
//        }
//        
//        if (cmfis.getChannel().size() != 0) {
//            ObjectInputStream cmis = new ObjectInputStream(cmfis);
//            this.complainDB = (ArrayList<Complain>) cmis.readObject();
//            cmis.close();
//        }
//        
//        cfis.close();
//        tfis.close();
//        cmfis.close();
  
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }
    
    private <T extends Object> void updateDB(String path, T db) throws UnsupportedEncodingException, FileNotFoundException, IOException, ClassNotFoundException {
        //System.out.println(db.getDate());
        System.out.println(db + " is being written in " + path);
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(db);
        fos.close();
        oos.close();
        System.out.println(db + " is written in the DB.");
    }
    
    public void updateClientDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(clientPath, this.clientDB);
    }
    public void updateTransactionDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(transactionPath, this.transactionDB);
    }
    public void updateComplainDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(complainPath, this.complainDB);
    }
    public void updateCredentialDB() throws UnsupportedEncodingException, FileNotFoundException, ClassNotFoundException, IOException {
        updateDB(credentialsPath, this.credentialDB);
    }

    public void updateLoginInfo() throws FileNotFoundException, IOException, UnsupportedEncodingException, ClassNotFoundException {
        updateDB(cachedLogin, this.loginInfo);
    }
    public void updateAllDB() throws IOException, ClassNotFoundException {

        updateClientDB();
        updateComplainDB();
        updateTransactionDB();
        updateCredentialDB();
        
//        FileOutputStream cfos = new FileOutputStream(URLDecoder.decode(clientPath.getPath(), "UTF-8"));
//        FileOutputStream tfos = new FileOutputStream(URLDecoder.decode(transactionPath.getPath(), "UTF-8"));
//        FileOutputStream cmfos = new FileOutputStream(URLDecoder.decode(complainPath.getPath(), "UTF-8"));
//        
//        ObjectOutputStream cos = new ObjectOutputStream(cfos);
//        ObjectOutputStream tos = new ObjectOutputStream(tfos);
//        ObjectOutputStream cmos = new ObjectOutputStream(cmfos);
//        
//        cos.writeObject(this.clientDB);
//        tos.writeObject(this.transactionDB);
//        cmos.writeObject(this.complainDB);
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
    
    public static void main(String[] args) throws IOException, FileNotFoundException, UnsupportedEncodingException, ClassNotFoundException {
        DBManager db = new DBManager();
        // db.setLoginInfo(new LoginInfo("Osama", "bolbona"));
        // db.updateLoginInfo();
        db.loadLoginInfo();
        System.out.println(db.getLoginInfo());
    }
    
}
