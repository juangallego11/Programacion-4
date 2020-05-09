/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller.strategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static model.Conexion.getConection;
import view.DevolverLibro;


public class Devolver implements Controller{

    @Override
    public void Accion() {
        
    }
     public void devolverLibro(){
        PreparedStatement ps;
        
        int fila = DevolverLibro.tablaEliminar.getSelectedRow();
        String valor = String.valueOf(DevolverLibro.tablaEliminar.getValueAt(fila, 0)); 
        String SQL = "INSERT INTO tabla_libros (titulo,autor,categoria) SELECT titulo,autor FROM sanciones WHERE id_reserva=" + valor + "";  
        Statement st;
        Connection con = null;
        try {
            con = getConection();
            ps = con.prepareStatement(SQL);
            
            int res = ps.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "Libro Entregado");
        } catch (Exception e) {
            System.out.println(e);
        
        }
        
     }   
}
