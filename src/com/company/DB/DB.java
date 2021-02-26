package com.company.DB;

import com.company.DB.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DB connection on PostgreSQL with connection URL
 */

public class DB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/e-HealthCare";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");

            /*Establish the connection*/
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "sultan");

            return con;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}