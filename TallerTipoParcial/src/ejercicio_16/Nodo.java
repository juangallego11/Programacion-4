/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

public class Nodo {

    private String color;
    private Nodo siguiente;

    public Nodo(String color) {
        this.color = color;
    }

    public void poner(Nodo siguiente_nodo) {
        siguiente = siguiente_nodo;
    }

    public Nodo coger() {
        return siguiente;
    }

    public String color() {
        return color;
    }

}
