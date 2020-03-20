/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

public class Persona {

    protected String nombre;
    private Integer DNI;
    protected Integer edad;
    protected String sexo;
    protected double peso;
    protected double altura;

    @Override
    public String toString() {      
        return "Nombre: "+nombre+" \n"
                + "DNI: "+DNI+" \n"
                + "Edad: "+edad+" \n"
                + "Sexo: "+sexo+" \n"
                + "Peso: "+peso+" \n"
                + "Altura: "+altura+" \n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona(String nombre, Integer DNI, Integer edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = generarDNI();
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
    }

    public Persona() {
        this.DNI = generarDNI();
    }

    public int CalcularIMC() {
        double pesoIdeal = peso / (altura * altura);
        if (pesoIdeal < 20.0) {
            System.out.println("Usted esta por debajo de el peso ideal");
            return -1;
        }
        if (pesoIdeal >= 20.0 && pesoIdeal <= 25 ) {
            System.out.println("Usted esta en el peso ideal");
            return 0;
        }
        if (pesoIdeal > 25.0) {
            System.out.println("Usted puede estar sufriendo de sobrepeso");
            return 1;
        }
        return 0;
    }
    
    public boolean esMayorDeEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad ");
            return true;
        } else{
            System.out.println("Es menor de edad ");
            return false;
        }
    }
    
    public boolean comprobarSexo(String sexo){
        if(sexo == "H"){
            System.out.println("El sexo es correcto");
            return true;
            
        } else if(sexo == "M"){
            System.out.println("El sexo es correcto");
            return true;
        }else{
            System.out.println("El sexo no es correcto");
            return false;
        }
    }
    
    public Integer generarDNI(){
        return (int) (100000000*Math.random());
    }

}
