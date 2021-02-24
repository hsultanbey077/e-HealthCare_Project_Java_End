package com.company.repositories;

import com.company.entities.Doctors;
import com.company.repositories.IRepo.IDoctorsRepo;

public class DoctorRepo implements IDoctorsRepo {


    @Override
    public boolean createDoctor(Doctors doctor) {
        return false;
    }

    @Override
    public IDoctorsRepo getPatientById(int patient_id) {
        return null;
    }
}
