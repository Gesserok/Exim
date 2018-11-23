package ua.com.cib.exim.dao;

import ua.com.cib.exim.model.User;

import java.util.List;

public interface UsersDao {

    String add(User user);
    int update(User user);
    int delete(String login);
    User get(String login);
    List<User> list();

}
