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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionBuilder {

    Connection conn = null;

   public static Connection getMySqlCond() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/WhereTheTrash", "root", "1234");

        Class.forName("com.mysql.jdbc.Driver") ;
        System.out.println("Driver loaded success");
        String url = "jdbc:mysql://13.250.3.218:3306/WhereTheTrash";
        Connection conn = DriverManager.getConnection(url,"wherethetrash","wherethetrash");
        System.out.println("Connected");
        return conn;
    }
  
    public static void main(String[] args) {
        Connection con;
        try {
            con = ConnectionBuilder.getMySqlCond();
            System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

