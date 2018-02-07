/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.wherethetrash;

import com.project.model.ConnectionBuilder;
import com.project.model.HelloClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jidapa_sikaphan
 */
public class test {

    public static void main(String[] args) throws IOException {
//        HelloClass cl = new HelloClass(1, "mymy");
//        System.out.println(cl.toString());
//        System.out.println(cl.pullMessage(1));
        
        
        Properties prop = new Properties();
                 ClassLoader classloader = Thread.currentThread().getContextClassLoader();

            InputStream input = classloader.getResourceAsStream("config.properties");
            prop.load(input);
            String DBIP = prop.getProperty("database");
            System.out.println(DBIP);

    }
}
