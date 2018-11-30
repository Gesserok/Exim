package ua.com.cib.exim.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.EximAliasesDao;
import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.EximAliase;

import java.util.List;

public class AliaseServiceImpl implements AliaseService{

    @Autowired
    private EximAliasesDao dao;

    public String add(EximAliase eximAliase) {
        return dao.add(eximAliase);
    }

    public String update(EximAliase eximAliase) {
        return dao.update(eximAliase);
    }

    public String delete(String eximAliase)  {
        return String.valueOf(dao.delete(eximAliase));
    }

    public EximAliase get(String eximAliase) {
        return dao.get(eximAliase);
    }

    public List<EximAliase> listOfAliase() {
        return dao.list();
    }

//    @Override
//    public List<EximAliase> list()  {
//        return dao.aliase();
//    }
//
//    @Override
//    public String update(EximAliase eximAliase) {
//        return dao.update(eximAliase);
//    }

//    public EximAliase get(String localPart) {
//        return dao.get(localPart);
//    }

}
