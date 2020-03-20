
import prototype.Mesa;
import prototype.Mesa_prototype;
import singleton.Lider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gallego
 */
public class Main {

    

    public static void main(String[] args) throws CloneNotSupportedException {
        
        /*singleton*/
        
        Lider david = Lider.getLiderInstance("David", "Gallego", "1112627876", "Bases");
        System.out.println("\n");
        Lider cristian = Lider.getLiderInstance("Cristian", "Gallego", "1112630610", "Software");
        
        /*Prototype*/
        
        Mesa_prototype mesaProt = new Mesa_prototype();
        Mesa mesa = (Mesa) mesaProt.prototipo("redonda");
        System.out.println("Mesa_redonda" + "Tamanio:" + mesa.getTamanio());

    }

}
