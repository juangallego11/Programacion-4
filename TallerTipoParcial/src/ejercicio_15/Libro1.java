/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

/*
15. Escriba un programa que use una lista enlazada para gestionar una serie de libros identificados
por su título. El programa debe ser capaz de ir añadiendo libros a la serie mantenida y de poder
imprimir los títulos de toda la serie cuando se le indique. Como ejemplo use los siguientes libros:
“Niebla”, “La Metamorfosis” y “El callejón de los milagros”

*/


public class Libro1 {

    private String titulo;

    public Libro1(String titulo) {
        this.titulo = titulo;
    }

        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
