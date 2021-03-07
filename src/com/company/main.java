package com.company;

import com.company.DB.DB;
import com.company.DB.interfaces.IDB;
import com.company.controllers.TestController;
import com.company.repositories.IRepo.ITestRepo;
import com.company.repositories.TestRepo;

public class main {
    public static void main(String[] args) throws Exception {

        IDB db = new DB();
        ITestRepo repo = new TestRepo(db);
        TestController controller = new TestController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();

    }
}
