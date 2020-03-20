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
public class Estudiante extends Persona{
    
    protected int idEstudiante;
    protected String carrera;
 

    public Estudiante(int idPersona, String nombre, String identificacion, String direccion, Double precioPorHora, Double horasTrabajadas, int idEstudiante, String carrera) {
        super(idPersona, nombre, identificacion, direccion, precioPorHora, horasTrabajadas);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    

    @Override
    protected double salario() {
        return 0.0;
    }
    
    
}
