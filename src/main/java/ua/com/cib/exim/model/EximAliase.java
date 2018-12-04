package ua.com.cib.exim.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aliases")
public class EximAliase {

    @Id
    @Column(name = "local_part", unique = true, nullable = false,columnDefinition="VARCHAR(64)")
    private String localPart;

    @Column(name = "domain",unique = false, nullable = false, columnDefinition="VARCHAR(128)")
    private String domain;

    @Column(name = "recipients",columnDefinition="TEXT(65535)")
    private String recipients;

    public EximAliase() {
        this.domain = "cib.com.ua";
        this.recipients = "";
    }

    public EximAliase(String localPart) {
        this.localPart = localPart;
        this.domain = "cib.com.ua";
        this.recipients = "";
    }

    public EximAliase(String localPart, String recipients) {
        this.localPart = localPart;
        this.domain = "cib.com.ua";
        this.recipients = recipients;
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
