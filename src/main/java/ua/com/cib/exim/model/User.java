package ua.com.cib.exim.model;

import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table (name = "users")
public class User {

    @Id
    @Column(name = "login", unique = true, nullable = false,columnDefinition="VARCHAR(64)")
    private String login;

    @Column(name = "name", nullable = false,columnDefinition="VARCHAR(128) default 'GO'")
    private String name;


    @ColumnTransformer(write = "SHA2(?, 224)")
    @Column (name = "password", nullable = false, columnDefinition="VARCHAR(64)")
    private String password;

    @Column(name = "decrypt", nullable = false, columnDefinition="VARCHAR(64)")
    private String decrypt;

    @Column(name = "uid", length = 10, columnDefinition = "INT default 10")
    private int uid;

    @Column(name = "gid", length = 10, columnDefinition = "INT default 10")
    private int gid;

    @Column(name = "domain", nullable = false, columnDefinition="VARCHAR(128) default 'cib.com.ua'")
    private String domain;

    @Column(name = "quota", columnDefinition="TINYINT(4) default 0")
    private short quota;

    @Column(name = "copy_mail", nullable = false, columnDefinition="INT default 1")
    private int copyMail;

    @Column(name = "status", columnDefinition="ENUM('0,'1') default '1'")
    private String status;


    public User() {
        this.name = "GO";
        this.copyMail = 1;
        this.uid = 93;
        this.gid = 93;
        this.domain = "cib.com.ua";
        this.status = "1";
    }

    public User(String login, String decrypt) {
        this.login = login;
        this.decrypt = decrypt;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(String decrypt) {
        this.decrypt = decrypt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public short getQuota() {
        return quota;
    }

    public void setQuota(short quota) {
        this.quota = quota;
    }

    public int getCopyMail() {
        return copyMail;
    }

    public void setCopyMail(int copyMail) {
        this.copyMail = copyMail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
//                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", decrypt='" + decrypt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return //getId() == user.getId() &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getDecrypt(), user.getDecrypt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*getId(),*/ getLogin(), getPassword(), getDecrypt());
    }
}
