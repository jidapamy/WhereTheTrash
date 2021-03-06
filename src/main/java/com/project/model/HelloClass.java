/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jidapa_sikaphan
 */
public class HelloClass {
    private int id;
    private String message;

    public HelloClass(){
        
    }
    public HelloClass(int id, String message) {
        this.id = id;
        this.message = message;
    }
    
    public HelloClass(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String pullMessage(int id){
        Connection con = null;
        HelloClass hello = null;
        String message = null;
        try {
            con = ConnectionBuilder.getMySqlCond();
            PreparedStatement pstm = con.prepareStatement("SELECT message FROM HelloClass WHERE id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                message = rs.getString("message");
            }
            rs.close();
            pstm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HelloClass.class.getName()).log(Level.SEVERE, null, ex);
            message = "404 Class not found";
        } catch (SQLException ex) {
            Logger.getLogger(HelloClass.class.getName()).log(Level.SEVERE, null, ex);
            message = "SQL Exception";
        }
        
        return message;
    }
    
    @Override
    public String toString() {
        return "HelloClass{" + "id=" + id + ", message=" + message + '}';
    }
    
    
    
    
}
