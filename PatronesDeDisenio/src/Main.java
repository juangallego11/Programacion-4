/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import AlquilerVehiculos.Coches;
import AlquilerVehiculos.Furgonetas;
import AlquilerVehiculos.Motos;
import AlquilerVehiculos.Vehiculo;
import Universidad.Administrativo;
import Universidad.Estudiante;
import Universidad.Profesor;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        
        //EJERCICIO NRO 2
        
        /*List<Estudiante> estudiantes = new ArrayList();
        System.out.println("* MATRICULAR ESTUDIANTES *");
        Estudiante est = new Estudiante("Cristian Gallego", "cra 19 # 11-32");
        Estudiante est1 = new Estudiante("Juan Gallego", "cll 42 # 6b-32");
        Estudiante est2 = new Estudiante("Alejandra Giron", "cll 40 # 6c-15");
        Estudiante est3 = new Estudiante("Leandro Gallego", "cra20 # 9-11");
        System.out.println("\n");
        est.matricular("1");
        est1.matricular("1");
        est2.matricular("2");
        est3.matricular("1");
        estudiantes.add(est);
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        System.out.println("\n");
        System.out.println("* LISTA DE ESTUDIANTES *");
        System.out.println("\n");
        est.mostrarTodosEstudiantes(estudiantes);
        System.out.println(" ");
        List<Profesor> profesores = new ArrayList();
        System.out.println("* ADSCRIBIR PROFESORES *");
        Profesor pro = new Profesor(0, "Ricardo Betancourth", "Parque Industrial call 15");
        pro.setNroRegistro(pro.generarNroRegistro());
        Profesor pro1 = new Profesor(0, "Cristian Duque", "cll 75a # 28");
        pro1.setNroRegistro(pro1.generarNroRegistro());
        System.out.println("\n");
        pro.adscribirse("Programacion");  
        pro1.adscribirse("Matematicas");
        profesores.add(pro);
        profesores.add(pro1);
        System.out.println("\n");
        System.out.println("* LISTA DE PROFESORES *");
        System.out.println("\n");
        pro.mostrarTodosProfesores(profesores);
        System.out.println("");
        List<Administrativo> administrativo = new ArrayList();
        System.out.println("* ADSCRIBIR PERSONAL ADM/PAS *");
        Administrativo adm = new Administrativo(0, null, "Fidel Castro", "utp pereira");
        adm.setNroRegistro(adm.generarNroRegistro());
        Administrativo adm1 = new Administrativo(0, null, "Stella Arias", "utp pereira");
        adm1.setNroRegistro(adm.generarNroRegistro());
        Administrativo adm2 = new Administrativo(0, null, "Leonel Messi", "utp pereira");
        adm2.setNroRegistro(adm.generarNroRegistro());
        System.out.println("\n");
        adm.adscribirUnidadAdm("Comercial");
        adm1.adscribirUnidadAdm("Cafeteria");
        adm2.adscribirUnidadAdm("Aseo");
        administrativo.add(adm);
        administrativo.add(adm1);
        administrativo.add(adm2);
        System.out.println("\n");
        System.out.println("* LISTA DEL PERSONAL ADM/PAS *");
        System.out.println("\n");
        adm.mostrarTodoPersonalAdm(administrativo);*/
        
        
        // EJERCICIO NRO 1
        
        Furgonetas furgoneta1 = new Furgonetas("RLM80E", 60000.00, "5 TONELADAS");
        Coches coche1 = new Coches("KVJ-131", 88000.00, true, true);
        Motos moto1 = new Motos("VNS28E", 7000.00, true, true);
        Vehiculo vehi = new Vehiculo(furgoneta1, coche1, moto1);
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
        vehi.devolverFurgoneta("RLM80E", 80000.00);
        System.out.println("");
        vehi.devolverMoto("VNS28E", 9000.00);
        System.out.println("");
        vehi.devolverCoche("KVJ-131", 100000.00);
        
        
    }
    
}
