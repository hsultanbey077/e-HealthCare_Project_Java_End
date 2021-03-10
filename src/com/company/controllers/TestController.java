package com.company.controllers;

import com.company.entities.Doctors;
import com.company.entities.Test;
import com.company.repositories.IRepo.ITestRepo;

public class TestController {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    private final ITestRepo testRepo;

    public TestController(ITestRepo testRepo) {
        this.testRepo = testRepo;
    }
    public String createTest(int test_id, String test_name, String test_date){
        Test test = new Test(test_id,test_date,test_name);

        boolean created = testRepo.createTest(test);
        return ANSI_GREEN + "Doctor was created!" + ANSI_RESET;
    }
}
