package com.clinic.dao.impl;
import com.clinic.dao.DrugDao;
import com.clinic.dao.*;
import com.clinic.models.Drug;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ezzy on 5/8/15.
 */
public class DrugDaoImpl implements DrugDao
{
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Drug drug)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;
    }

    @Override
    public Drug getDrugById(int id)
    {
        return null;
    }



    @Override
    public List<Drug> getList()
    {
        return null;
    }

    @Override
    public int updateRow(Drug drug) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
