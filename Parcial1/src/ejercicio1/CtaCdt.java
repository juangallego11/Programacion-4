/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class CtaCdt {

    private int meses;
    private double saldo;
    //private double cantidadAinvertir;

    public CtaCdt() {
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CtaCdt{" + "Meses=" + meses + ", saldo=" + saldo + '}';
    }

    public double abrirCdt(double cantidadInv, int meses) {
        this.saldo = cantidadInv;
        this.meses = meses;
        System.out.println("Su CDT se abrio con exito con un valor de: " + cantidadInv);
        return 0.6;
    }

    public double cerrarCdt() {
        double saldoActual = saldo;
        this.saldo = 0;
        this.meses = 0;
        return saldoActual;
    }
}
