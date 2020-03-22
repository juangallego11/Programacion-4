/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/*

a) Un objeto de A hereda de B *
b) Un método de B tiene como parámetro un objeto A *
c) Un atributo de ejemplar de B es un objeto A
d) Ninguna de las anteriores es cierta

*/


//Respuesta

// Un objeto A hereda de B porque es una relacion uno a uno
//Un método de B tiene como parámetro un objeto A

public class ObjetoB {
    
    private int idObjeto;
    private String nombre;
    private ObjetoA objetoA;
    
    public void setObjetoA(ObjetoA objetoA){
        this.objetoA = objetoA;
    }
    
    
    
}
