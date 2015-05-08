package com.clinic.models;

import javax.persistence.*;

/**
 * Created by ezzy on 5/7/15.
 */
@Entity
@Table(name="patient")
public class Patient {

//        @Id
//        @GeneratedValue
//        @Column(name = "patient_id")
//        private int id;

        @Id
        @GeneratedValue
        @Column(name = "patient_id")
        private int patient_id;

        @Column(name = "first_name")
        private String fname;

        @Column(name = "last_name")
        private String last_name;

        @Column(name = "dob")
        private String dob;

        @Column(name = "timestamp")
        private String timestamp;

    public int getId()
    {
        return patient_id;
    }

    public void setId(int patient_id)
    {
        this.patient_id = patient_id;
    }


    public String getDob() {
        return dob;
    }

    public String getFname() {
        return fname;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setFname(String fname) {

        this.fname = fname;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

   public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
