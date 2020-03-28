/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


public class CtaCorriente {
    
    private double saldo;

    public CtaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CtaCorriente{" + "saldo=" + saldo + '}';
    }
    
    public void depositarCorriente(double c){
       if (c < 0) {
            
        } else {
            this.saldo += c;
            System.out.println("Se agrego " + c + " a la cuenta Corriente. ");
            System.out.println("Cantidad total: " + this.saldo);
        }
   }
    
    public void retirarCtaCorriente(double cantidad) {
        if (this.saldo < cantidad) {
            System.out.println("No es posible retirar ");
        } else {
            this.saldo -= cantidad;
            System.out.println("Se retiro " + cantidad + " de la cuenta de corriente. ");
            System.out.println("Cantidad total: " + this.saldo);
        }
    
}
    
}
