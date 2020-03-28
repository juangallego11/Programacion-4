/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;



public class Vehiculo {
    
    private String  matricula;
    private double kilometrajeAcomulado;
    private boolean estadoDeAlquilado;
    private double tarifa;
    private Furgonetas furgoneta;
    private Coches coche;
    private Motos moto;

    public Vehiculo(String matricula, double kilometrajeAcomulado, boolean estadoDeAlquilado, double tarifa, Furgonetas furgoneta, Coches coche, Motos moto) {
        this.matricula = matricula;
        this.kilometrajeAcomulado = kilometrajeAcomulado;
        this.estadoDeAlquilado = estadoDeAlquilado;
        this.tarifa = tarifa;
        this.furgoneta = furgoneta;
        this.coche = coche;
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", kilometrajeAcomulado=" + kilometrajeAcomulado + ", estadoDeAlquilado=" + estadoDeAlquilado + ", tarifa=" + tarifa + ", furgoneta=" + furgoneta + ", coche=" + coche + ", moto=" + moto + '}';
    }
    

    public Motos getMoto() {
        return moto;
    }

    public void setMoto(Motos moto) {
        this.moto = moto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKilometrajeAcomulado() {
        return kilometrajeAcomulado;
    }

    public void setKilometrajeAcomulado(double kilometrajeAcomulado) {
        this.kilometrajeAcomulado = kilometrajeAcomulado;
    }

    public boolean isEstadoDeAlquilado() {
        return estadoDeAlquilado;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estadoDeAlquilado = estadoDeAlquilado;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Furgonetas getFurgoneta() {
        return furgoneta;
    }

    public void setFurgoneta(Furgonetas furgoneta) {
        this.furgoneta = furgoneta;
    }

    public Coches getCoche() {
        return coche;
    }

    public void setCoche(Coches coche) {
        this.coche = coche;
    }
    
    public void alquilarFurgoneta(boolean x){
       furgoneta.alquilarFurgoneta();
    }
   public void alquilarCoche(boolean x){
       coche.alquilarCoche();
    } 
    public void alquilarMoto(boolean x){
       moto.alquilarMoto();
    }
    public void devolverFurgoneta(boolean x){
        furgoneta.devolverFurgoneta();
    }
    public void devolverCoche(boolean x){
        coche.devolverCoche();
    }
    public void devolverMoto(boolean x){
        moto.devolverMoto();
    }
    public double devolverVehiculo(String matricula, double kilometrajeAco){
           double a,b;
           this.kilometrajeAcomulado= kilometrajeAco;
           a= kilometrajeAco-this.furgoneta.getKilometrajeAcomulado();
           b= a * furgoneta.getTarifa();
           System.out.println("costo alquiler: " + b);
        return 0;
       }
    }
