package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.DepartmentController;
import com.company.controllers.DoctorController;
import com.company.controllers.PatientController;
import com.company.controllers.RegistrationController;
import com.company.repositories.DepartmentRepo;
import com.company.repositories.DoctorRepo;
import com.company.repositories.IRepo.IDepartmentRepo;
import com.company.repositories.IRepo.IDoctorsRepo;
import com.company.repositories.IRepo.IPatientRepo;
import com.company.repositories.IRepo.IRegistrationRepo;
import com.company.repositories.PatientRepo;
import com.company.repositories.RegistrationRepo;

public class main {
    public static void main(String[] args) throws Exception {

        IDB db = new DB();
        IPatientRepo repo=new PatientRepo(db);
        IRegistrationRepo repo2 = new RegistrationRepo(db);
        IDoctorsRepo repo3=new DoctorRepo(db);
        IDepartmentRepo repo4 = new DepartmentRepo(db);
        PatientController controller = new PatientController(repo);
        RegistrationController controller2=new RegistrationController(repo2);
        DoctorController controller3=new DoctorController(repo3);
        DepartmentController controller4=new DepartmentController(repo4);
        MyApplication app = new MyApplication(controller2, controller, controller3, controller4);
        app.start();

    }
}
