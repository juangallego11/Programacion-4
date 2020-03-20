/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double c) {
        if (c < 0) {
            
        } else {
            this.cantidad += c;
            System.out.println("Se agrego " + c + " a la cuenta.");
            System.out.println("Cantidad total: " + this.cantidad);
        }

    }
    
    public void retirar(double cantidad){
        if(this.cantidad < cantidad){
            this.cantidad = 0;
            System.out.println("Se retiro " + cantidad + " de la cuenta.");
            System.out.println("Cantidad total: " + this.cantidad);
        } else {
            this.cantidad -= cantidad;
            System.out.println("Se retiro " + cantidad + " de la cuenta.");
            System.out.println("Cantidad total: " + this.cantidad);
        }
        
    }

}
