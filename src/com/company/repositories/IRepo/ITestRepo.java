package com.company.repositories.IRepo;

import com.company.entities.Test;

public interface ITestRepo {
    /**
     * abstract methods for the TestRepo class
     */
    boolean createTest(Test test);
    String getTestResult(Test test);
    int getTestId(Test test);
}
