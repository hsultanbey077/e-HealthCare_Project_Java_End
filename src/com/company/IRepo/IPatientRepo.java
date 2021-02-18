package com.company.IRepo;

import com.company.entities.Patients;

public interface IPatientRepo {
    boolean createPatient(Patients patient);
    Patients getTestId(int test_id);
}
