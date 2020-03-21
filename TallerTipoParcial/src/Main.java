
import ejercicio1.Isoceles;
import ejercicio_11.Complejo;
import ejercicio4.Clase1;
import ejercicio5.Clase2;
import ejercicio6.Polinomio;
import ejercicio7.Cuenta;
import ejercicio9.Clase3;
import ejercicio_12.Autor;
import ejercicio_12.Libro;
import ejercicio_13.Alumno;
import ejercicio_16.Lista;

public class Main {

    public static void main(String[] args) {

        /*Ejercicio 1*/
 /*
        
        System.out.println("");
        Isoceles triangulo = new Isoceles(5, 10, 10);
        triangulo.esIsoceles();
        System.out.println("El triangulo es de medidas: " + triangulo.getBlado1() + " x " + triangulo.getLado2() + " x " + triangulo.getLado3());
        System.out.println("El area del triangulo es: " + triangulo.area());
        System.out.println("El perimetro del triangulo es: " + triangulo.perimetro());
        
         */

 /* Ejercicio 4 */
 /*Clase1 obj1 = new Clase1();
        System.out.println("");
        obj1.imprimir(24.3, 5);*/
 /*Ejercicio 5*/
 /*
        Clase2 obj1 = new Clase2(5, 4);
        System.out.print(obj1.modificar(4) + " ");
        Clase2 obj2 = new Clase2(5, 4);
        System.out.print(obj2.modificar(5) + " ");
        obj2 = obj1;
        System.out.println(obj2.modificar(5) + " ");
         */
 /*Ejercicio 7*/
 /* //Se crea la cuenta
        Cuenta cuenta_1 = new Cuenta(123456, 2505.32);

        // Se consulta el saldo
        
        cuenta_1.depositar(1000);
        //cuenta_1.depositar(100);
        System.out.println("Total actual en la cuenta: "
        + cuenta_1.getSaldo() + " Euros");*/
 /*Ejercicio 6*/
 /*
    int[] coeficientesP = {1,2,3,4};
    int gradoP = 3;

    Polinomio p = new Polinomio(coeficientesP, gradoP);
    System.out.println("p(x) = " + p);

    int[] coeficientesQ = {5, 0, 3};
    int gradoQ = 2;

    Polinomio q = new Polinomio(coeficientesQ, gradoQ);
    System.out.println("q(x) = " + q);

    Polinomio r = p.suma(q);
    System.out.println("p(x) + q(x) = " + r);

    System.out.println("p(3) = " + p.evaluar(3));

    Polinomio s = p.multiplicaEscalar(3);
    System.out.println("3 * p(x) = " + s);
         */
 /*Ejercicio 8 */
 
 
        /*
        Clase3 obj1 = new Clase3 (7);
        Clase3 obj2 = new Clase3 (9);
        obj2 = obj1;
        System.out.print(obj1.valorprop() + " ");
        System.out.print(obj2.valorprop() + " ");
        */
        
        
   /*Ejercicio 11*/
   
        /*
        Complejo c1 = new Complejo(1.0, 1.0);
        Complejo c2 = new Complejo(2.0, 2.0);
        Complejo c3;
        // operadores aritméticos
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        c3 = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        c3 = c1.multiplicar(c2);
        System.out.println(c1 + " * " + c2 + " = " + c3);
        */
        
        
    /*Ejercicio 12*/
    
        /*
        Autor autor = new Autor("Paul", "Auster");
        Libro libro = new Libro("La Trilogia de NewYork", autor);
        System.out.println(libro.getTitulo() + " de " + (libro.getAutor()).toString());
        */
        
        
    /*Ejercicio 13*/
    
        /*
        Alumno a1 = new Alumno();
        System.out.println("Objeto a1:\n-----------\n");
        a1.imprimir();
        System.out.println("\nLlamada al metodo prueba1(a1).\n");
        prueba1(a1);
        a1.imprimir();
        System.out.println(" ");
        Alumno a2 = new Alumno();
        System.out.println("\nObjeto a2:\n-----------\n");
        a2.imprimir();
        System.out.println("\nLlamada al metodo prueba2(a2).\n");
        prueba2(a2);
        System.out.println("\nEn main: Fuera ya del metodo prueba2. \n");
        a2.imprimir();
    }

    public static void prueba1(Alumno b) {
        b.cambiargrupo('B');
    }

    public static void prueba2(Alumno b) {
        b = new Alumno();
        b.cambiargrupo('B');
        System.out.println("\nDentro del metodo prueba2. \n");
        b.imprimir();
        */
        
        
    /*Ejercicio 16*/
    
        Lista colores = new Lista();
        System.out.println(" ");
        colores.incluir("rojo ");
        System.out.println(" ");
        colores.incluir("azul ");
        System.out.println(" ");
        colores.incluir("verde ");
        colores.imprimir();
    
    
        
    }
}

