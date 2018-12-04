package ua.com.cib.exim.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;

import java.io.Serializable;
import java.util.List;


@EnableTransactionManagement
public class EximAliasesDaoImpl implements EximAliasesDao {

    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public String add(EximAliase eximAliase) {
        Session session = factory.openSession();
        Serializable id = session.save(eximAliase);
        session.flush();
        session.close();
        return (String) id;
    }

    @Transactional
    @Override
    public String update(EximAliase eximAliase) {
        Session session = factory.openSession();
        session.update(eximAliase);
        String id = (String) session.getIdentifier(eximAliase);
        session.flush();
        session.close();
        return id;
    }

    @Transactional
    @Override
    public String update(String eximAliaseBean, User user) {
        Session session = factory.openSession();
        EximAliase eximAliase = get(eximAliaseBean);
        String recipients = eximAliase.getRecipients();
        if (recipients == null) recipients = "";
        if (recipients.equals("") || recipients.isEmpty()) {
            eximAliase.setRecipients(user.getLogin());
        } else {
            eximAliase.setRecipients(recipients.concat(",").concat(user.getLogin()));
        }
        String e1 = update(eximAliase);
        session.flush();
        session.close();
        return e1;
    }

    @Transactional
    @Override
    public String delete(String eximAliaseName) {
        Session session = factory.openSession();
        EximAliase eximAliase = (EximAliase) session.get(EximAliase.class, eximAliaseName);
        session.delete(eximAliase);
        Serializable id = session.getIdentifier(eximAliase);
        session.flush();
        session.close();
        return (String) id;
    }

    @Transactional
    @Override
    public EximAliase get(String login) {
        Session session = factory.openSession();
        EximAliase eximAliase = (EximAliase) session.get(EximAliase.class, login);
        session.close();
        return eximAliase;
    }

    @Transactional
    @Override
    public List<EximAliase> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<EximAliase> list = session.createQuery("from EximAliase").list();
        session.close();
        return list;
    }
}
