package com.company.repositories;

import com.company.DB.interfaces.IDB;
import com.company.entities.Test;
import com.company.repositories.IRepo.ITestRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRepo implements ITestRepo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    private final IDB db;

    public TestRepo(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createTest(Test test) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO test(test_id, test_date, test_result) VALUES(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, test.getTest_id());
            st.setString(2, test.getTest_date());
            st.setString(3, test.getTest_result());

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
    public String getTestResult(Test test) {
        Connection con = null;
        try{
            con = db.getConnection();
            String sql = "SELECT test_result FROM test WHERE test_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, test.getTest_id());

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String test_result = rs.getString("test_result");
                return test_result;
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
        return null;

    }

    @Override
    public int getTestId(Test test) {
        Connection con = null;
        try{
            con = db.getConnection();
            String sql = "SELECT test_id FROM test WHERE test_date=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, test.getTest_date());

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Integer id = rs.getInt("test_id");
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

    @Override
    public Test UpdateTest(int id) {
        Connection con = null;

        try {
            con = db.getConnection();

            PreparedStatement st = con.prepareStatement("Update FROM Test WHERE test_id = ?");

            st.setInt(1,id);
            st.executeUpdate();

            System.out.println(ANSI_RED + "Record has been updated! \n" + ANSI_RESET);

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


