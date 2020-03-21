/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

//9. a) ¿Qué imprime el siguiente programa? b) ¿Y si prop en Clase1 no la declaramos como static?

//Respuesta

/*
Inicialmente sin modificar el tipo de variable imprime {9 9}
al quitarle el tipo static a la variable y cambiarlo por un public imprime {7 7}
Esto es porque las variables estaticas no pueden ser modificadas y al igualar el
objeto1 con el objeto2 y me deja el valor que ya esta {9}, 
al quitarlo si me cumple la sentencia.


*/



public class Clase3 {

    public int prop = 0;

    public Clase3(int valor) {
        prop = valor;
    }

    public int valorprop() {
        return prop;
    }

}
