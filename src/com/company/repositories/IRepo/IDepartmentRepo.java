package com.company.repositories.IRepo;

import com.company.entities.Department;
import jdk.swing.interop.DispatcherWrapper;

import java.util.List;

public interface IDepartmentRepo {
    /**
     * abstract methods for the DepartmentRepo class
     */
    boolean createDepartment(Department department);
    boolean addDoctors(Department department);
    List<Department> getLocation();
}
