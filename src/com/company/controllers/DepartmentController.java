package com.company.controllers;

import com.company.entities.Department;
import com.company.repositories.IRepo.IDepartmentRepo;

import java.util.ArrayList;

public class DepartmentController {
    private final IDepartmentRepo departmentRepo;

    public DepartmentController(IDepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public String createDepartment(String name, String location, String phone, ArrayList<Integer> doctors_id) {
        Department department = new Department(name, location, phone, doctors_id);
        boolean create = departmentRepo.createDepartment(department);
        boolean added = departmentRepo.addDoctors(department);

        if (added) {
            return "ERROR!";
        } return "ADDED!";

    }
}
