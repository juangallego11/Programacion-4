/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


public class Cliente {
    
    private String idCliente;
    private String nombre;
    private String cedula;
    private Cuenta cuenta;

    public Cliente(String idCliente, String nombre, String cedula, Cuenta cuenta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", cedula=" + cedula + ", cuenta=" + cuenta + '}';
    }
    
    public void depositarAhorros(double s) {
        cuenta.getCuenta_ahorros().depositarAhorros(s);
        }
    
    public void depositarCorriente(double s) {
        cuenta.getCuenta_corriente().depositarCorriente(s);
        }
    
    public void retirarCtaAhorros(double cantidad){
        cuenta.getCuenta_ahorros().retirarCtaAhorros(cantidad);
    }
    
    public void retirarCtaCorriente(double cantidad){
        cuenta.getCuenta_corriente().retirarCtaCorriente(cantidad);
    }
    
     public void abrirCdt(double cantidadInv, int meses) {
         cuenta.getCuenta_cdt().abrirCdt(cantidadInv, meses);
     }
     
     public void cerrarCdt(){
         double saldoCdt = cuenta.getCuenta_cdt().cerrarCdt();
         double saldoCtaCorriente = cuenta.getCuenta_corriente().getSaldo();
         double nuevoSaldo = saldoCdt + saldoCtaCorriente;
         cuenta.getCuenta_corriente().setSaldo(nuevoSaldo);
     }
}
