package com.company.entities;

public class Registration {
    private int registration_id;
    private int patient_id;
    private int doctor_id;
    private int test_id;


    public Registration() {

    }

    public Registration(int registration_id, int patient_id, int doctor_id, int test_id) {
        this.registration_id = registration_id;
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.test_id = test_id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public int getRegistration_id() {
        return registration_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registration_id=" + registration_id +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                ", test_id=" + test_id +
                '}';
    }
}
