package ua.com.cib.exim.services;

import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;

import java.util.List;

public interface AliaseService {
    List<EximAliase> listOfAliase();
    String update(EximAliase eximAliase);
    String add(EximAliase eximAliase);
    EximAliase get(String eximAliase);
    String delete(String login);

    List<EximAliase> listOfAliase(User currentUser);
}
