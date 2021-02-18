package com.company.IRepo;

import com.company.entities.Patients;

public interface IPatientRepo {
    boolean createPatient(Patients patient);
    Patients getTestResult(int test_result);
}
