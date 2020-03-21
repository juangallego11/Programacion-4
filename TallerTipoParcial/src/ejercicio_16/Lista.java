/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public void imprimir() {
        for (Nodo aux = primero; aux.coger() != null; aux = aux.coger()) {
            System.out.print(aux.color() + "");
}
}
public void incluir(String cadena) {
        Nodo elemento = new Nodo(cadena);
        if (primero == null) {
            primero = elemento;
        } else {
            Nodo aux;
            for (aux = primero; aux.coger() != null; aux = aux.coger());
            aux.poner(elemento);
        }
    }

}
