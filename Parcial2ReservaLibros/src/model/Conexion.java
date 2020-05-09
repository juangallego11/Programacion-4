/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author cristiancg
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/BIBLIOTECA";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        return con;
    }
    
    
    
}
