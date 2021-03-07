package com.company.repositories.IRepo;

import com.company.entities.Department;
import com.company.entities.Test;

import java.util.ArrayList;
import java.util.List;

public interface IDepartmentRepo {
    /**
     * abstract methods for the DepartmentRepo class
     */
    boolean createDepartment(Department department);
    boolean addDoctors(Department department);
    List<Department> getLocation();
}
