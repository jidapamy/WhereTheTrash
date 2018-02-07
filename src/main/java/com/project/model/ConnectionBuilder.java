/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

/**
 *
 * @author KUROMMNK
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBuilder {

    Connection conn = null;
    static String test = "";

    public static Connection getMySqlCond() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try {
            Properties prop = new Properties();
            InputStream input = classloader.getResourceAsStream("config.properties");
            prop.load(input);
            String dburl = prop.getProperty("dburl");
            String dbuser = prop.getProperty("dbuser");
            String dbpassword = prop.getProperty("dbpassword");

            test = "url:" + dburl + ", dbuser:" + dbuser + ", dbpassword:" + dbpassword;

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");

            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            System.out.println("Connected");

        } catch (IOException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

}
