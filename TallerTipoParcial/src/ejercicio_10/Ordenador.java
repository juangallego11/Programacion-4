/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/*
10. Dado el siguiente fragmento de código:
Ordenador sobremesa; Ordenador portatil;
sobremesa = new Ordenador();
sobremesa.precio(900);
portatil = new Ordenador();
portatil.precio(1100);
portatil = sobremesa;
sobremesa = null;
*/

//Respuesta

/*
¿Qué afirmación es cierta?

a) Al final tanto el objeto sobremesa como el objeto portátil apuntan anull *

*/


public class Ordenador {
    
    public int prop = 0;

    public Ordenador(int valor) {
        prop = valor;
    }

    public int valorprop() {
        return prop;
    }
    
}
