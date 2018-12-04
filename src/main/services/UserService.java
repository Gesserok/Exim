package ua.com.cib.exim.services;

import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;

import java.util.List;

public interface UserService {

    String add(User user);
    String update(User user);
    String delete(String login) throws SQLEntityAbsentException;
    User get(String login);
    List<User> list();

}