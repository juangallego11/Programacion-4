/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

/*
11. Implemente un programa que muestre por pantalla el resultado de la suma y el producto de dos
números complejos. Además, el programa deberá comprobar si dos números complejos dados son
iguales y también deberá multiplicar un número complejo por un entero. Para ello:
a) Dibuje el diagrama UML de la/s clase/s implicada/s, indicando todos sus miembros.
b) Implemente el código de la/s clase/s en Java.
*/


public class Complejo {
    
    
    private double real;
    private double imag;
  
    //Constructor por defecto de la clase
    public Complejo() {
   
    }
    //Constructor con parámetros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //métodos setters y getters
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
   
    /*sumar dos números complejos
    (a, b) + (c, d) = (a + c, b + d)*/
    
    
    public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }
   
    /*restar dos números complejos
    (a, b) - (c, d) = (a - c, b - d)*/
    
    
    public Complejo restar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }
   
    /*multiplicar dos números complejos
    (a, b) * (c, d) = (a*c – b*d, a*d + b*c)*/
    
    
    public Complejo multiplicar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }
   
   
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.imag != other.imag) {
            return false;
        }
        return true;
    } 
    
}
