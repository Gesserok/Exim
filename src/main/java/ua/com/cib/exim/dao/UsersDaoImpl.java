package ua.com.cib.exim.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.utils.Utils;

import java.io.Serializable;
import java.util.List;

public class UsersDaoImpl implements UsersDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public int add(User user) {
        user.setEncrypt(Utils.encryptor(user.getDecrypt()));
        Session session = sessionFactory.openSession();
        Serializable id = session.save(user);
        session.close();
        return (Integer) id;
    }

    @Transactional
    @Override
    public int update(User user) {
        Session session = sessionFactory.openSession();
        session.update(user);
        Serializable id = session.getIdentifier(session);
        session.close();
        return (Integer) id;
    }

    @Transactional
    @Override
    public int delete(int id) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
        session.delete(user);
        Serializable serId = session.getIdentifier(user);
        session.close();
        return (int) serId;
    }

    @Transactional
    @Override
    public User get(int id) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
        session.close();
        return user;
    }

    @Transactional
    @Override
    public List<User> list() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<User> list = session.createQuery("from User").list();
        session.close();
        return list;
    }
}
