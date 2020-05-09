/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller.strategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.Conexion.getConection;
import view.PrestarLibro;
import view.ReservarLibro;

public class Prestar implements Controller {

    @Override
    public void Accion() {

        PreparedStatement ps;

        String titulo = PrestarLibro.txtTitulo.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");

        Date fecha1 = PrestarLibro.dteFechaInicio.getDate();

        String fechaInicio = formato.format(fecha1);

        String SQL = "INSERT INTO tabla_prestados (titulo,fechaInicio) values(?,?)";
        Statement st;
        Connection con = null;
        try {

            con = getConection();
            ps = con.prepareStatement(SQL);
           
            ps.setString(1,titulo );
            ps.setString(2, fechaInicio);

            int res = ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Prestado");
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
    
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id prestamo");
        modelo.addColumn("Fecha Inicio");
        //modelo.addColumn("Fecha Fin");
        //modelo.addColumn("Fecha Inicial");
        //modelo.addColumn("Fecha Termino");
        //modelo.addColumn("Categoria");
        //modelo.addColumn("Estado");
      
        PrestarLibro.tablaPrestar.setModel(modelo);

        String SQL = "SELECT * FROM tabla_prestados";
        String datos[] = new String[2];
        Statement st;
        Connection con = null;
        try {
            con = getConection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                //datos[2] = rs.getString(3);
                //datos[3] = rs.getString(4);
                //datos[4] = rs.getString(5);
                //datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            PrestarLibro.tablaPrestar.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error");
        }

     }

}
