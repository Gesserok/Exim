package ua.com.cib.exim.services;

import ua.com.cib.exim.model.User;

import java.util.List;

public interface UserService {

    int add(User user);
    int update(User user);
    int delete(int id);
    User get(int id);
    List<User> list();

}
