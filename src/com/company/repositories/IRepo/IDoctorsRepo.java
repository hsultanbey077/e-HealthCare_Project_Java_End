package com.company.repositories.IRepo;

import com.company.entities.Doctors;

import java.util.List;

public interface IDoctorsRepo {
    /**
     * abstract methods for the DoctorsRepo class
     */
    boolean createDoctor(Doctors doctor);
    Doctors getDoctorById(int patient_id);
    List<Doctors> getAllDoctors();
//    Doctors deleteDoctorByID(int id);

}
