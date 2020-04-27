/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlquilerVehiculos;

public class Motos {

    private String matricula;
    private double kilometrajeAcomulado;
    private boolean estadoDeAlquilado;
    private boolean casco;
    private double tarifa = 0.6;

    public Motos(String matricula, double kilometrajeAcomulado, boolean estadoDeAlquilado, boolean casco) {
        this.matricula = matricula;
        this.kilometrajeAcomulado = kilometrajeAcomulado;
        this.estadoDeAlquilado = estadoDeAlquilado;
        this.casco = casco;
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

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Datos de la Moto: " + "\n"
                + "Matricula:" + matricula + "\n"
                + "Kilometraje acomulado: " + kilometrajeAcomulado + "\n"
                + "Estado de Alquiler: " + estadoDeAlquilado + "\n"
                + "Casco: " + casco + "\n"
                + "Tarifa: " + tarifa + " " + "Euros x Kilometro";
    }

    public void alquilarMoto() {
        this.estadoDeAlquilado = true;
        System.out.println("Se ha alquilado con exito la moto de matricula: " + matricula);

    }

    public double devolverMoto(String matricula, double kilometrajeAco) {
        double kilometrajeGastado = kilometrajeAco - this.kilometrajeAcomulado;
        if (casco == true) {
            double b = (kilometrajeGastado * tarifa) + 10.0;
            this.estadoDeAlquilado = false;
            System.out.println("costo alquiler de la moto es: " + b + "\n" +
                    "tarifa por servicios extra incluida.");
            return b;
        } else {
            double b = kilometrajeGastado * tarifa;
            this.estadoDeAlquilado = false;
            System.out.println("costo alquiler de la moto es: " + b);
            return b;
        }

    }
}
