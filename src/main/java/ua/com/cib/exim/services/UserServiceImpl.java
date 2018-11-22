package ua.com.cib.exim.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.UsersDao;
import ua.com.cib.exim.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDao dao;

    public int add(User user) {
        return dao.add(user);
    }

    public int update(User user) {
        return dao.update(user);
    }

    public int delete(int id) {
        return dao.delete(id);
    }

    public User get(int id) {
        return dao.get(id);
    }

    public List<User> list() {
        return dao.list();
    }
}
