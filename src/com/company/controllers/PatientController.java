package com.company.controllers;

import com.company.entities.Doctors;
import com.company.entities.Patients;
import com.company.repositories.IRepo.IPatientRepo;

import java.util.List;

public class PatientController {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    //Color
    private final IPatientRepo repo;
    //PatientController's constructor
    public PatientController(IPatientRepo repo) {
        this.repo = repo;
    }
    //createPatient method if it created
    public String createPatient(int patient_id, String name, String surname){
        Patients patient = new Patients(patient_id,name,surname);

        boolean created = repo.createPatient(patient);
        return ANSI_GREEN + "Patient was created!" + ANSI_RESET;
    }
    //getDoctor by id function and goes to repositories
    public String getDoctor(int patient_id){
        Patients patient = repo.getPatientById(patient_id);

        return (patient == null ? ANSI_RED + "Patient was not found!" + ANSI_RESET : patient.toString());
    }

    //getAllPatients ---> repositories
    public String getAllPatients(){
        List<Patients> patients = repo.getAllPatients();

        return patients.toString();
    }
    //giveTestResult method ---> repositories
    public String giveTestResult(int pat_id, int test_id){

        String response= repo.getResults(pat_id,test_id);
        return response;
    }
}
