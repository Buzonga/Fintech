package Models;

import java.util.Date;
import java.util.List;

public class User {
    private String idUser;
    private String email;
    private String username;
    private String psw;
    private String picture;
    private Date createDate;
    private double balance;
    private List<Transaction> transactions;

    public User() {}

    // region Getters

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.idUser;
    }

    public String getPicture() {
        return this.username;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public double getBalance() {
        return this.balance;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    // endregion
}
