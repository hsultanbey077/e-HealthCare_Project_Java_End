package com.company.repositories.IRepo;

import com.company.entities.Patients;

import java.util.List;

public interface IPatientRepo {
    /**
     * abstract methods for the PatientRepo class
     */
    boolean createPatient(Patients patient);
    Patients getTestResult(int test_result);
    Patients getPatientById(int id);
    List<Patients> getAllPatients();
}
