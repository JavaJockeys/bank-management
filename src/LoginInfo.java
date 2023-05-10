
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Osama
 */
public class LoginInfo implements Serializable {
    private String username;
    private String password;
    private Date date;
    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
        this.date = new Date();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getDate() {
        return date;
    }
}