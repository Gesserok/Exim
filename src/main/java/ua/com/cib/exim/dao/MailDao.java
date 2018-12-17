package ua.com.cib.exim.dao;

import ua.com.cib.exim.exception.DuplicateUserException;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;

import java.util.List;

public interface MailDao {

    String delete(String login);
    User get(String login);
    List<User> list();
    String add(User user) throws DuplicateUserException;
    String update(User user);
}