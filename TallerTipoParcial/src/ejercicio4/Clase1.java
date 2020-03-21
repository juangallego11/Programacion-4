/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;


// 4. ¿Cuál es el resultado del siguiente programa?

//Respuesta:

/* 

El resultado es {24.3 7}
   Ahora bien si le estamos ingresando dos valores por instancia los 
   cuales son {24.3 5} este no nos imprime {24.3 7} porque en la clase, Clase1
   definimos unos valores fijos para las variables (valor) y (x), sin embargo
   en el metodo imprimir, en la parte del sout, le estamos pasando el valor por defecto de X con el this.x,
   mas no el valor de X que le pasamos cuando lo instanciamos, la solucion para este error es quitar el this

*/




public class Clase1 {

    private double valor = 9.8;
    private int x = 7;
    
    public void imprimir(double valor, int x) {
        System.out.print(valor +" " + x);
}
}
