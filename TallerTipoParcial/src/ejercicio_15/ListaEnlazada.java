/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;




public class ListaEnlazada {
    
    private Nodo cabeza;
    private Nodo cola;

    public void crearlista() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void AgregarLibro(Libro1 libro) {
        Nodo nodo1 = new Nodo();
        nodo1.setLibro(libro);
        if (esVacia()) {
            this.cabeza = nodo1;
            this.cola = nodo1;
        } else {
            nodo1.setSiguiente(cabeza);
            this.cabeza = nodo1;
        }
    }

    
    public void listar() {
        if (!esVacia()) {
            Nodo aux = cabeza;
            while (aux != null) {
                System.out.print(aux.getLibro().getTitulo() + "\n" );
                aux = aux.getSiguiente();
            }
            System.out.println("null");
        }
    }
    
    
}
