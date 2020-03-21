/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

//7. ¿Cuál es el error del siguiente programa?
//Respuesta

/*
El error estaba en la linea 

double total_cuenta=cuenta_1.saldo;
System.out.println(“Total actual en la cuenta: “
+total_cuenta +” Euros”);

no se puede acceder a la vble saldo directamente porque esta declarada como privada
y colo podemos tener acceso mediante los metodos de acceso get y set

 */
public class Cuenta {

    private int numeroCuenta;
    public double saldo;
    
    public Cuenta() {
    }

    public Cuenta(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } // Fin constructor cuenta

    public double depositar(double cantidad) {
        this.saldo = saldo + cantidad;
        return saldo;
    } // Fin método deposito

    public double saldo() {
        return saldo;
    } // Fin método saldo

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumero_cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}

