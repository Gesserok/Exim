package ua.com.cib.exim.model;


import javax.persistence.*;

@Entity
@Table(name = "mail_copy")
public class MailCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private int id;

    @Column(name = "mail", nullable = false,columnDefinition="VARCHAR(255)")
    private String mail;

    @Column(name = "status", nullable = false, columnDefinition="TINYINT")
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
