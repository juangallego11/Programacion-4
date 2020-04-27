/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Universitario {

    private String centro;

    public Estudiante(String nombre, String direccion) {
        super(nombre, direccion);
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + "\n"
                + "Direccion: " + this.direccion + "\n"
                + "Centro: " + centro + "\n";
    }

    public String matricular(String c) {
        if (c == null) {
            return "ingrese un centro";
        } else {
            this.centro = c;
            System.out.println("Se matriculo el estudiante: " + "\n" + this.nombre + " " + "\n" + "al centro: " + c);
        }
        return null;

    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + getNombre() + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "Centro: " + getCentro() + "\n");
    }

    public void mostrarTodosEstudiantes(List<Estudiante> l) {
        if (l.isEmpty()) {
            System.out.println("No hay estudiantes");
        } else {
            for (Estudiante estudiante : l) {
                System.out.println(estudiante.toString());
            }
        }
    }

    public void buscarEstudiante(List<Estudiante> l, String nombre) {
        for (Estudiante estudiante : l) {
            if (estudiante.getNombre().equals(nombre)) {
                System.out.println(estudiante.toString());
            }   
        }
        

    }

}
