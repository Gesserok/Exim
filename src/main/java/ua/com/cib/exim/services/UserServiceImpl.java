package ua.com.cib.exim.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.MailDao;
import ua.com.cib.exim.dao.UsersDao;
import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private MailDao dao;

    public String add(User user) {
        return dao.add(user);
    }

    public String update(User user) {
        return dao.update(user);
    }

    public String delete(String login) throws SQLEntityAbsentException {
        return String.valueOf(dao.delete(login));
    }

    public User get(String login) {
        return dao.get(login);
    }

    public List<User> list() {
        return dao.list();
    }
}
