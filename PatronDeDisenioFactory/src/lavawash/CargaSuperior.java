/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavawash;



public class CargaSuperior extends Lavadora {

    public CargaSuperior(String marca) {
        super(marca);
    }

    @Override
    public String getDescripcion() {
        return "Lavadora de Carga Superior de marca: " + marca;
    }
    
    
}
