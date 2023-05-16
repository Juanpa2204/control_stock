package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperarConexion() throws SQLException {
         return DriverManager.getConnection(
                 "jdbc:mysql://localhost/control_stock?userTimeZone=true&serverTimeZOne=utc",
                 "root",
                 "root");
    }
}
