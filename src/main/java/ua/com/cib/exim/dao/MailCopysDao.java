package ua.com.cib.exim.dao;

import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;

import java.util.List;

public interface MailCopysDao {
    int add(User mailCopy);
    int update(User mailCopy);
    int delete(String login);
    MailCopy get(String login);
    List<MailCopy> list();
}
