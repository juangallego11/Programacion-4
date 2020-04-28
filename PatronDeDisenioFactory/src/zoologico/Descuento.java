/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

public abstract class Descuento {

    public String fecha;

    public Descuento(String fecha) {
        this.fecha = fecha;
    }
    public abstract String getDescripcion();
}
