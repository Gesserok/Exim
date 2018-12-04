package ua.com.cib.exim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "userforward")
public class UserForward {

    @Id
    @Column(name = "local_part", unique = true, nullable = false,columnDefinition="VARCHAR(64)")
    private String localPart;

    @Column(name = "domain", nullable = false,columnDefinition="VARCHAR(128)")
    private String domain;

    @Column(name = "recipients", nullable = false,columnDefinition="TEXT(65535)")
    private String recipients;


    public UserForward() {
        this.domain = "cib.local";
    }
    public UserForward(String localPart) {
        this.localPart = localPart;
        this.domain = "cib.local";
        this.recipients = localPart.concat("@cib.com.ua");
    }

    public String getLocalPart() {
        return localPart;
    }

    public void setLocalPart(String localPart) {
        this.localPart = localPart;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }
}
