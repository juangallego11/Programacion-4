/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;




public class DesCumpleanio extends Descuento{

    public DesCumpleanio(String fecha) {
        super(fecha);
    }

    @Override
    public String getDescripcion() {
        return "En " + fecha + " Tienes el 20% de descuento por ser tu cumpleanios + Entrada Gratis ";
    }

   
    
}
