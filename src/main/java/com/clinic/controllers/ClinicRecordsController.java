package com.clinic.controllers;
import com.clinic.models.Drug;
import com.clinic.models.Patient;
import com.clinic.services.DrugService;
import com.clinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ezzy on 5/7/15.
 */
@Controller
public class ClinicRecordsController {

    @Autowired
    PatientService patientService;
    DrugService drugService;


    @RequestMapping("/index")
    public ModelAndView form(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Patients form");
        model.setViewName("record");

        return model;
    }



    @RequestMapping("/index_drugs")
    public ModelAndView form_drugs(){

        ModelAndView model = new ModelAndView();
        List<Patient> patientsList = patientService.getList();
        model.addObject("patientList", patientsList);
        model.setViewName("drugs");

        return model;
    }
    @RequestMapping("/create")
    ModelAndView create(@RequestParam(value = "fname", required = false) String first_name,
                        @RequestParam(value = "lname", required = false) String last_name,
                        @RequestParam(value = "dob", required = false) String dob)

{

        Patient patient = new Patient();

        patient.setFname(first_name);

        patient.setLast_name(last_name);

        patient.setDob(dob);


        // patient.setTimestamp(timestamp);



    ModelAndView model = new ModelAndView();
    patientService.insertIntoRow(patient);
   // patientService.insertIntoRow(Patient patient);


        model.setViewName("record");



        return model;
    }



   /* @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView model = new ModelAndView();



      List<Patient> patientList = patientService.getList();

        for (Patient patient : patientList) {

          *//* System.out.println(patient.getFname() + " " + patient.getLast_name() + " " + patient.getDob() +  " " + patient.getTimestamp());
            System.out.println("\n\n**********************************\n\n");*//*
            model.addObject("patients", patientList);
            model.setViewName("displayPatients");
        }
        return model;

    }*/

    @RequestMapping("/drugs")
    public ModelAndView patient_drugs()
    {
        ModelAndView model = new ModelAndView();
        List<Patient> patientsList = patientService.getList();
        model.addObject("patientList", patientsList);
        model.setViewName("drugs");

        return model;
    }


    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "patient_id", required = false) String patient_id,
                            @RequestParam(value = "drug_name", required = false) String drug_name)
    {
        //ModelAndView model = new ModelAndView();
        ModelAndView model = new ModelAndView();

       // Drug drug = new Drug();
        Drug drug=new Drug();
        drug.setDname(drug_name);
        drug.setPatient_id(patient_id);
        drugService.insertRow(drug);

        model.setViewName("drugs");
        return model;
    }



    @RequestMapping("/list")
    public  ModelAndView viewList()
    {
        ModelAndView model = new ModelAndView();
        List<Drug> drugsList = drugService.getList();
        model.addObject("detailsList", drugsList);

        model.setViewName("display");
        return model;


    }
}











