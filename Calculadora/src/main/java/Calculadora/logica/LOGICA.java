/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.logica;

public class LOGICA {

    double a, b, resultado;

    public LOGICA() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public double suma() {
        this.resultado = this.a + this.b;
        return this.resultado;
    }

    public double resta() {
        this.resultado = this.a - this.b;
        return this.resultado;
    }

    public double multiplicacion() {
        this.resultado = this.a * this.b;
        return this.resultado;
    }

    public double division() {
        this.resultado = this.a / this.b;
        return this.resultado;
    }

    public double sen() {
        this.resultado = 0;
        this.resultado = Math.sin(this.a);
        return this.resultado;
    }

    public double cos() {
        this.resultado = 0;
        this.resultado = Math.cos(this.a);
        return this.resultado;
    }

    public double tan() {
        this.resultado = 0;
        this.resultado = Math.tan(this.a);
        return this.resultado;
    }

    public double asen() {
        this.resultado = 0;
        this.resultado = Math.asin(this.a);
        return this.resultado;
    }

    public double atan() {
        this.resultado = 0;
        this.resultado = Math.atan(this.a);
        return this.resultado;
    }

    public double acos() {
        this.resultado = 0;
        this.resultado = Math.acos(this.a);
        return this.resultado;
    }

    public double logarismo() {
        this.resultado = 0;
        this.resultado = Math.log10(this.a);
        return this.resultado;
    }

    public double raiz() {
        this.resultado = 0;
        this.resultado = Math.sqrt(this.a);
        return this.resultado;
    }

}
