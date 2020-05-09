/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.Conexion.getConection;
import view.JFregistrarUsuario;
import view.ListarUsuarios;
import view.Login;
import view.MenuJF;

/**
 *
 * @author davidgr
 */
public class Usuario {

    public void ingresar() {
        String usuario = Login.txtUsuario.getText();
        String clave = String.valueOf(Login.txtClave.getPassword());
        String tipo = String.valueOf(Login.cmbTipoUsuario.getSelectedItem());

        PreparedStatement ps;
        ResultSet rs;
        try {
            Connection con = null;
            con = getConection();
            String SQL = "SELECT * FROM usuarios WHERE usuario=? AND clave = ? AND tipo_usuario=? ";
            ps = con.prepareStatement(SQL);
            ps.setString(1, usuario);
            ps.setString(2, Login.txtClave.getText());
            ps.setString(3, tipo);

            rs = ps.executeQuery();

            if (rs.next()) {
                if (tipo.equals("ADMINISTRADOR")) {
                    MenuJF menu = new MenuJF();
                    menu.setVisible(true);
                    con.close();

                } else {
                    if (tipo.equals("ALUMNO") || tipo.equals("DOCENTE")) {
                        MenuJF menu = new MenuJF();
                        menu.setVisible(true);
                        MenuJF.menuUsuarios.setEnabled(false);
                        MenuJF.menuRegistro.setEnabled(false);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/clave o Perfil incorrectos");
                Login.txtUsuario.setText("");
                Login.txtClave.setText("");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void limpiarCampos() {
        JFregistrarUsuario.txtnombre.setText("");
        JFregistrarUsuario.txtcontrasenia.setText("");
        JFregistrarUsuario.cmbTipoUsuario.setSelectedIndex(0);
    }

    public void agregarUsuario() {

        String user = JFregistrarUsuario.txtnombre.getText();
        String nClave = JFregistrarUsuario.txtcontrasenia.getText();
        String TipoUsuario = JFregistrarUsuario.cmbTipoUsuario.getSelectedItem().toString();

        Connection con = null;
        PreparedStatement ps;
        ResultSet rs;

        if (user.equals("") || nClave.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {
            try {
                con = getConection();
                String SQL = "INSERT INTO usuarios(usuario,clave,tipo_usuario) VALUES(?,?,?)";
                ps = con.prepareStatement(SQL);
                ps.setString(1, user);
                ps.setString(2, nClave);
                ps.setString(3, TipoUsuario);

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario guardado con perfil " + TipoUsuario);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar usuario");
                }
                con.close();

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Usuario");
        modelo.addColumn("Tipo de usuario");
        ListarUsuarios.tablaUsuarios.setModel(modelo);

        String SQL = "SELECT * FROM usuarios";
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
                modelo.addRow(datos);

            }
            ListarUsuarios.tablaUsuarios.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public void eliminarUsuario() {
        Connection con = null;
        con = getConection();
        int fila = ListarUsuarios.tablaUsuarios.getSelectedRow();
        String valor = String.valueOf(ListarUsuarios.tablaUsuarios.getValueAt(fila, 0));
         
        try {
            if (fila >= 0) {
                PreparedStatement ps;
                ResultSet rs;
                String SQL = "DELETE FROM usuarios WHERE id_usuario=" + valor + "" ;
                ps = con.prepareStatement(SQL);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                mostrarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
