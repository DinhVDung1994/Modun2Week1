package Model;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private String passwork;

    public Account() {
    }

    public Account(String username, String passwork) {
        this.username = username;
        this.passwork = passwork;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }

    @Override
    public String toString() {
        return
                "username='" + username + '\'' +
                ", passwork='" + passwork + '\'';
    }
}
