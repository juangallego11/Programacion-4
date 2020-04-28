/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

public class DescuentoFactory implements DescuentoFactotyMethod {

    public DescuentoFactory() {
    }

    @Override
    public Descuento hacerDescuento(String fecha) {
        if (fecha == "Mayo") {
            return new DesDiaMadPad(fecha); //+ "Tienes el 5% de descuento por mes de Madres + boton decorado "
        }
        if (fecha == "Noviembre") {
            return new DesCumpleanio(fecha); //+ "Tienes el 20% de descuento  por tu cumpleanos+ Entrada gratis"
        }
        if (fecha == "Junio") {
            return new DesDiaMadPad(fecha); //+ "Tienes el 5% de descuento + boton decorado"
        }
        if (fecha == "Diciembre") {
            return new DesNavidad(fecha); //+ "Tienes el 10% de descuento + Figura Reno navidenio"
        }else{
            System.out.println("No hay promociones para el mes " + fecha);
        }

        return null;

    }

}
