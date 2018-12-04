package ua.com.cib.exim.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.utils.Utils;

import java.io.Serializable;
import java.util.List;


@EnableTransactionManagement
public class UsersDaoImpl implements UsersDao{

    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public String add(User user) {
        user.setPassword(String.format("SHA2('%s'), 224", user.getDecrypt()));
        Session session = factory.openSession();
        Serializable id = session.save(user);
        session.flush();
        session.close();
        return (String) id;
    }

    @Transactional
    @Override
    public String update(User user) {
        user.setPassword(String.format("SHA2('%s',224)", user.getDecrypt()));
        Session session = factory.openSession();
        session.update(user);
        String id = (String) session.getIdentifier(user);
        session.flush();
        session.close();
        return id;
    }

    @Transactional
    @Override
    public String delete(String login) {
        Session session = factory.openSession();
        User user = (User) session.get(User.class, login);
        session.delete(user);
        Serializable id = session.getIdentifier(user);
        session.flush();
        session.close();
        return (String) id;
    }

    @Transactional
    @Override
    public User get(String login) {
        Session session = factory.openSession();
        User user = (User) session.get(User.class, login);
        session.close();
        return user;
    }

    @Transactional
    @Override
    public List<User> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<User> list = session.createQuery("from User").list();
        session.close();
        return list;
    }
}
