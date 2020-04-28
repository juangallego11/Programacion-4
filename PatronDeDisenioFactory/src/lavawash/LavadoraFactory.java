/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavawash;

public class LavadoraFactory implements LavadoraFactoryMethod {
    
    public LavadoraFactory() {
    
    }


    @Override
    public Lavadora fabricarLav(String marca) {
        if (marca == "LG") {
            return new CargaFrontal(marca);
        }
        if (marca == "SAMSUNG") {
            return new CargaSuperior(marca);
        }
        if (marca == "CENTRALES") {
            return new ConFuncionSecado(marca);
        }else {
            System.out.println("INGRESE MARCA CORRECTA LA MARCA: " + marca + " NO EXISTE");
        }
        return null;
        
        
    }

}
