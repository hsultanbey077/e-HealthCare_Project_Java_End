package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.PatientController;
import com.company.controllers.TestController;
import com.company.repositories.IRepo.IPatientRepo;
import com.company.repositories.IRepo.ITestRepo;
import com.company.repositories.PatientRepo;
import com.company.repositories.TestRepo;

public class main {
    public static void main(String[] args) throws Exception {

        IDB db = new DB();
        IPatientRepo repo=new PatientRepo(db);
        PatientController controller = new PatientController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();

    }
}
