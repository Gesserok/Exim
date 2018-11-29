package ua.com.cib.exim.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.MailCopy;
import ua.com.cib.exim.model.User;

import java.util.List;

@EnableTransactionManagement
public class MailDaoImpl implements MailDao {

    @Autowired
    private UsersDao usersDao;
    @Autowired
    private UserForwardsDao userForwardsDao;
    @Autowired
    private MailCopysDao mailCopysDao;
    @Autowired
    private EximAliasesDao eximAliasesDao;


    @Transactional
    @Override
    public String add(User user) {
        String id = usersDao.add(user);
        userForwardsDao.add(user);
        mailCopysDao.add(user);
        eximAliasesDao.update("AllBank", user);
        return id;
    }

    @Transactional
    @Override
    public String update(User user) {
        String id = usersDao.update(user);
        return id;
    }

    @Transactional
    @Override
    public String delete(String login) {
        String id = usersDao.delete(login);
        mailCopysDao.delete(login);
        userForwardsDao.delete(login);
        return id;
    }

    @Transactional
    @Override
    public User get(String login) {
        return usersDao.get(login);
    }
    @Transactional
    @Override
    public List<User> list() {
        return usersDao.list();
    }
}
