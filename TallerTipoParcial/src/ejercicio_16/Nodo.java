/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;


//16. ¿ Qué imprime el siguiente programa?
//a) rojo azul verde 
//b) null 
//c) rojo azul 
//d) azul verde

//Respuesta

/*
Imprime {rojo azul}
opcion D
*/


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
