package ua.com.cib.exim.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.model.UserForward;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

//@EnableTransactionManagement

public class UserForwardsDaoImpl implements UserForwardsDao {

    @Autowired
    private SessionFactory factory;

//    @Transactional
    @Override
    public String add(User user) {
        UserForward userForward = new UserForward(user.getLogin());
        Session session = factory.openSession();
        Serializable id = session.save(userForward);
        session.flush();
        session.close();
        return (String) id;
    }

//    @Transactional
    @Override
    public String update(User user) {
        UserForward userForward = new UserForward(user.getLogin());
        Session session = factory.openSession();
        session.update(userForward);
        Serializable id = session.getIdentifier(userForward);
        session.flush();
        session.close();
        return (String) id;
    }

//    @Transactional
    @Override
    public String delete(String login) {
        Session session = factory.openSession();
        UserForward userForward = (UserForward) session.get(UserForward.class, login);
        session.delete(userForward);
        Serializable id = session.getIdentifier(userForward);
        session.flush();
        session.close();
        return (String) id;
    }

//    @Transactional
    @Override
    public UserForward get(String login) {
        Session session = factory.openSession();
        UserForward userForward = (UserForward) session.get(login,UserForward.class);
        session.close();
        return userForward;
    }

//    @Transactional
    @Override
    public List<UserForward> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<UserForward> list = session.createQuery("from UserForward").list();
        session.close();
        return list;
    }
}
