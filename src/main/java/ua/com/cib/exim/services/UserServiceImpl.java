package ua.com.cib.exim.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.EximAliasesDao;
import ua.com.cib.exim.dao.MailDao;
import ua.com.cib.exim.exception.DuplicateUserException;
import ua.com.cib.exim.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private MailDao dao;
//    @Autowired
//    private EximAliasesDao aliaseDao;


    @Override
    public String add(User user) throws DuplicateUserException {
        return dao.add(user);
    }



    public String update(User user) {
        return dao.update(user);
    }



    public String delete(String login)  {
        return String.valueOf(dao.delete(login));
    }

    public User get(String login) {
        return dao.get(login);
    }

    public List<User> list() {
        return dao.list();
    }


}
