package com.company.DB.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interface for the class DB with getConnection method
 */

public interface IDB {
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
