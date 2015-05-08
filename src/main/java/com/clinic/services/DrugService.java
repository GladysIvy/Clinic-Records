package com.clinic.services;

import com.clinic.models.Drug;
import com.clinic.models.Drug;

import java.util.List;

/**
 * Created by ezzy on 5/8/15.
 */
public interface DrugService {
    public int insertRow(Drug drug);

    public Drug getDrugById(int id);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int id);
}

