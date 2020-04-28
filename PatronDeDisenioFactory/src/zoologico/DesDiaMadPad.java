/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

public class DesDiaMadPad extends Descuento{

    public DesDiaMadPad(String fecha) {
        super(fecha);
    }

    @Override
    public String getDescripcion() {
        return "En " + fecha + " Tienes el 5% de descuento por mes de Madres/padre + boton decorado "; 
    }

}
