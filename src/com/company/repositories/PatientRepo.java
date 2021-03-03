package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Doctors;
import com.company.entities.Patients;
import com.company.repositories.IRepo.IDoctorsRepo;
import com.company.repositories.IRepo.IPatientRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PatientRepo implements IPatientRepo {
    private final IDB db;

    public PatientRepo(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createPatient(Patients patient) {


        return false;

    }

    @Override
    public Patients getPatientById(int patient_id) {

        return null;
    }

    @Override
    public List<Patients> getAllPatients() {

        return null;
    }
}
