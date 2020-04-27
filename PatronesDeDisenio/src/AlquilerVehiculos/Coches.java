/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlquilerVehiculos;

public class Coches {

    private String matricula;
    private double kilometrajeAcomulado;
    private boolean estadoDeAlquilado;
    private boolean extras;
    private double tarifa = 0.4;

    public Coches(String matricula, double kilometrajeAcomulado, boolean estadoDeAlquilado, boolean extras) {
        this.matricula = matricula;
        this.kilometrajeAcomulado = kilometrajeAcomulado;
        this.estadoDeAlquilado = estadoDeAlquilado;
        this.extras = extras;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
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

    @Override
    public String toString() {
        return "Datos del coche: " + "\n"
                + "Matricula: " + matricula + "\n"
                + "Kilometraje acomulado: " + kilometrajeAcomulado + "\n"
                + "Estad de Alquilado: " + estadoDeAlquilado + "\n"
                + "Extras: " + extras + "\n"
                + "Tarifa: " + tarifa + " " + "Euros x Kilometro";
    }

    public void alquilarCoche() {
        this.estadoDeAlquilado = true;
        System.out.println("Se ha alquilado con exito el coche de matricula: " + matricula);

    }

    public double devolverCoche(String matricula, double kilometrajeAco) {
        double kilometrajeGastado = kilometrajeAco - this.kilometrajeAcomulado;
        if (extras == true) {
            double b = (kilometrajeGastado * tarifa) + 20.0;
            this.estadoDeAlquilado = false;
            System.out.println("El costo del alquiler del coche es : " + b + "\n"+
                    "tarifa por servicios extra incluida.");
            return b;
        } else {
            double b = kilometrajeGastado * tarifa;
            this.estadoDeAlquilado = false;
            System.out.println("costo alquiler: " + b);
            return b;
        }

    }

}
