/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author cristiancg
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Registrar  persona...");
        System.out.print("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scan.nextInt();
        System.out.print("Ingrese el sexo: ");
        String sexo = scan.next();
        System.out.print("Ingresa el peso: ");
        double peso = scan.nextDouble();
        System.out.print("Ingresa la altura: ");
        double altura = scan.nextDouble();
        System.out.println("\n");
        
        Persona david = new Persona(nombre, 0, edad, sexo, peso, altura);
        System.out.println(david.toString());
        System.out.println("\n");
        david.CalcularIMC();
        david.esMayorDeEdad();
        System.out.println("\n");
        
        Persona cristian = new Persona(nombre, edad, sexo);
        System.out.println(cristian.toString());
        System.out.println("\n");
        cristian.CalcularIMC();
        cristian.esMayorDeEdad();
        System.out.println("\n");
        
        
        Persona juan = new Persona();
        juan.setNombre(nombre);
        juan.setEdad(edad);
        juan.setSexo(sexo);
        juan.setPeso(peso);
        juan.setAltura(altura);
       
        System.out.println(juan.toString());
        System.out.println("\n");
        juan.CalcularIMC();
        juan.esMayorDeEdad();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
