package com.company.entities;

public class Patients {
    private int patient_id;
    private String name;
    private String surname;

    public Patients(){

    }

    public Patients(String name, String surname){
        setName(name);
        setSurname(surname);

    }

    public Patients(int patient_id,String name, String surname){
        setPatient_id(patient_id);
        setName(name);
        setSurname(surname);

    }

    public Patients(int patient_id, String name, String surname, double expenditure, int test_id, String test_result) {
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
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Method toString to output result for getAll method
     * */
    @Override
    public String toString() {
        return "Patients{" +
                "patient_id=" + patient_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
