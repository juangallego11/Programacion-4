/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Dr
 */
public abstract class Persona {
    
    protected int idPersona;
    protected String nombre;
    protected String identificacion;
    protected String direccion;
    protected Double precioPorHora;
    protected Double horasTrabajadas;

    public Persona(int idPersona, String nombre, String identificacion, String direccion, Double precioPorHora, Double horasTrabajadas) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    protected abstract double salario();
    
    
            
}
