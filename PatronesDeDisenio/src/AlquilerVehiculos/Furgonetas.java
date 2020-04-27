/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlquilerVehiculos;

public class Furgonetas {

    private String matricula;
    private double kilometrajeAcomulado;
    private String capacidadCarga;
    private boolean estadoDeAlquilado = false;
    private double tarifa = 0.5;

    public Furgonetas(String matricula, double kilometrajeAcomulado, String capacidadCarga) {
        this.matricula = matricula;
        this.kilometrajeAcomulado = kilometrajeAcomulado;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Datos del vehiculo: " + "\n"
                + "Matricula: " + matricula + "\n"
                + "Kilometraje acomulado: " + kilometrajeAcomulado + "\n"
                + "Capacidad de Carga: " + capacidadCarga + "\n"
                + "Estado de alquiler: " + estadoDeAlquilado + "\n"
                + "Tarifa de alquiler: " + tarifa + " " + "Euros x Kilometro";
    }

    public boolean isEstadoDeAlquilado() {
        return estadoDeAlquilado;
    }

    public void setEstadoDeAlquilado(boolean estadoDeAlquilado) {
        this.estadoDeAlquilado = estadoDeAlquilado;
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

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void alquilarFurgoneta() {
        this.estadoDeAlquilado = true;
        System.out.println("Se ha alquilado con exito la furgoneta de placas: " + matricula);
    }

    public double devolverFurgoneta(String matricula, double kilometrajeAco) {
        double kilometrajeGastado = kilometrajeAco - this.kilometrajeAcomulado;
        double b = kilometrajeGastado * tarifa;
        this.estadoDeAlquilado = false;
        System.out.println("costo alquiler de la furgoneta es: " + b);
        return b;
    }
}
