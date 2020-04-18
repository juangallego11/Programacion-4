/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;




public abstract class Decorardor implements Adiciones {
    private final Adiciones adicion;

    public Decorardor(Adiciones adicion) {
        this.adicion = adicion;
    }
    
}
