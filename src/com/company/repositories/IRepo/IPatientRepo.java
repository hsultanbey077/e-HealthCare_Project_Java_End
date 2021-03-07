package com.company.repositories.IRepo;

import com.company.entities.Patients;

import java.util.List;

public interface IPatientRepo {
    /**
     * abstract methods for the PatientRepo class
     */
    boolean createPatient(Patients patient);
    Patients getPatientById(int id);
    List<Patients> getAllPatients();
    String getResults(int pat_id,int test_id);
}
