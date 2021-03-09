package com.company.repositories.IRepo;

import com.company.entities.Department;
import java.util.List;

public interface IDepartmentRepo {
    /**
     * abstract methods for the DepartmentRepo class
     */
    boolean createDepartment(Department department);
    boolean addDoctorsToDepartment(Department department);
    List<Department> getLocation();
}
