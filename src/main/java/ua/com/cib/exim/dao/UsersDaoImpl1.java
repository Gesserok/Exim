//package ua.com.cib.exim.dao;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.Transactional;
//import ua.com.cib.exim.model.User;
//import ua.com.cib.exim.utils.Utils;
//
//import java.io.Serializable;
//import java.util.List;
//
//
//@EnableTransactionManagement
//public class UsersDaoImpl1 implements UsersDao{
//
//    @Autowired
//    private SessionFactory factory;
//
//    @Transactional
//    @Override
//    public int add(User user) {
//        user.setEncrypt(Utils.encryptor(user.getDecrypt()));
//        Session session = factory.openSession();
//        Serializable id = session.save(user);
//        session.flush();
//        session.close();
//        return (Integer) id;
//    }
//
//    @Transactional
//    @Override
//    public int update(User user) {
////        System.out.println("ENCRIPT : " + user.getId() + " " + user.getEncrypt());
//        user.setEncrypt("new Encr");
//        Session session = factory.openSession();
//        session.update(user);
//        Serializable id = session.getIdentifier(user);
//        session.flush();
//        session.close();
//        return (Integer) id;
//    }
//
//    @Transactional
//    @Override
//    public int delete(int id) {
//        Session session = factory.openSession();
//        User user = (User) session.get(User.class, id);
//        session.delete(user);
//        Serializable serId = session.getIdentifier(user);
//        session.flush();
//        session.close();
//        return (Integer) serId;
//    }
//
//    @Transactional
//    @Override
//    public User get(int id) {
//        Session session = factory.openSession();
//        User user = (User) session.get(User.class, id);
//        session.close();
//        return user;
//    }
//
//    @Transactional
//    @Override
//    public List<User> list() {
//        Session session = factory.openSession();
//        @SuppressWarnings("unchecked")
//        List<User> list = session.createQuery("from User").list();
//        session.close();
//        return list;
//    }
//}
