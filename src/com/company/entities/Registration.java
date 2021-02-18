package com.company.entities;

public class Registration {
    private int registration_id;
    private int patient_id;
    private String password;
    public Registration(){}
    public Registration(int patient_id,String password){
        setPatient_id(patient_id);
        setPassword(password);
    }
    public Registration(int registration_id,int patient_id,String password){
        setRegistration_id(registration_id);
        setPatient_id(patient_id);
        setPassword(password);
    }
    //bkdaskdjkasda
//xzczxcz
    //645465
    //45465
    public int getPatient_id() {
        return patient_id;
    }
public  int getcost(){
        return 5 ;
}
    public int getRegistration_id() {
        return registration_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
