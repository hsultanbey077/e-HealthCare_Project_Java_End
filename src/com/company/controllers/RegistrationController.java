package com.company.controllers;

import com.company.entities.Registration;
import com.company.repositories.IRepo.IRegistrationRepo;

public class RegistrationController {
    private final IRegistrationRepo repo;

    public RegistrationController(IRegistrationRepo repo) {
        this.repo = repo;
    }
    public String createRegistration(int registration_id,int patient_id,int doctor_id,int test_id){
        Registration registration =new Registration();
        boolean created= repo.createRegistration(registration);
        return (created ? "Registration was done!" : "Registration creation was failed!");
    }
}
