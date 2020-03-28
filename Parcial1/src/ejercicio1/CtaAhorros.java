/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class CtaAhorros {

    private double valorIntereses;
    private double saldo;

    public CtaAhorros(double valorIntereses, double saldo) {
        this.valorIntereses = valorIntereses;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorIntereses() {
        return valorIntereses;
    }

    public void setValorIntereses(double valorIntereses) {
        this.valorIntereses = valorIntereses;
    }

    @Override
    public String toString() {
        return "CtaAhorros{" + "valorIntereses=" + valorIntereses + ", saldo=" + saldo + '}';
    }

    public void depositarAhorros(double s) {
        if (s < 0) {
            System.out.println("No se puede ingresar valores negativos");
        } else {
            this.saldo += s;
            System.out.println("Se agrego " + s + " a la cuenta de ahorros.");
            System.out.println("Cantidad total: " + this.saldo);
        }
    }

    public void retirarCtaAhorros(double cantidad) {
        if (this.saldo < cantidad) {
            System.out.println("No es posible retirar ");
        } else {
            this.saldo -= cantidad;
            System.out.println("Se retiro " + cantidad + " de la cuenta de ahorros. ");
            System.out.println("Cantidad total: " + this.saldo);
        }

    }

}
