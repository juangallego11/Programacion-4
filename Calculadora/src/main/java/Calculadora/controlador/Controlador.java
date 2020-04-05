package Calculadora.controlador;

import Calculadora.logica.LOGICA;
import Calculadora.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador implements ActionListener {

    LOGICA programa;
    Vista interfaz;

    public Controlador() {
    }

    ;

 public Controlador(LOGICA programa, Vista interfaz) {
        this.programa = programa;
        this.interfaz = interfaz;
        this.interfaz.jcos1.addActionListener(this);
        this.interfaz.jsen.addActionListener(this);
        this.interfaz.jtan.addActionListener(this);
        this.interfaz.jasen.addActionListener(this);
        this.interfaz.jacos.addActionListener(this);
        this.interfaz.jatan.addActionListener(this);
        this.interfaz.txtmostrar.addActionListener(this);
        this.interfaz.jigual.addActionListener(this);
        this.interfaz.btnraiz.addActionListener(this);
        this.interfaz.btnlog.addActionListener(this);
        //this.interfaz.jsuma.addActionListener(this);

    }

    public void inciar() {
        interfaz.setTitle(" modelos calculadora ");
        interfaz.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!this.interfaz.txtmostrar.getText().isEmpty()) {
            JButton boton = (JButton) ae.getSource();
            String op = boton.getText();

            switch (op) {
                case "=":
                    operaciones();
                    break;
                case "sen":
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.sen()));
                    break;
                case "cos":
                    //double text1 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.cos()));
                    break;
                case "tan":
                    //double text2 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.tan()));
                    break;
                case "asen":
                    //double text3 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.asen()));
                    break;
                case "atan":
                    //double text4 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.atan()));
                    break;
                case "acos":
                    //double text5 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.acos()));
                    break;
                case "√":
                    //double text6 = Double.parseDouble(this.interfaz.txtmostrar.getText());
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.raiz()));
                    break;
                case "Log":
                    programa.setA(Double.parseDouble(this.interfaz.txtmostrar.getText()));
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.logarismo()));
                    break;
            }
        } else {
            interfaz.txtmostrar.setText(String.valueOf(0.0));
        }

        //interfaz.txtmostrar.setText(String.valueOf(programa.getResultado()));
    }

    public void operaciones() {
        String m = this.interfaz.txtmostrar.getText();
        String[] num = m.split(java.util.regex.Pattern.quote(this.interfaz.signo));
        programa.setA(Double.parseDouble(num[0]));
        programa.setB(Double.parseDouble(num[1]));

        switch (this.interfaz.signo) {
            case "+":
                this.interfaz.txtmostrar.setText("");
                this.interfaz.txtmostrar.setText(String.valueOf(programa.suma()));
                break;
            case "-":
                this.interfaz.txtmostrar.setText("");
                this.interfaz.txtmostrar.setText(String.valueOf(programa.resta()));
                break;
            case "*":
                this.interfaz.txtmostrar.setText("");
                this.interfaz.txtmostrar.setText(String.valueOf(programa.multiplicacion()));
                break;
            case "/":
                if (programa.getB() == 0) {
                    this.interfaz.txtmostrar.setText("Syntax Error");
                    break;
                } else {
                    this.interfaz.txtmostrar.setText("");
                    this.interfaz.txtmostrar.setText(String.valueOf(programa.division()));
                    break;
                }

            default:
                this.interfaz.txtmostrar.setText("0.0");

        }
    }
}
