/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavawash;

public abstract class Lavadora {

    public String marca;

    public Lavadora(String marca) {
        this.marca = marca;
    }
    public abstract String getDescripcion();
}

