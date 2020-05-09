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
import view.ReservarLibro;

public class Reservar implements Controller {

    @Override
    public void Accion() {

        PreparedStatement ps;

        String titulo = ReservarLibro.txtTitulo.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");

        Date fecha1 = ReservarLibro.dptFechaInicio.getDate();
        Date fecha2 = ReservarLibro.dptFechaFin.getDate();

        String fechaInicio = formato.format(fecha1);
        String fechaFin = formato.format(fecha2);

        String idUsuario = consultarUsuario(ReservarLibro.txtUsuario.getText());

        String estado = "Sin retirar";

        int fila = ReservarLibro.tablaLibros.getSelectedRow();
        String valor = String.valueOf(ReservarLibro.tablaLibros.getValueAt(fila, 0));

        String SQL = "INSERT INTO tabla_reservados (id_libro,id_usuario, fecha_inicio, fecha_fin, estado) values(?,?,?,?,?)";
        //String SQL2 = "UPDATE tabla_libros SET estado= 'Reservado' WHERE id_libro=" + valor + "";

            Statement st;
        Connection con = null;
        if (idUsuario != null) {
            try {

                con = getConection();
                ps = con.prepareStatement(SQL);

                ps.setString(1, valor);
                ps.setString(2, idUsuario);
                ps.setString(3, fechaInicio);
                ps.setString(4, fechaFin);
                ps.setString(5, estado);

                int res = ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Reservado");

                con.close();
            } catch (Exception e) {
                System.out.println(e);

            }
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
        }

    }

    public String consultarUsuario(String usuario) {
        Statement st;

        String SQL = "SELECT * FROM usuarios WHERE usuario ='" + usuario + "'";
        String datos[] = new String[4];

        Connection con = null;

        try {
            con = getConection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

            }

            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario No Existe");
        }
        return datos[0];

    }

    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Titulo");
        modelo.addColumn("Cantidad");
        //modelo.addColumn("Fecha Inicial");
        //modelo.addColumn("Fecha Termino");
        //modelo.addColumn("Categoria");
        //modelo.addColumn("Estado");

        ReservarLibro.tablaLibros.setModel(modelo);

        String SQL = "SELECT * FROM tabla_libros";
        String datos[] = new String[3];
        Statement st;
        Connection con = null;
        try {
            con = getConection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(4);
                //datos[2] = rs.getString(3);
                //datos[3] = rs.getString(4);
                //datos[4] = rs.getString(5);
                //datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            ReservarLibro.tablaLibros.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
