package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.DepartmentController;
import com.company.repositories.DepartmentRepo;
import com.company.repositories.IRepo.IDepartmentRepo;

public class main {
    public static void main(String[] args) throws Exception {
        // running of our application

        IDB db = new DB();
        IDepartmentRepo repo = new DepartmentRepo(db);
        DepartmentController controller = new DepartmentController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();

    }
}
