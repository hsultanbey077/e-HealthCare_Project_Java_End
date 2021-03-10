package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.*;
import com.company.entities.Test;
import com.company.repositories.*;
import com.company.repositories.IRepo.*;

public class main {
    public static void main(String[] args) throws Exception {

        IDB db = new DB();
        IPatientRepo repo=new PatientRepo(db);
        IRegistrationRepo repo2 = new RegistrationRepo(db);
        IDoctorsRepo repo3=new DoctorRepo(db);
        IDepartmentRepo repo4 = new DepartmentRepo(db);
        ITestRepo repo5=new TestRepo(db);
        TestController controller5= new TestController(repo5);
        PatientController controller = new PatientController(repo);
        RegistrationController controller2=new RegistrationController(repo2);
        DoctorController controller3=new DoctorController(repo3);
        DepartmentController controller4=new DepartmentController(repo4);
        MyApplication app = new MyApplication(controller2, controller, controller3, controller4, controller5);
        app.start();

    }
}
