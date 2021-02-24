package com.company.repositories.IRepo;

import com.company.entities.Doctors;

import java.util.List;

public interface IDoctorsRepo {
    boolean createDoctor(Doctors doctor);
    IDoctorsRepo getDoctorById(int patient_id);
    List<Doctors> getAllDoctors();

}
