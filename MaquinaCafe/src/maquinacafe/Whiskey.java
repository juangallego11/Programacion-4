/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;




public class Whiskey extends Decorardor{
    private Adiciones adicion;

    public Whiskey(Adiciones adicion) {
        super(adicion);
        this.adicion = adicion;
    }

    @Override
    public String getdescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
