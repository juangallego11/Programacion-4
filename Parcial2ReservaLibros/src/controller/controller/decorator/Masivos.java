/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static model.Conexion.getConection;
import view.ListarLibros;


public class Masivos {
    
    public void tablaLibrosMasivos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Cantidad");
        ListarLibros.tablaLibros.setModel(modelo);

        String SQL = "SELECT * FROM tabla_libros where categoria='MASIVOS'";
        String datos[] = new String[4];
        Statement st;
        Connection con = null;
        try {
            con = getConection();
            PreparedStatement ps;
            ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);
            }
            ListarLibros.tablaLibros.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
