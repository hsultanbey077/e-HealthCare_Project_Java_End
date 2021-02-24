package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Department;
import com.company.repositories.IRepo.IDepartmentRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DepartmentRepo implements IDepartmentRepo {
    private final IDB db;

    public DepartmentRepo(IDB idb) {
        this.db = idb;
    }

    @Override
    public boolean createDepartment(Department department) {
        Connection con = null;
        try {
                con = db.getConnection();
                String sql = "INSERT INTO Department(dep_name, dep_location, dep_phone) VALUES(?,?,?)";
                PreparedStatement st = con.prepareStatement(sql);

                st.setString(1, department.getDep_name());
                st.setString(2, department.getLocation());
                st.setString(3, department.getDep_phone());

            return st.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }finally {
            try{
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean addDoctors(Department department) {
        Connection con = null;
        try {
            int department_id = this.getDepartmentId(department);

            if (department_id == 0) {
                return false;
            }
            String sql = "INSERT INTO department_doctor(department_id, doctor_id) VALUES (?,?)";
            boolean executed;

            ArrayList<Boolean> booleans = new ArrayList<>();
            for (Integer doctor_id: department.getDoctors_id()) {
                con = null;
                con = db.getConnection();
                PreparedStatement st = con.prepareStatement(sql);

                st.setInt(1, department_id);
                st.setInt(2, doctor_id);
                executed = st.execute();
                booleans.add(executed);
            }

            for (Boolean bool: booleans) {
                if (!bool) {
                    return false;
                } return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }finally {
            try{
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }


private Integer getDepartmentId(Department department) {
    Connection con = null;
    try{
        con = db.getConnection();
        String sql = "SELECT dep_id FROM Department WHERE dep_name=?";
        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, department.getDep_name());

        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            Integer id = rs.getInt("dep_id");
            return id;
        }

    } catch (SQLException throwables) {
        throwables.printStackTrace();
    } catch (ClassNotFoundException classNotFoundException) {
        classNotFoundException.printStackTrace();
    }finally {
        try{
            assert con != null;
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    return 0;
    }
}