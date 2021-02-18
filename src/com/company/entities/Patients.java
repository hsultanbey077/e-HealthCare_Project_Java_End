package com.company.entities;

public class Patients {
    private int patient_id;
    private String name;
    private String surname;
    private String salary;
    private int test_id;
    public Patients(){}
    public Patients(String name, String surname,String salary,int test_id){
        setName(name);
        setSurname(surname);
        setSalary(salary);
        setTest_id(test_id);
    }
    public Patients(int patient_id,String name, String surname,String salary,int test_id){
        setPatient_id(patient_id);
        setName(name);
        setSurname(surname);
        setSalary(salary);
        setTest_id(test_id);
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

    public String getSalary() {
        return salary;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
}
