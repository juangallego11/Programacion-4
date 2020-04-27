/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import java.util.ArrayList;
import java.util.List;



public abstract class Universitario {
    
  public String nombre;
  public String direccion;
  

    public Universitario() {
    }

    public Universitario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
