/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavawash;




public class ConFuncionSecado extends Lavadora{

    public ConFuncionSecado(String marca) {
        super(marca);
    }

    @Override
    public String getDescripcion() {
        return "Lavadora con Funcion de secado de marca: " + marca;
    }
    
    
}
