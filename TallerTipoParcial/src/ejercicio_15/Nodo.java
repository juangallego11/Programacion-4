/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;





public class Nodo {
    
    private Libro1 libro;
    private Nodo siguiente;

    
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

    public Libro1 getLibro() {
        return libro;
    }

    public void setLibro(Libro1 libro) {
        this.libro = libro;
    }
    
}
