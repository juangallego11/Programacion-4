/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

public class Azucar extends Decorardor {

    private Adiciones adicion;

    public Azucar(Adiciones adicion) {
        super(adicion);
        this.adicion = adicion;
    }

    @Override
    public String getdescripcion() {
        return adicion.getdescripcion() + "MAS AZUCAR";
    }

    @Override
    public int getprecio() {
        return adicion.getprecio() + 0;
                }

}
