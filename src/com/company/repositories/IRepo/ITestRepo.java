package com.company.repositories.IRepo;

import com.company.entities.Test;

public interface ITestRepo {
    boolean createTest(Test test);
    String getTestResult(Test test);
    int getTestId(Test test);
}
