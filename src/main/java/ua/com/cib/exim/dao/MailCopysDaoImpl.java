package ua.com.cib.exim.dao;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;

import java.io.Serializable;
import java.util.List;

//@EnableTransactionManagement
public class MailCopysDaoImpl implements MailCopysDao {

    @Autowired
    private SessionFactory factory;

//    @Transactional
    @Override
    public int add(User user) {
        MailCopy mailCopy = new MailCopy(user.getLogin().concat("@").concat(user.getDomain()));
        Session session = factory.openSession();
        Serializable id = session.save(mailCopy);
        session.flush();
        session.close();
        return (Integer) id;
    }

//    @Transactional
    @Override
    public int update(User user) {
        MailCopy mailCopy = new MailCopy(user.getLogin().concat("@").concat(user.getDomain()));

        Session session = factory.openSession();
        session.update(mailCopy);
        Integer id = (Integer) session.getIdentifier(mailCopy);
        session.flush();
        session.close();
        return id;
    }

//    @Transactional
    @Override
    public int delete(String login) {
        Session session = factory.openSession();
        Query query =  session.createQuery("delete MailCopy where mail = :param");
        query.setParameter("param", login.concat("@cib.com.ua"));
        int result = query.executeUpdate();
        return result;
    }

//    @Transactional
    @Override
    public MailCopy get(String login) {
        Session session = factory.openSession();
        MailCopy mailCopy = (MailCopy) session.get(login.concat("@cib.com.ua"),MailCopy.class);
        session.close();
        return mailCopy;
    }

    @Transactional
    @Override
    public List<MailCopy> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<MailCopy> list = session.createQuery("from MailCopy").list();
        session.close();
        return list;
    }
}
