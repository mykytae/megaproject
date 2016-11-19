package com.megaproject.dao.BankAccountImpl;

import com.megaproject.dao.BankAccountDao;
import com.megaproject.entity.BankAccount;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nik on 17.11.2016.
 */
public class BankAccountDaoImpl implements BankAccountDao {

    @Autowired
    SessionFactory sessionFactory;

    private List<BankAccount> bankList;

    public BankAccountDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    public BankAccountDaoImpl(){

    }
    @Override
    @Transactional
    public List<BankAccount> getBankAccountList(){

        bankList = (List<BankAccount>)sessionFactory.getCurrentSession()
                .createCriteria(BankAccount.class).setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY).list();
        return bankList;

    }
}
