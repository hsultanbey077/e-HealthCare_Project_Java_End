package com.company.controllers;

import com.company.entities.Doctors;
import com.company.repositories.IRepo.IDoctorsRepo;

import java.util.List;

public class DoctorController {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    private final IDoctorsRepo repo;

    public DoctorController(IDoctorsRepo repo) {
        this.repo = repo;
    }

    public String createDoctor(int doc_id, String doc_name, String doc_surname){
        Doctors doctor = new Doctors(doc_id,doc_name,doc_surname);

        boolean created = repo.createDoctor(doctor);
        return ANSI_GREEN + "Doctor was created!" + ANSI_RESET;
    }

    public String getDoctor(int doc_id){
        Doctors doctor = repo.getDoctorById(doc_id);

        return (doctor == null ? ANSI_RED + "Doctor was not found!" + ANSI_RESET : doctor.toString());
    }

    public String getAllDoctors(){
        List<Doctors> Doctors = repo.getAllDoctors();

        return Doctors.toString();
    }

}
