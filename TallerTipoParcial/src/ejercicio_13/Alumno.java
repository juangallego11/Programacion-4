/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;


//13. 

//Respuesta

/*
El programa imprime el alumno asignado a un grupo A, para despues invocar el metodo
prueba que consiste en cambiar el objeto a un grupo B.

//Se corrige error de variables

Objeto a1:
-----------

Nombre: Alumno 1
Grupo: A

Llamada al metodo prueba1(a1).

Nombre: Alumno 1
Grupo: B
 

Objeto a2:
-----------

Nombre: Alumno 1
Grupo: A

Llamada al metodo prueba2(a2).


Dentro del metodo prueba2. 

Nombre: Alumno 1
Grupo: B

En main: Fuera ya del metodo prueba2. 

Nombre: Alumno 1
Grupo: A
*/


public class Alumno {
    
    public String nombre = "Alumno 1";
    public char grupo = 'A';

    public char devolvergrupo() {
        return grupo;
    }

    public void cambiargrupo(char nuevogrupo) {
        grupo = nuevogrupo;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Grupo: " + devolvergrupo());
    
}
 
}
