/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.controlador.Controlador;
import Calculadora.logica.LOGICA;
import Calculadora.vista.Vista;


public class Main {

    
    public static void main(String[] args) {
        LOGICA modelo = new LOGICA();
        Vista vista= new  Vista();
       
        Controlador calculadora = new Controlador(modelo,vista);
        calculadora.inciar();
        vista.setVisible(true);
        
    }
    
}
