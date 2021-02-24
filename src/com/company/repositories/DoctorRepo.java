package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Doctors;
import com.company.repositories.IRepo.IDoctorsRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DoctorRepo implements IDoctorsRepo {

    private final IDB db;

    public DoctorRepo(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createDoctor(Doctors doctor) {

        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Doctors(doc_name,doc_surname,patient_id) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, doctor.getDoc_name());
            st.setString(2, doctor.getDoc_surname());
            st.setInt(3, doctor.getPatient_id());

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
    public Doctors getDoctorById(int doc_id) {
            Connection con = null;
            try {
                con = db.getConnection();
                String sql = "SELECT * FROM Doctors WHERE id=?";
                PreparedStatement st = con.prepareStatement(sql);

                st.setInt(1, doc_id);

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    Doctors doctors = new Doctors(rs.getInt("doc_id"),
                            rs.getString("doc_name"),
                            rs.getString("doc_surname"),
                            rs.getInt("patient_id"));

                    return doctors;

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
                        rs.getString("doc_surname"),
                        rs.getInt("patient_id"));

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




}
