package ua.com.cib.exim.dao;

import ua.com.cib.exim.exception.DuplicateUserException;
import ua.com.cib.exim.model.User;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface UsersDao {

    String add(User user) throws DuplicateUserException;
    String update(User user);
    String delete(String login);
    User get(String login);
    List<User> list();

}
