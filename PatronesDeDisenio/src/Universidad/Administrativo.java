/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import java.util.List;
import java.util.Random;

public class Administrativo extends Empleado {

    private String unidadAdm;

    public Administrativo(int nroRegistro, String unidadAdm, String nombre, String direccion) {
        super(nroRegistro, nombre, direccion);
        this.unidadAdm = unidadAdm;
    }

    public String getUnidadAdm() {
        return unidadAdm;
    }

    public void setUnidadAdm(String unidadAdm) {
        this.unidadAdm = unidadAdm;
    }

    @Override
    public String toString() {
        return  "Numero registro: " + getNroRegistro()+"\n"+
                "Funcionario: " + this.nombre + "\n" +
                "Direccion: " + this.direccion + "\n" +
                "Unidad: " + unidadAdm + "\n";
    }

    public String adscribirUnidadAdm(String u) {
        if (u == null) {
            return "Ingrese una Unidad administrativa";
        } else {
            this.unidadAdm = u;
            System.out.println("Se agrego el funcionario: " + "\n" + this.nombre + " " + "\n" + "a la unidad de: " + u);
        }
        return null;
    }
    
    public String ConsultarFuncAdmNombre(String f){
        if(f.equals(nombre)){
            System.out.println(toString());
        } else{
           System.out.println("ingrese un nombre valido" + "\n"+
                   "el funcionario "+ f + " " + "No se encuentra adscrito al plantel"); 
        }
        return null;
    }
    
    public void mostrarTodoPersonalAdm(List<Administrativo> l) {
        if (l.isEmpty()) {
            System.out.println("No hay personal adscrito");
        } else {
            for (Administrativo administrativo : l) {
                System.out.println(administrativo.toString());
            }
        }
    }
    
    /*public int generarNroRegistro() {
        Random rnd = new Random();
        return rnd.nextInt(9999);
    }*/


}
