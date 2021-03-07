package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Patients;
import com.company.repositories.IRepo.IPatientRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PatientRepo implements IPatientRepo {
    private final IDB db;

    public PatientRepo(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createPatient(Patients patient) {

        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Patients(name,surname,expenditure,test_id,test_result) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, patient.getName());
            st.setString(2, patient.getSurname());

            st.execute();

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
    public Patients getPatientById(int patient_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM Patients WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, patient_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Patients patient = new Patients(rs.getInt("patient_id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getDouble("expenditure"),
                        rs.getInt("test_id"),
                        rs.getString("test_result"));

                return patient;

            }
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
    public List<Patients> getAllPatients() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM Patients";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Patients> Patients = new LinkedList<>();
            while (rs.next()) {
                Patients patients = new Patients(rs.getInt("patient_id"),
                        rs.getString("name"),
                        rs.getString("surname"));

                Patients.add(patients);
            }

            return Patients;

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
}
