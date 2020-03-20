/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Gallego
 */
public abstract class Mesa implements Cloneable{
    
  private double precio;
  private String tamanio;
  private String color;
  private  String madera;
  private Integer cantSillas;
  
  public Mesa(double precio, String tamanio, String color, String madera, Integer cantSillas){
  this.precio = precio;
  this.tamanio = tamanio;
  this.color= color;
  this.madera = madera;
  this.cantSillas = cantSillas;
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public Integer getCantSillas() {
        return cantSillas;
    }

    public void setCantSillas(Integer cantSillas) {
        this.cantSillas = cantSillas;
    }
  
  
}
