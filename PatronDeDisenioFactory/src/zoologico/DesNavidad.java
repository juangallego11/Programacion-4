/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

public class DesNavidad extends Descuento {

    public DesNavidad(String fecha) {
        super(fecha);
    }

    @Override
    public String getDescripcion() {
        return "En " + fecha + " Tienes el 10% de descuento + Figura Reno navidenio";
    }
}
