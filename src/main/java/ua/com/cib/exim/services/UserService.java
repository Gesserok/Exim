package ua.com.cib.exim.services;

import ua.com.cib.exim.model.User;

import java.util.List;

public interface UserService {

    String add(User user);
    int update(User user);
    int delete(String login);
    User get(String login);
    List<User> list();

}
