package com.company.controllers;

import com.company.entities.Test;
import com.company.repositories.IRepo.ITestRepo;

public class TestController {
    private final ITestRepo repo;

    public TestController(ITestRepo repo) {
        this.repo = repo;
    }

}
