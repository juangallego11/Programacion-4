/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import java.util.Random;



public abstract  class Empleado extends Universitario{
   private int nroRegistro; 
   
   public int generarNroRegistro() {
        Random rnd = new Random();
        return rnd.nextInt(9999);
   }

    public Empleado(int nroRegistro, String nombre, String direccion) {
        super(nombre, direccion);
        this.nroRegistro = nroRegistro;
    }


    public int getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }
  
}
