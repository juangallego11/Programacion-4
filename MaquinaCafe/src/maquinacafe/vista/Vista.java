/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe.vista;

import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    double producto = 0, producto1 = 0, dinero = 0, total = 0, total1 = 0;
    int valor;

    public Vista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnexpreso = new javax.swing.JButton();
        btnristretto = new javax.swing.JButton();
        btncortado = new javax.swing.JButton();
        btnamericano = new javax.swing.JButton();
        btncarajillo = new javax.swing.JButton();
        btnconleche = new javax.swing.JButton();
        btnbombon = new javax.swing.JButton();
        btncapuchino = new javax.swing.JButton();
        btnmocca = new javax.swing.JButton();
        btnirlandes = new javax.swing.JButton();
        btnvienes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnfrape = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnleche = new javax.swing.JButton();
        btncrema = new javax.swing.JButton();
        btnnata = new javax.swing.JButton();
        btnwiskey = new javax.swing.JButton();
        btnbrandy = new javax.swing.JButton();
        btncanela = new javax.swing.JButton();
        btnchocolate = new javax.swing.JButton();
        btnlechecon = new javax.swing.JButton();
        btnagua = new javax.swing.JButton();
        btnhielo = new javax.swing.JButton();
        btnhelado = new javax.swing.JButton();
        txtingresarmonto = new javax.swing.JTextField();
        btnazucar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtmostrar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btncobrar = new javax.swing.JButton();
        btnadicionales = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btncincoeuros = new javax.swing.JButton();
        btndiezeuros = new javax.swing.JButton();
        btnveinteeuros = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexpreso.setBackground(new java.awt.Color(94, 68, 41));
        btnexpreso.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnexpreso.setForeground(new java.awt.Color(255, 255, 255));
        btnexpreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cafe.png"))); // NOI18N
        btnexpreso.setText("EXPRESO 2.0 € ");
        btnexpreso.setToolTipText("");
        btnexpreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexpreso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexpreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnexpreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 60));

        btnristretto.setBackground(new java.awt.Color(94, 68, 41));
        btnristretto.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnristretto.setForeground(new java.awt.Color(255, 255, 255));
        btnristretto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cafe (1).png"))); // NOI18N
        btnristretto.setText("RISTRETTO 2.3 € ");
        btnristretto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnristretto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnristretto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnristrettoActionPerformed(evt);
            }
        });
        getContentPane().add(btnristretto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 60));

        btncortado.setBackground(new java.awt.Color(94, 68, 41));
        btncortado.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncortado.setForeground(new java.awt.Color(255, 255, 255));
        btncortado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/vaso-desechable.png"))); // NOI18N
        btncortado.setText("MACCHIATO 2.5 € ");
        btncortado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncortado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncortadoActionPerformed(evt);
            }
        });
        getContentPane().add(btncortado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, 60));

        btnamericano.setBackground(new java.awt.Color(94, 68, 41));
        btnamericano.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnamericano.setForeground(new java.awt.Color(255, 255, 255));
        btnamericano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/taza-de-cafe.png"))); // NOI18N
        btnamericano.setText("AMERICANO 3.0 € ");
        btnamericano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnamericano.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnamericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnamericanoActionPerformed(evt);
            }
        });
        getContentPane().add(btnamericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 60));

        btncarajillo.setBackground(new java.awt.Color(94, 68, 41));
        btncarajillo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncarajillo.setForeground(new java.awt.Color(255, 255, 255));
        btncarajillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cafe (2).png"))); // NOI18N
        btncarajillo.setText("CARAJILLO 3.3 € ");
        btncarajillo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncarajillo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncarajillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarajilloActionPerformed(evt);
            }
        });
        getContentPane().add(btncarajillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 60));

        btnconleche.setBackground(new java.awt.Color(94, 68, 41));
        btnconleche.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnconleche.setForeground(new java.awt.Color(255, 255, 255));
        btnconleche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cafe (4).png"))); // NOI18N
        btnconleche.setText("CON LECHE 3.9 € ");
        btnconleche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnconleche.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnconleche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconlecheActionPerformed(evt);
            }
        });
        getContentPane().add(btnconleche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 60));

        btnbombon.setBackground(new java.awt.Color(94, 68, 41));
        btnbombon.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnbombon.setForeground(new java.awt.Color(255, 255, 255));
        btnbombon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/te.png"))); // NOI18N
        btnbombon.setText("BOMBON 2.5 € ");
        btnbombon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbombon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbombon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbombonActionPerformed(evt);
            }
        });
        getContentPane().add(btnbombon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, 60));

        btncapuchino.setBackground(new java.awt.Color(94, 68, 41));
        btncapuchino.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncapuchino.setForeground(new java.awt.Color(255, 255, 255));
        btncapuchino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/capuchino.png"))); // NOI18N
        btncapuchino.setText("CAPUCHINO 4.5 € ");
        btncapuchino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncapuchino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncapuchino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapuchinoActionPerformed(evt);
            }
        });
        getContentPane().add(btncapuchino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, 60));

        btnmocca.setBackground(new java.awt.Color(94, 68, 41));
        btnmocca.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnmocca.setForeground(new java.awt.Color(255, 255, 255));
        btnmocca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/capuchino (2).png"))); // NOI18N
        btnmocca.setText("MOCCA 4.0 € ");
        btnmocca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmocca.setVerifyInputWhenFocusTarget(false);
        btnmocca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmocca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoccaActionPerformed(evt);
            }
        });
        getContentPane().add(btnmocca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, 60));

        btnirlandes.setBackground(new java.awt.Color(94, 68, 41));
        btnirlandes.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnirlandes.setForeground(new java.awt.Color(255, 255, 255));
        btnirlandes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cafe (3).png"))); // NOI18N
        btnirlandes.setText("IRLANDES 6.0 € ");
        btnirlandes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnirlandes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnirlandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirlandesActionPerformed(evt);
            }
        });
        getContentPane().add(btnirlandes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 60));

        btnvienes.setBackground(new java.awt.Color(94, 68, 41));
        btnvienes.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnvienes.setForeground(new java.awt.Color(255, 255, 255));
        btnvienes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/para-llevar.png"))); // NOI18N
        btnvienes.setText("VIENES 4.5 € ");
        btnvienes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvienes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnvienes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvienesActionPerformed(evt);
            }
        });
        getContentPane().add(btnvienes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE EL TIPO DE CAFE");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 260, 40));

        btnfrape.setBackground(new java.awt.Color(94, 68, 41));
        btnfrape.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnfrape.setForeground(new java.awt.Color(255, 255, 255));
        btnfrape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/frape.png"))); // NOI18N
        btnfrape.setText("FRAPE 5.0 € ");
        btnfrape.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfrape.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfrape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfrapeActionPerformed(evt);
            }
        });
        getContentPane().add(btnfrape, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 140, 60));

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRESIONE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 90, 20));

        btnleche.setBackground(new java.awt.Color(71, 54, 37));
        btnleche.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnleche.setForeground(new java.awt.Color(255, 255, 255));
        btnleche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/vaca (1).png"))); // NOI18N
        btnleche.setText("LECHE 1€");
        btnleche.setEnabled(false);
        btnleche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlecheActionPerformed(evt);
            }
        });
        getContentPane().add(btnleche, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 120, -1));

        btncrema.setBackground(new java.awt.Color(71, 54, 37));
        btncrema.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncrema.setForeground(new java.awt.Color(255, 255, 255));
        btncrema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/crema-batida.png"))); // NOI18N
        btncrema.setText("CREMA 2€");
        btncrema.setEnabled(false);
        btncrema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncremaActionPerformed(evt);
            }
        });
        getContentPane().add(btncrema, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 120, -1));

        btnnata.setBackground(new java.awt.Color(71, 54, 37));
        btnnata.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnnata.setForeground(new java.awt.Color(255, 255, 255));
        btnnata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/dulce.png"))); // NOI18N
        btnnata.setText("NATA 2€");
        btnnata.setDefaultCapable(false);
        btnnata.setEnabled(false);
        btnnata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnataActionPerformed(evt);
            }
        });
        getContentPane().add(btnnata, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 120, -1));

        btnwiskey.setBackground(new java.awt.Color(71, 54, 37));
        btnwiskey.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnwiskey.setForeground(new java.awt.Color(255, 255, 255));
        btnwiskey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/espiritu.png"))); // NOI18N
        btnwiskey.setText("WISKEY 4€");
        btnwiskey.setEnabled(false);
        btnwiskey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwiskeyActionPerformed(evt);
            }
        });
        getContentPane().add(btnwiskey, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, -1));

        btnbrandy.setBackground(new java.awt.Color(71, 54, 37));
        btnbrandy.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnbrandy.setForeground(new java.awt.Color(255, 255, 255));
        btnbrandy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/whisky.png"))); // NOI18N
        btnbrandy.setText("BRANDY 4€");
        btnbrandy.setEnabled(false);
        btnbrandy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrandyActionPerformed(evt);
            }
        });
        getContentPane().add(btnbrandy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 130, -1));

        btncanela.setBackground(new java.awt.Color(71, 54, 37));
        btncanela.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncanela.setForeground(new java.awt.Color(255, 255, 255));
        btncanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/canela.png"))); // NOI18N
        btncanela.setText("CANELA 1€");
        btncanela.setEnabled(false);
        btncanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanelaActionPerformed(evt);
            }
        });
        getContentPane().add(btncanela, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 130, -1));

        btnchocolate.setBackground(new java.awt.Color(71, 54, 37));
        btnchocolate.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnchocolate.setForeground(new java.awt.Color(255, 255, 255));
        btnchocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/cacao.png"))); // NOI18N
        btnchocolate.setText("CHOCOLATE 1€");
        btnchocolate.setEnabled(false);
        btnchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchocolateActionPerformed(evt);
            }
        });
        getContentPane().add(btnchocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 130, -1));

        btnlechecon.setBackground(new java.awt.Color(71, 54, 37));
        btnlechecon.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlechecon.setForeground(new java.awt.Color(255, 255, 255));
        btnlechecon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/leche.png"))); // NOI18N
        btnlechecon.setText("CONDENSADA");
        btnlechecon.setEnabled(false);
        btnlechecon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlecheconActionPerformed(evt);
            }
        });
        getContentPane().add(btnlechecon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 120, -1));

        btnagua.setBackground(new java.awt.Color(71, 54, 37));
        btnagua.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnagua.setForeground(new java.awt.Color(255, 255, 255));
        btnagua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/soltar.png"))); // NOI18N
        btnagua.setText("AGUA 0€ ");
        btnagua.setEnabled(false);
        btnagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaguaActionPerformed(evt);
            }
        });
        getContentPane().add(btnagua, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 120, -1));

        btnhielo.setBackground(new java.awt.Color(71, 54, 37));
        btnhielo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnhielo.setForeground(new java.awt.Color(255, 255, 255));
        btnhielo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/hielo.png"))); // NOI18N
        btnhielo.setText("HIELO 0€");
        btnhielo.setEnabled(false);
        btnhielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhieloActionPerformed(evt);
            }
        });
        getContentPane().add(btnhielo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 130, -1));

        btnhelado.setBackground(new java.awt.Color(71, 54, 37));
        btnhelado.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnhelado.setForeground(new java.awt.Color(255, 255, 255));
        btnhelado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/verano.png"))); // NOI18N
        btnhelado.setText("HELADO 2€");
        btnhelado.setEnabled(false);
        btnhelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnheladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnhelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 130, -1));

        txtingresarmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingresarmontoActionPerformed(evt);
            }
        });
        txtingresarmonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresarmontoKeyTyped(evt);
            }
        });
        getContentPane().add(txtingresarmonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 180, 30));

        btnazucar.setBackground(new java.awt.Color(71, 54, 37));
        btnazucar.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        btnazucar.setForeground(new java.awt.Color(255, 255, 255));
        btnazucar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/azucar.png"))); // NOI18N
        btnazucar.setText("AZUCAR 0€");
        btnazucar.setEnabled(false);
        btnazucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnazucarActionPerformed(evt);
            }
        });
        getContentPane().add(btnazucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, -1));

        jLabel4.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel4.setText("INGRESE EL MONTO $");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        txtmostrar.setEditable(false);
        txtmostrar.setColumns(3);
        txtmostrar.setToolTipText("");
        txtmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 340, 60));

        jLabel5.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DETALLES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        btncobrar.setBackground(new java.awt.Color(119, 173, 195));
        btncobrar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncobrar.setForeground(new java.awt.Color(0, 0, 0));
        btncobrar.setText("COBRO");
        btncobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncobrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 80, -1));

        btnadicionales.setBackground(new java.awt.Color(119, 173, 195));
        btnadicionales.setFont(new java.awt.Font("DialogInput", 1, 10)); // NOI18N
        btnadicionales.setForeground(new java.awt.Color(0, 0, 0));
        btnadicionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/mas.png"))); // NOI18N
        btnadicionales.setText("AGREGAR");
        btnadicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnadicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, -1));

        btnlimpiar.setBackground(new java.awt.Color(119, 173, 195));
        btnlimpiar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        btncincoeuros.setBackground(new java.awt.Color(94, 153, 29));
        btncincoeuros.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btncincoeuros.setForeground(new java.awt.Color(0, 0, 0));
        btncincoeuros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/dinero.png"))); // NOI18N
        btncincoeuros.setText("5 €");
        btncincoeuros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncincoeuros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncincoeuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncincoeurosActionPerformed(evt);
            }
        });
        getContentPane().add(btncincoeuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 60, 50));

        btndiezeuros.setBackground(new java.awt.Color(94, 153, 29));
        btndiezeuros.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btndiezeuros.setForeground(new java.awt.Color(0, 0, 0));
        btndiezeuros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/dinero.png"))); // NOI18N
        btndiezeuros.setText("10 €");
        btndiezeuros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndiezeuros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndiezeuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiezeurosActionPerformed(evt);
            }
        });
        getContentPane().add(btndiezeuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 60, 50));

        btnveinteeuros.setBackground(new java.awt.Color(94, 153, 29));
        btnveinteeuros.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnveinteeuros.setForeground(new java.awt.Color(0, 0, 0));
        btnveinteeuros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/icons/dinero.png"))); // NOI18N
        btnveinteeuros.setText("20 €");
        btnveinteeuros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnveinteeuros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnveinteeuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnveinteeurosActionPerformed(evt);
            }
        });
        getContentPane().add(btnveinteeuros, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 60, 50));

        jLabel6.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PARA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADICIONAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SOLO BILLETES DE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, -1, 20));

        jLabel1.setBackground(new java.awt.Color(71, 54, 37));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinacafe/vista/cafe.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 540));

        jMenu1.setText("File");

        jMenuItem1.setText("salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnconlecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconlecheActionPerformed
        this.producto = 4.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe con leche " + producto + " € ");
    }//GEN-LAST:event_btnconlecheActionPerformed

    private void btnheladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnheladoActionPerformed
        this.producto1 = 2;
        txtmostrar.setText(String.valueOf("Se agrego Helado $: " + this.producto1 + "\n\ntotal $: \n\n" + (producto + producto1) + "€"));
    }//GEN-LAST:event_btnheladoActionPerformed

    private void btnaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaguaActionPerformed
        this.producto1 = 0;
        this.txtmostrar.setText(String.valueOf("se agrego mas Agua $: " + this.producto1 + "\n\ntotal $\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnaguaActionPerformed

    private void txtingresarmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresarmontoActionPerformed


    }//GEN-LAST:event_txtingresarmontoActionPerformed

    private void btnexpresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpresoActionPerformed
        producto = 2.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Expreso" + "\n"+ 
                this.producto + " € ");
      
    }//GEN-LAST:event_btnexpresoActionPerformed

    private void txtmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmostrarActionPerformed
       
    }//GEN-LAST:event_txtmostrarActionPerformed

    private void txtingresarmontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresarmontoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtingresarmontoKeyTyped

    private void btnristrettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnristrettoActionPerformed
        producto = 2.3;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Ristretto" + producto + " € ");
    }//GEN-LAST:event_btnristrettoActionPerformed

    private void btncortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncortadoActionPerformed
        producto = 2.5;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Cortado " + producto + " € ");
    }//GEN-LAST:event_btncortadoActionPerformed

    private void btnamericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnamericanoActionPerformed
        producto = 3.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Americano " + producto + " € ");
    }//GEN-LAST:event_btnamericanoActionPerformed

    private void btncarajilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarajilloActionPerformed
        producto = 2.3;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Expreso " + producto + " € ");
    }//GEN-LAST:event_btncarajilloActionPerformed

    private void btnbombonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbombonActionPerformed
        producto = 2.5;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Bombon " + producto + " € ");
    }//GEN-LAST:event_btnbombonActionPerformed

    private void btncapuchinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapuchinoActionPerformed
        producto = 4.5;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Capuchino " + producto + " € ");
    }//GEN-LAST:event_btncapuchinoActionPerformed

    private void btnmoccaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoccaActionPerformed
        producto = 4.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Mocca " + producto + " € ");
    }//GEN-LAST:event_btnmoccaActionPerformed

    private void btnirlandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirlandesActionPerformed
        producto = 6.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Irlandes " + producto + " € ");
    }//GEN-LAST:event_btnirlandesActionPerformed

    private void btnvienesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvienesActionPerformed
        producto = 4.5;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Vienes " + producto + " € ");
    }//GEN-LAST:event_btnvienesActionPerformed

    private void btnfrapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfrapeActionPerformed
        producto = 5.0;
        txtmostrar.setText(txtmostrar.getText() + "Cafe Frapeado " + producto + " € ");
    }//GEN-LAST:event_btnfrapeActionPerformed

    private void btncobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncobrarActionPerformed
        /*dinero = Integer.parseInt(txtingresarmonto.getText());
        total = dinero - producto;
        this.txtmostrar.setText(String.valueOf(this.total));*/
        if (this.txtingresarmonto.getText().equals("0") || this.txtingresarmonto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar dinero, su saldo es $ 0.0");
        } else {
            dinero = Integer.parseInt(txtingresarmonto.getText());
            total = this.producto1 + producto;
            total1 = this.dinero - this.total;
            this.txtmostrar.setText(String.valueOf(this.total1));
            txtingresarmonto.setText("");
        }

    }//GEN-LAST:event_btncobrarActionPerformed

    private void btncanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanelaActionPerformed
        this.producto1 = 1;
        this.txtmostrar.setText(String.valueOf("Se Agrego Canela $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btncanelaActionPerformed

    private void btnazucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnazucarActionPerformed
        this.producto1 = 0;
        this.txtmostrar.setText(String.valueOf("se agrego azucar $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnazucarActionPerformed

    private void btnlecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlecheActionPerformed
        this.producto1 = 1;
        this.txtmostrar.setText(String.valueOf("Se agrego leche $: " + this.producto1 + "\n\n total $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnlecheActionPerformed

    private void btncremaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncremaActionPerformed
        this.producto1 = 2;
        this.txtmostrar.setText(String.valueOf("Se agrego crema  $" + this.producto + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btncremaActionPerformed

    private void btnnataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnataActionPerformed
        this.producto1 = 2;
        this.txtmostrar.setText(String.valueOf("Se agrego Nata $\n\n" + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnnataActionPerformed

    private void btnlecheconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlecheconActionPerformed
        this.producto1 = 2;
        txtmostrar.setText(String.valueOf("Se agrego Leche Condensada $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnlecheconActionPerformed

    private void btnwiskeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwiskeyActionPerformed
        this.producto1 = 4;
        txtmostrar.setText(String.valueOf("Se agrego Whiskey $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnwiskeyActionPerformed

    private void btnbrandyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrandyActionPerformed
        this.producto1 = 4;
        txtmostrar.setText(String.valueOf("Se agrego Brandy $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnbrandyActionPerformed

    private void btnchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchocolateActionPerformed
        this.producto1 = 1;
        txtmostrar.setText(String.valueOf("Se agrego Chocolate $: " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnchocolateActionPerformed

    private void btnhieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhieloActionPerformed
        this.producto1 = 0;
        txtmostrar.setText(String.valueOf("Se agrego hielo $:  " + this.producto1 + "\n\ntotal $:\n\n" + (producto + producto1)+ "€"));
    }//GEN-LAST:event_btnhieloActionPerformed

    private void btnadicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionalesActionPerformed
        this.btnagua.setEnabled(true);
        this.btnazucar.setEnabled(true);
        this.btnbrandy.setEnabled(true);
        this.btncanela.setEnabled(true);
        this.btnchocolate.setEnabled(true);
        this.btncrema.setEnabled(true);
        this.btnhelado.setEnabled(true);
        this.btnhielo.setEnabled(true);
        this.btnleche.setEnabled(true);
        this.btnlechecon.setEnabled(true);
        this.btnnata.setEnabled(true);
        this.btnwiskey.setEnabled(true);

    }//GEN-LAST:event_btnadicionalesActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtmostrar.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncincoeurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncincoeurosActionPerformed
        this.valor = 5;
        txtingresarmonto.setText(txtingresarmonto.getText() + valor);
    }//GEN-LAST:event_btncincoeurosActionPerformed

    private void btndiezeurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiezeurosActionPerformed
        this.valor = 10;
        txtingresarmonto.setText(txtingresarmonto.getText() + valor);
    }//GEN-LAST:event_btndiezeurosActionPerformed

    private void btnveinteeurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnveinteeurosActionPerformed
        this.valor = 20;
        txtingresarmonto.setText(txtingresarmonto.getText() + valor);
    }//GEN-LAST:event_btnveinteeurosActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionales;
    private javax.swing.JButton btnagua;
    private javax.swing.JButton btnamericano;
    private javax.swing.JButton btnazucar;
    private javax.swing.JButton btnbombon;
    private javax.swing.JButton btnbrandy;
    private javax.swing.JButton btncanela;
    private javax.swing.JButton btncapuchino;
    private javax.swing.JButton btncarajillo;
    private javax.swing.JButton btnchocolate;
    private javax.swing.JButton btncincoeuros;
    private javax.swing.JButton btncobrar;
    private javax.swing.JButton btnconleche;
    private javax.swing.JButton btncortado;
    private javax.swing.JButton btncrema;
    private javax.swing.JButton btndiezeuros;
    private javax.swing.JButton btnexpreso;
    private javax.swing.JButton btnfrape;
    private javax.swing.JButton btnhelado;
    private javax.swing.JButton btnhielo;
    private javax.swing.JButton btnirlandes;
    private javax.swing.JButton btnleche;
    private javax.swing.JButton btnlechecon;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmocca;
    private javax.swing.JButton btnnata;
    private javax.swing.JButton btnristretto;
    private javax.swing.JButton btnveinteeuros;
    private javax.swing.JButton btnvienes;
    private javax.swing.JButton btnwiskey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtingresarmonto;
    private javax.swing.JTextField txtmostrar;
    // End of variables declaration//GEN-END:variables
}
