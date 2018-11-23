package ua.com.cib.exim.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.UsersDao;
import ua.com.cib.exim.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDao dao;

    public String add(User user) {
        return dao.add(user);
    }

    public int update(User user) {
        return dao.update(user);
    }

    public int delete(String login) {
        return dao.delete(login);
    }

    public User get(String login) {
        return dao.get(login);
    }

    public List<User> list() {
        return dao.list();
    }
}
