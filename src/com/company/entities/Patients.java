package com.company.entities;

public class Patients {
    private int patient_id;
    private String name;
    private String surname;
    private String expenditure;
    private int test_id;
    private String test_result;
    public Patients(){}
    public Patients(String name, String surname,String expenditure,int test_id,String test_result){
        setName(name);
        setSurname(surname);
        setExpenditure(expenditure);
        setTest_id(test_id);
        setTest_result(test_result);
    }
    public Patients(int patient_id,String name, String surname,String expenditure,int test_id,String test_result){
        setPatient_id(patient_id);
        setName(name);
        setSurname(surname);
        setExpenditure(expenditure);
        setTest_id(test_id);
        setTest_result(test_result);
    }

    public int getPatient_id() {
        return patient_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getExpenditure() {
        return expenditure;
    }

    public int getTest_id() {
        return test_id;
    }

    public String getTest_result() {
        return test_result;
    }

    public void setTest_result(String test_result) {
        this.test_result = test_result;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpenditure(String expenditure) {
        this.expenditure = expenditure;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
}
