/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Isoceles {

    private double bLado1;
    private double lado2;
    private double lado3;

    public Isoceles(int bLado1, int lado2, int lado3) {
        this.bLado1 = bLado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBlado1() {
        return bLado1;
    }

    public void setBlado1(double bLado1) {
        this.bLado1 = bLado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double esIsoceles() {
        if (bLado1 == lado2 || bLado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es Isoceles ");
            return 1;
        } else {
            System.out.println("El triangulo no es Isoceles");
        }
        return 0;
    }

    public double area() {
        if (bLado1 < lado2 && bLado1 < lado3) {
            double base = bLado1;
            double altura = Math.sqrt((lado2 * lado2) - ((base * base) / 4));
            double area = ((base * altura)/2);
            return area;

        } else {
            System.out.println("La base no puede ser menos al valor de los lados");
        }
        return 0;
    }
    
    
    public double perimetro(){
        
        return bLado1 + lado2 + lado3;
        
    }
}
