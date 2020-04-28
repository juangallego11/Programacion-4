/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lavawash.Lavadora;
import lavawash.LavadoraFactory;
import lavawash.LavadoraFactoryMethod;
import zoologico.Descuento;
import zoologico.DescuentoFactory;
import zoologico.DescuentoFactotyMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Una empresa que ensambla lavadoras para diferentes marcas tiene una máquina que es la\n"
                + "encargada de realizar el ensamble de todas las lavadoras. Ya que la configuración de la máquina\n"
                + "se debe hacer manualmente el administrador quiere mejorar este proceso y desea implementar un\n"
                + "software que haga esto por él, de manera que el administrador sólo seleccione la marca de\n"
                + "lavadora. Implemente el patrón Factory Mehotd para ayudar al administrador con esta tarea.");
        System.out.println("");
        LavadoraFactoryMethod factory = new LavadoraFactory();
        Lavadora lav = factory.fabricarLav("LG");
        Lavadora lav1 = factory.fabricarLav("SAMSUNG");
        Lavadora lav2 = factory.fabricarLav("CENTRALES");
        Lavadora lav3 = factory.fabricarLav("XXX");
        System.out.println("");
        System.out.println(lav.getDescripcion());
        System.out.println("");
        System.out.println(lav1.getDescripcion());
        System.out.println("");
        System.out.println(lav2.getDescripcion());

        System.out.println("\n");
        System.out.println("* En un zoológico se ofrecerá una nueva promoción la cual consiste en un descuento sobre la\n"
                + "entrada según la fecha especial. Si es es el cumpleaños se da un descuento del 20% y además se\n"
                + "le regala una tarjeta de felicitación, si es el día de la madre o padre se da un descuento del 5% y\n"
                + "se regala un botón decorado y si es por navidad se da un descuento del 10% y se regala una figura\n"
                + "de un reno. Diseñe e implemente un programa para el zoológico que le ayude en esta nueva promocion *");

        DescuentoFactotyMethod descu = new DescuentoFactory();
        Descuento des = descu.hacerDescuento("Mayo");
        Descuento des1 = descu.hacerDescuento("Junio");
        Descuento des2 = descu.hacerDescuento("Noviembre");
        Descuento des3 = descu.hacerDescuento("Diciembre");
        System.out.println("");
        System.out.println(des.getDescripcion());
        System.out.println("");
        System.out.println(des1.getDescripcion());
        System.out.println("");
        System.out.println(des2.getDescripcion());
        System.out.println("");
        System.out.println(des3.getDescripcion());
    }

}
