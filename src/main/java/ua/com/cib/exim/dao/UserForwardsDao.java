package ua.com.cib.exim.dao;

import ua.com.cib.exim.model.User;
import ua.com.cib.exim.model.UserForward;

import java.util.List;

public interface UserForwardsDao {
    String add(User user);
    String update(User user);
    String delete(String login);
    UserForward get(String login);
    List<UserForward> list();
}
