
package com.java.transport.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
       
        String jdbcUrl = "jdbc:mysql://localhost:3306/transportdb";
        String username = "root";  
        String password = "srec@7181";  
        
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}

