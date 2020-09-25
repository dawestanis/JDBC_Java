/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.manuel.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Manuel Alejandro
 */
public class DBConnection {
    
    private static final String JDBC_URL = "jdbc:sqlite:conversor.db";
    private static Connection instance = null;
 ;
    private DBConnection() {
    }
    
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            //Properties props = new Properties();
            //props.put("user", "root");
            //props.put("password", "");
            Class.forName("org.sqlite.JDBC");
            instance = DriverManager.getConnection(JDBC_URL);
          
        }
        return instance;
    }

}
