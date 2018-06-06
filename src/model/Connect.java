/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tú Trinh
 */
public class Connect {
    
    public Connection getconnect() throws SQLException{
        Connection conn = null;
        String dbURL;
        try {
            dbURL = "jdbc:sqlserver://Tu_Trinh;databaseName=JAVAFXML;user=sa;password=123456";
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}
