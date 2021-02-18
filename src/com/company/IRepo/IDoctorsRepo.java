package com.company.IRepo;

import com.company.entities.Doctors;

public interface IDoctorsRepo {
    boolean createDoctor(Doctors doctor);
    IDoctorsRepo getPatientById(int patient_id);

}
