package com.company.repositories;
import com.company.DB.interfaces.IDB;
import com.company.entities.Registration;
import com.company.repositories.IRepo.IRegistrationRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationRepo implements IRegistrationRepo {

    private final IDB db;

    public RegistrationRepo(IDB idb) {
        this.db = idb;
    }

    @Override
    public boolean createRegistration(Registration registration) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "INSERT INTO registration(registration_id, patient_id) VALUES(?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, registration.getRegistration_id());
            st.setInt(2, registration.getPatient_id());


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



}
