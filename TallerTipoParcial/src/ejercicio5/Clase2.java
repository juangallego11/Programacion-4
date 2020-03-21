/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;


//5. ¿Qué imprime el siguiente programa?

//Respuesta

/*

El resultado que imprime es {8 9 9 10 13 14 }

*/

public class Clase2 {

    int p1, p2;

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public Clase2(int i, int j) {
        p1 = i;
        p2 = j;
    }

    public int modificar(int i) {
        p1 = p1 + i;
        p2 = p2 + i;
        System.out.print(p2 + " ");
        return p1;
    }
}
