/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Gallego
 */
public class Lider {

    private String nombre;
    private String apellido;
    private String id;
    private String areaTrabajo;

    private static Lider lider;

    public Lider(String nombre, String apellido, String id, String areaTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.areaTrabajo = areaTrabajo;
    }

    public static Lider getLiderInstance(String nombre, String apellido, String id, String areaTrabajo) {
        if(lider == null){
            lider = new Lider(nombre, apellido, id, areaTrabajo);
            System.out.println("Lider "+nombre+" creado correctamente.");
        }else{
            System.out.println("No se puede crear un nuevo lider de desarrollo: "+nombre +"\n"
                    + "Porque no puede existir mas de 1 lider");
        }
        return lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

}
