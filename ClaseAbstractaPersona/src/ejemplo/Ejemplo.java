/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author cristiancg
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante(1, "Juan", "1130610", "cra 19",0.0,0.0, 1, "Sistemas");
        
        
        Profesor profesor = new Profesor(100, "Matematico", 1, "alberto", "63578", "cra 20", 5.500,25.0);
     
        System.out.println("Nombre profesor: " + profesor.getNombre());
        System.out.println("Profesion: "+ profesor.getProfesion());
        System.out.println("Salario: " + profesor.salario());
        
        System.out.println(" ");
        
        System.out.println("Id Estudiante: " + estudiante.getIdEstudiante());
        System.out.println("Nombre Estudiante: " + estudiante.nombre);
        System.out.println("Carrera: "+ estudiante.getCarrera());
        
        
        
        
    }
    
}
