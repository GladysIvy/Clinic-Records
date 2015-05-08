package com.clinic.dao.impl;

import com.clinic.dao.PatientDao;
import com.clinic.models.Patient;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


/**
 * Created by ezzy on 5/7/15.
 */

public class PatientDaoImpl implements PatientDao {

        @Autowired
        SessionFactory sessionFactory;

        @Transactional
        @Override
        public int insertIntoRow(Patient patient) {
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(patient);
            tx.commit();
            Serializable patient_id= session.getIdentifier(patient);
            session.close();
            return (Integer) patient_id;
        }

        @Override
        public Patient getPatientById(int id) {
            Session session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(Patient.class);
            criteria.add(Restrictions.eq("patient_id", id));
            Patient patient = (Patient) criteria.uniqueResult();
            session.close();
            return patient;
        }

        @Override
        public List<Patient> getList() {
            Session session = sessionFactory.openSession();
            @SuppressWarnings("unchecked")
            List<Patient> patientList = session.createQuery("from Patient").list();
            session.close();
            return patientList;
        }

        @Override
        public int updateRow(Patient patient) {

            return 0;
        }

        @Override
        public int deleteRow(int patient_id) {

            return 0;
        }
    }


