package com.company.controllers;

import com.company.entities.Department;
import com.company.repositories.IRepo.IDepartmentRepo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentController  {
    private final IDepartmentRepo departmentRepo;

    // Made department controller constructor
    public DepartmentController(IDepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    // and the method createDepartment function with returning boolean created or error
    public String createDepartment(String name, String location, String phone, ArrayList<Integer> doctors_id) {
        Department department = new Department(name, location, phone, doctors_id);
        boolean create = departmentRepo.createDepartment(department);
        boolean added = departmentRepo.addDoctorsToDepartment(department);

        if (added) {
            return "ERROR!";
        } return "ADDED!";

    }
    public String getLocation(){//selecting backend developers method
        List<Department> department = departmentRepo.getLocation();

        return department.toString();
    }

//    public boolean addDoctorsToDepartment(int department_id, ArrayList doctor_id){
//        Department department = new Department(department_id,doctor_id);
//
//    }

}
