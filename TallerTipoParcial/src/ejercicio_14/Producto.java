/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;




public class Producto {
    
    private String idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto() {
  
    }

    @Override
    public String toString() {
        return "Identificador: " + idProducto + "\n" +
               "Nombre del producto: " + nombreProducto + "\n" +
               "Precio del producto: " + precioProducto + " ";
    }

    public Producto(String idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public void actualizarNombreProducto(String idproducto, String nombre, double precio){
        if(idproducto.equals(this.idProducto)){
           this.nombreProducto = nombre;
           this.precioProducto= precio;
            System.out.println("Se actualizo el producto");
        } else {
            System.out.println("El producto no existe");
        }
            
        }
        
    }
