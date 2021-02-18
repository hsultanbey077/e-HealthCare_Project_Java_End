package com.company.IRepo;

import com.company.entities.Department;

public interface IDepartmentRepo {
    boolean createDepartment(Department department);
    Department getLocation(String location);
}
