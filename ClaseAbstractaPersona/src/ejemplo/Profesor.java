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
public class Profesor extends Persona {
    
   
    protected int idProfesor;
    protected String profesion;


    public Profesor(int idProfesor, String profesion, int idPersona, String nombre, String identificacion, String direccion, Double precioPorHora, Double horasTrabajadas) {
        super(idPersona, nombre, identificacion, direccion, precioPorHora, horasTrabajadas);
        this.idProfesor = idProfesor;
        this.profesion = profesion;
    }
    
    

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

    @Override
    protected double salario() {
        return horasTrabajadas*precioPorHora;
    }
    
}
