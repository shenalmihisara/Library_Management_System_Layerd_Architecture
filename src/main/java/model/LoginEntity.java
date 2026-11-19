package model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoginEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginEntity() {
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
