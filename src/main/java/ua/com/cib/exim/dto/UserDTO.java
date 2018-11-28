package ua.com.cib.exim.dto;

import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.model.UserForward;

public class UserDTO {
    private User user;
    private UserForward userForvard;
    private MailCopy mailCopy;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserForward getUserForvard() {
        return userForvard;
    }

    public void setUserForvard(UserForward userForvard) {
        this.userForvard = userForvard;
    }

    public MailCopy getMailCopy() {
        return mailCopy;
    }

    public void setMailCopy(MailCopy mailCopy) {
        this.mailCopy = mailCopy;
    }
}
