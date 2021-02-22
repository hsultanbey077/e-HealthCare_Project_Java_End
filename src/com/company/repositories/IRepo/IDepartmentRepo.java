package com.company.repositories.IRepo;

import com.company.entities.Department;

import java.util.ArrayList;

public interface IDepartmentRepo {
//    boolean createDepartment(Department department);
//    Department getLocation(String location);
    boolean createDepartment(Department department);
    boolean addDoctors(Department department);
}
