package com.clinic.services;

import com.clinic.models.Patient;

import java.util.List;

/**
 * Created by ezzy on 5/7/15.
 */
public interface PatientService {


        public int insertIntoRow(Patient patient);

       public Patient getPatientById(int patient_id);

        public List<Patient> getList();

        public int updateRow(Patient patient);

        public int deleteRow(int patient_id);
}
