
import ejercicio1.Cliente;
import ejercicio1.CtaAhorros;
import ejercicio1.CtaCdt;
import ejercicio1.CtaCorriente;
import ejercicio1.Cuenta;
import ejercicio2.Coches;
import ejercicio2.Furgonetas;
import ejercicio2.Motos;
import ejercicio2.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {

    public static void main(String[] args) {

        /*
        CtaAhorros ctaahorros = new CtaAhorros(0.6, 100000.00);
        CtaCorriente ctacorriente = new CtaCorriente(20000.00);
        CtaCdt ctacdt = new CtaCdt();
        ctacdt.abrirCdt(1000000.00, 6);
        Cuenta cuenta1 = new Cuenta("1", "1112627876", ctaahorros, ctacorriente, ctacdt);
        Cliente cliente = new Cliente("1", "juan", "1112627876", cuenta1);
        cliente.depositarAhorros(5000);
        cliente.depositarCorriente(10000.00);
        cliente.retirarCtaAhorros(25000.00);
        cliente.retirarCtaCorriente(10000.00);
        System.out.println("");
        cliente.getCuenta().getSaldo();
        cliente.cerrarCdt();
        System.out.println("El nuevo saldo de su cuenta corriente es: " + cliente.getCuenta().getCuenta_corriente().getSaldo());
        System.out.println(" ");
        cliente.getCuenta().getSaldo();
        */
        
        
        Furgonetas furgoneta1 = new Furgonetas("RLM80E", 60000.00, "5 TONELADAS");
        Coches coche1 = new Coches("KVJ-131", 88000.00, true, false);
        Motos moto1 = new Motos("VNS28E", 7000.00, true, false);
        Vehiculo vehi = new Vehiculo("1", 0, true, 0, furgoneta1, coche1, moto1);
        vehi.alquilarFurgoneta(true);
        System.out.println("");
        System.out.println(furgoneta1);
        System.out.println(" ");
        vehi.alquilarCoche(true);
        System.out.println("");
        System.out.println(coche1);
        System.out.println("");
        vehi.alquilarMoto(true);
        System.out.println("");
        System.out.println(moto1);
        System.out.println("");
        vehi.devolverFurgoneta(true);
        System.out.println("");
        System.out.println(furgoneta1);
        System.out.println("");
        vehi.devolverVehiculo("RLM80E", 55000.00);
        System.out.println(furgoneta1);
    }

}
