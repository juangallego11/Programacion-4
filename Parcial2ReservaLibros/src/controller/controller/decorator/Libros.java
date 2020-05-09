/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.Conexion.getConection;
import view.ListarLibros;
import view.ListarUsuarios;
import view.RegistroLibros;

public class Libros {

    public void ingresarLibro() {
        String titulo = RegistroLibros.txtTitulo.getText();
        String autor = RegistroLibros.txtautor.getText();
        String cantidad = RegistroLibros.txtCantidad.getText();
        String categoria = RegistroLibros.cbxCategoria.getSelectedItem().toString();

        Connection con = null;
        PreparedStatement ps;
        ResultSet rs;

        if (titulo.equals("") || autor.equals("")|| cantidad.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los campos");
        } else {
            try {
                con = getConection();
                String SQL = "INSERT INTO tabla_libros(titulo,autor,cantidad,categoria) VALUES (?,?,?,?)";
                ps = con.prepareStatement(SQL);
                ps.setString(1, titulo);
                ps.setString(2, autor);
                ps.setString(3, cantidad);
                ps.setString(4, categoria);

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Libro agregado correctamente");
                    limpiarCampos();

                }
            } catch (Exception e) {
            }
        }
    }

    public void limpiarCampos() {
        RegistroLibros.txtTitulo.setText("");
        RegistroLibros.txtautor.setText("");
        RegistroLibros.txtCantidad.setText("");
        
    }
    
    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_Libro");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Categoria");
        ListarLibros.tablaLibros.setModel(modelo);

        String SQL = "SELECT * FROM tabla_libros";
        String datos[] = new String[5];
        Statement st;
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
                datos[4] = rs.getString(5);
                modelo.addRow(datos);

            }
            ListarLibros.tablaLibros.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    
    public void eliminarLibro() {
        Connection con = null;
        con = getConection();
        int fila = ListarLibros.tablaLibros.getSelectedRow();
        String valor = String.valueOf(ListarLibros.tablaLibros.getValueAt(fila, 0));
         
        try {
            if (fila >= 0) {
                PreparedStatement ps;
                ResultSet rs;
                String SQL = "DELETE FROM tabla_libros WHERE id_libro=" + valor + "" ;
                ps = con.prepareStatement(SQL);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Libro eliminado correctamente");
                mostrarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
