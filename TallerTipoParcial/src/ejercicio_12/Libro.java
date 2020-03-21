/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

//12. ¿Qué imprime el siguiente programa?

/*
El ejercicio Imprime 
La trilogia de newyork de Paul Auster
Es decir los atributos de nuestras clases Libro y Autor concatenados 
*/

public class Libro {

    private String titulo;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
