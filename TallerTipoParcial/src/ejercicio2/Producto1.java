/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;




public class Producto1 {
    
    private int id;
    private String nombre;
    private double costo;

    public Producto1(int id, String nombre, double costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + "Codigo Producto: "+ id + "\n"+
                "Nombre: " + nombre + "\n"+
                        "Precio: " + costo;
    }
    
    
    public void modificarNombre(int id, String nombre){
        if(id == this.id){
           this.nombre = nombre;
            System.out.println("Se actualizo el producto");
        } else {
            System.out.println("El producto no existe");
        }
    }
    
    public void modificarCosto(int id, double costo){
        if(id == this.id){
            this.costo = costo;
            System.out.println("Se modifico el precio a: " + costo);
        }else {
            System.out.println("El id no existe ");
        }
        
    }
    
    
    
}
