package com.company.entities;

public class Doctors {
    private int doc_id;
    private String doc_name;
    private String doc_surname;
    private int patient_id;
    public Doctors(){}
    public Doctors(String doc_name, String doc_surname, int patient_id){
        setDoc_name(doc_name);
        setDoc_surname(doc_surname);
        setPatient_id(patient_id);
    }
    public Doctors(int doc_id,String doc_name, String doc_surname, int patient_id){
        setDoc_id(doc_id);
        setDoc_name(doc_name);
        setDoc_surname(doc_surname);
        setPatient_id(patient_id);
    }

    public int getDoc_id() {
        return doc_id;
    }
    //sdfdsffdsfdsfsdfd
    public String getDoc_name() {
        return doc_name;
    }

    public String getDoc_surname() {
        return doc_surname;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public void setDoc_surname(String doc_surname) {
        this.doc_surname = doc_surname;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
}
