/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import java.util.List;
import java.util.Random;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(int nroRegistro, String nombre, String direccion) {
        super(nroRegistro, nombre, direccion);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "Numero registro: " + getNroRegistro() + "\n"+
                "Profesor: " + this.nombre + "\n"+
                "Direccion: " + this.direccion + "\n"+
                "Departamento: " + departamento + "\n";
    }

    public String adscribirse(String d) {
        if (d == null) {
            return "Ingrese un Departamento/Area";
        } else {
            this.departamento = d;
            System.out.println("Se agrego el Docente: " + "\n" + this.nombre + " " + "\n" + "al departamento de: " + d);
        }
        return null;
    }

    public String buscarProfesorPorNombre(String p) {
        if (p.equals(nombre)) {
            System.out.println(toString());
        } else {
            System.out.println("ingrese un nombre valido" + "\n"
                    + "el Profesor " + p + " " + "No se encuentra adscrito a la universidad");
        }
        return null;
    }

    public void mostrarProfesor() {
        System.out.println("Nombre: " + getNombre() + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "Departamento: " + getDepartamento() + "\n");
    }

    /*public int generarNroRegistro() {
        Random rnd = new Random();
        return rnd.nextInt(9999);
    }*/

    public void mostrarTodosProfesores(List<Profesor> l) {
        if (l.isEmpty()) {
            System.out.println("No hay profesores adscritos");
        } else {
            for (Profesor profesor : l) {
                System.out.println(profesor.toString());
            }
        }
    }
}
