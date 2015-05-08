package com.clinic.services;

import com.clinic.dao.DrugDao;
import com.clinic.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ezzy on 5/8/15.
 */
public class DrugServiceImpl implements DrugService {

    @Autowired
    DrugDao drugDao;

    @Override
    public int insertRow(Drug drug)
    {
        return drugDao.insertRow(drug);
    }

    @Override
    public Drug getDrugById(int id)
    {
        return drugDao.getDrugById(id);
    }

    @Override
    public List<Drug> getList()
    {
        return drugDao.getList();
    }

    @Override
    public int updateRow(Drug drug)
    {
        return 0;
    }

    @Override
    public int deleteRow(int id)
    {
        return 0;
    }
}
