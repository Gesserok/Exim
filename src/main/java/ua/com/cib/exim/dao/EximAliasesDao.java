package ua.com.cib.exim.dao;

import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;

import java.util.List;

public interface EximAliasesDao {

    String add(EximAliase eximAliase);
    String update(EximAliase eximAliase);
    String update(String eximAliase, User user);
    String delete(String login);
    EximAliase get(String login);
    List<EximAliase> list();

}
