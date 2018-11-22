package ua.com.cib.exim.model;

import ua.com.cib.exim.utils.Utils;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login", unique = true, nullable = false)
    private String login;
    @Column(name = "encrypt", nullable = false, columnDefinition = "")
    private String encrypt;
    @Column(name = "decrypt", nullable = false)
    private String decrypt;

    public User() {
    }

    public User(String login, String decrypt) {
        this.login = login;
        this.decrypt = decrypt;
        this.encrypt = Utils.encryptor(decrypt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(String decrypt) {
        this.decrypt = decrypt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", encrypt='" + encrypt + '\'' +
                ", decrypt='" + decrypt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getEncrypt(), user.getEncrypt()) &&
                Objects.equals(getDecrypt(), user.getDecrypt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getEncrypt(), getDecrypt());
    }
}
