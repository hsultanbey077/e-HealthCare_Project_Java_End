package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Doctors;
import com.company.repositories.IRepo.IDoctorsRepo;
import com.company.repositories.DepartmentRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DoctorRepo implements IDoctorsRepo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    private final IDB db;

    public DoctorRepo(IDB db) {
        this.db = db;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean createDoctor(Doctors doctor) {

        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Doctors(doc_id,doc_name,doc_surname) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1,doctor.getDoc_id());
            int a = 0;
            st.setString(2, doctor.getDoc_name());
            st.setString(3, doctor.getDoc_surname());

            st.execute();

//            ResultSet rs = st.executeQuery();
//            if(rs.next()){
//                a = rs.getInt("doc_id");
//            }
//
//            DepartmentRepo dp = new DepartmentRepo();
//
//            String sql_2 = "SELECT doc_id FROM Doctors WHERE doc_id = ?";
//            PreparedStatement st_2 = con.prepareStatement(sql_2);
//            st_2.setInt(1,doctor.getDoc_id());
//            st_2.execute();

            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;

    }

    @Override
    public Doctors getDoctorById(int doc_id) {

        return null;
    }

    @Override
    public List<Doctors> getAllDoctors() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM Doctors";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Doctors> Doctors = new LinkedList<>();
            while (rs.next()) {
                Doctors doctors = new Doctors(rs.getInt("doc_id"),
                        rs.getString("doc_name"),
                        rs.getString("doc_surname")
                       );

                Doctors.add(doctors);
            }

            return Doctors;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Doctors deleteDoctorByID(int id) {

        Connection con = null;

        try {
            con = db.getConnection();

            PreparedStatement st = con.prepareStatement("DELETE FROM Doctors WHERE Doctor_id = ?");

            st.setInt(1,id);
            st.execute();

            System.out.println(ANSI_RED + "Record has been deleted! \n" + ANSI_RESET);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
