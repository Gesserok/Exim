package ua.com.cib.exim.dto;

import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.model.UserForvard;

public class UserDTO {
    private User user;
    private UserForvard userForvard;
    private MailCopy mailCopy;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserForvard getUserForvard() {
        return userForvard;
    }

    public void setUserForvard(UserForvard userForvard) {
        this.userForvard = userForvard;
    }

    public MailCopy getMailCopy() {
        return mailCopy;
    }

    public void setMailCopy(MailCopy mailCopy) {
        this.mailCopy = mailCopy;
    }
}
