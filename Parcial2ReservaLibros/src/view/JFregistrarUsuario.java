/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import controller.controller.singleton.Usuario;

/**
 *
 * @author Gallego
 */
public class JFregistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFregistrar
     */
    public JFregistrarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    Usuario u = new Usuario();
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        txtcontrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(71, 60, 139));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/redes-sociales.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 120, 140));

        jPanel1.setBackground(new java.awt.Color(45, 214, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Datos Nuevo Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Samanata", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 38, -1, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        jLabel5.setText("TIPO DE USUARIO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 35, 220, -1));

        cmbTipoUsuario.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCENTE", "ALUMNO", "ADMINISTRADOR" }));
        cmbTipoUsuario.setSelectedIndex(2);
        jPanel1.add(cmbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 109, -1, -1));

        jLabel7.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        jLabel7.setText("CLAVE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 75, -1, -1));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/useradd.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, -1));
        jPanel1.add(txtcontrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 72, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 370, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        u.agregarUsuario();
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFregistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFregistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFregistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFregistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFregistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    public static javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField txtcontrasenia;
    public static javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

 
}