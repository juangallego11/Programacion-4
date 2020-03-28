/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;



public class Vehiculo {
    
    //private String  matricula;
    //private double kilometraje;
    //private boolean estadoDeAlquilado;
    //private double tarifa;
    private Furgonetas furgoneta;
    private Coches coche;
    private Motos moto;

    public Vehiculo(Furgonetas furgoneta, Coches coche, Motos moto) {
        //this.matricula = matricula;
        //this.kilometrajeAcomulado = kilometrajeAcomulado;
        //this.estadoDeAlquilado = estadoDeAlquilado;
        //this.tarifa = tarifa;
        this.furgoneta = furgoneta;
        this.coche = coche;
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "furgoneta=" + furgoneta + ", coche=" + coche + ", moto=" + moto + '}';
    }

    

    public Motos getMoto() {
        return moto;
    }

    public void setMoto(Motos moto) {
        this.moto = moto;
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
    public void devolverFurgoneta(String matricula, double kilometrajeAco){
        furgoneta.devolverFurgoneta(matricula, kilometrajeAco);
    }
    public void devolverCoche(String matricula, double kilometrajeAco){
        coche.devolverCoche(matricula, kilometrajeAco);
    }
    public void devolverMoto(String matricula, double kilometrajeAco){
        moto.devolverMoto(matricula, kilometrajeAco);
    }
    
    }
