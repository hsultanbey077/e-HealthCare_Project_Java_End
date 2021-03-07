package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.PatientController;
import com.company.controllers.RegistrationController;
import com.company.repositories.IRepo.IPatientRepo;
import com.company.repositories.IRepo.IRegistrationRepo;
import com.company.repositories.PatientRepo;
import com.company.repositories.RegistrationRepo;

public class main {
    public static void main(String[] args) throws Exception {

        IDB db = new DB();
        IPatientRepo repo=new PatientRepo(db);
        IRegistrationRepo repo2 = new RegistrationRepo(db);
        PatientController controller = new PatientController(repo);
        RegistrationController controller2=new RegistrationController(repo2);
        MyApplication app = new MyApplication(controller2, controller);
        app.start();

    }
}
