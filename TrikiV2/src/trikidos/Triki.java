/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trikidos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Triki extends JFrame{
    JFrame marco = new JFrame();
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton score, score2, salir;
    JPanel p1, scoreBoard;
    Integer pj1 = 0, pj2 = 0;
    Integer X = 0, O = 0;
    Traki traki;
    JButton btnAct;

    Triki()
    {
        score = new JButton("0");
        score2 = new JButton("0");
        salir = new JButton("0");
        score.setFont(new Font("Tahoma", 1 , 42));
        score2.setFont(new Font("Tahoma", 1 , 42));
        salir.setFont(new Font("Tahoma", 1 , 42));

        l1 = new JLabel("");
        l1.setPreferredSize(new Dimension(190, 190));
        l1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l2 = new JLabel("");
        l2.setPreferredSize(new Dimension(190, 190));
        l2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l3 = new JLabel("");
        l3.setPreferredSize(new Dimension(190, 190));
        l3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l4 = new JLabel("");
        l4.setPreferredSize(new Dimension(190, 190));
        l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l5 = new JLabel("");
        l5.setPreferredSize(new Dimension(190, 190));
        l5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l6 = new JLabel("");
        l6.setPreferredSize(new Dimension(190, 190));
        l6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l7 = new JLabel("");
        l7.setPreferredSize(new Dimension(190, 190));
        l7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l8 = new JLabel("");
        l8.setPreferredSize(new Dimension(190, 190));
        l8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l9 = new JLabel("");
        l9.setPreferredSize(new Dimension(190, 190));
        l9.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        traki = new Traki();

        crearInterfaz();
    }

    public Traki getTraki(){
        return this.traki;
    }//end method getTraki

    public void crearInterfaz()
    {
        marco.setTitle("Triki Sencillo");
        ImageIcon icono = new ImageIcon(getClass().getResource("./menu.png"));
        Image imagen = icono.getImage();
        marco.setIconImage(imagen);
        marco.setSize(610,710);
        marco.setResizable(false);
        marco.setLayout(new BorderLayout());
        marco.setVisible(true);

        p1 = new JPanel();
        scoreBoard = new JPanel();

        scoreBoard.setLayout(new GridLayout(1,4));
        scoreBoard.setPreferredSize(new Dimension(600,100));
        p1.setLayout(new GridLayout(3,3));
        p1.setPreferredSize(new Dimension(610,610));

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);

        scoreBoard.add(new JLabel(""));
        scoreBoard.add(score = new JButton("Puntaje Player1"));
        scoreBoard.add(score2 = new JButton("Puntaje Player2"));
        score.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        score.setBackground(Color.BLUE);
        score2.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
        score2.setBackground(Color.RED);
        scoreBoard.add(btnAct = new JButton("Actualizar"));
        btnAct.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnAct.setBackground(Color.GREEN);
        

        marco.add(p1, BorderLayout.CENTER);
        marco.add(scoreBoard, BorderLayout.SOUTH);

        marco.setLocationRelativeTo(null);

        l1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l1MouseClicked(evt);
                }
            });
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l2MouseClicked(evt);
                }
            });
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l3MouseClicked(evt);
                }
            });
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l4MouseClicked(evt);
                }
            });
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l5MouseClicked(evt);
                }
            });
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l6MouseClicked(evt);
                }
            });
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l7MouseClicked(evt);
                }
            });
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l8MouseClicked(evt);
                }
            });
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    l9MouseClicked(evt);
                }
            });
        btnAct.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnMouseClicked(evt);
                }
            });
    }

    public void btnMouseClicked(MouseEvent evt)
    {
        this.reinicioForzado();
    }

    public void l1MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[0] == "n"){
            if (X == O)
            {
                l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[0] = "X";
                X++;
            }
            else if (X > O)
            {
                l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[0] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l2MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[1] == "n"){
            if (X == O)
            {
                l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[1] = "X";
                X++;
            }
            else if (X > O)
            {
                l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[1] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l3MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[2] == "n"){
            if (X == O)
            {
                l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[2] = "X";
                X++;
            }
            else if (X > O)
            {
                l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[2] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l4MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[3] == "n"){
            if (X == O)
            {
                X++;
                l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[3] = "X";
            }
            else if (X > O)
            {
                O++;
                l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[3] = "O";
            }
            traki.verificarJuego();
        }
    }

    public void l5MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[4] == "n"){
            if (X == O)
            {
                l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[4] = "X";
                X++;
            }
            else if (X > O)
            {
                l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[4] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l6MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[5] == "n"){
            if (X == O)
            {
                l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[5] = "X";
                X++;
            }
            else if (X > O)
            {
                l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[5] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l7MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[6] == "n"){
            if (X == O)
            {
                l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[6] = "X";
                X++;
            }
            else if (X > O)
            {
                l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[6] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l8MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[7] == "n"){
            if (X == O)
            {
                l8.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[7] = "X";
                X++;
            }
            else if (X > O)
            {
                l8.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[7] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void l9MouseClicked(MouseEvent evt)
    {
        if(traki.getGame()[8] == "n"){
            if (X == O)
            {
                l9.setIcon(new javax.swing.ImageIcon(getClass().getResource("./eliminar.png")));
                traki.getGame()[8] = "X";
                X++;
            }
            else if (X > O)
            {
                l9.setIcon(new javax.swing.ImageIcon(getClass().getResource("./circulo.png")));
                traki.getGame()[8] = "O";
                O++;
            }
            traki.verificarJuego();
        }
    }

    public void reinicio()
    {
        if (traki.getEndGame() == true)
        {
            if(traki.getP1()== true){pj1++;}
            else if(traki.getP2()== true){pj2++;}

            traki = new Traki();

            l1.setIcon(null);
            l2.setIcon(null);
            l3.setIcon(null);
            l4.setIcon(null);
            l5.setIcon(null);
            l6.setIcon(null);
            l7.setIcon(null);
            l8.setIcon(null);
            l9.setIcon(null);

            X = 0;
            O = 0;

            score.setText(pj1.toString());
            score2.setText(pj2.toString());
        }
    }

    public void reinicioForzado()
    {
        traki = new Traki();

        l1.setIcon(null);
        l2.setIcon(null);
        l3.setIcon(null);
        l4.setIcon(null);
        l5.setIcon(null);
        l6.setIcon(null);
        l7.setIcon(null);
        l8.setIcon(null);
        l9.setIcon(null);

        X = 0;
        O = 0;
    }

    public void cerrar()
    {
        System.exit(0);
    }
    
}
