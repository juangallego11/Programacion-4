
import java.util.Random;
import reto1.Cuenta;
import reto2.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public class Mein {

   
    public static void main(String[] args) throws CloneNotSupportedException {
       
        //Reto 1
        
        Cuenta juan = new Cuenta("Juan Gallego", 50000);
        juan.ingresar(5000);
        System.out.println("");
        juan.ingresar(10000);
        System.out.println("");
        juan.retirar(12000);
        System.out.println("");
        juan.retirar(54000);
        
   
        
       
    }
    
}
