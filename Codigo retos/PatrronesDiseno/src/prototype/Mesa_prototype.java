/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;

/**
 *
 * @author Gallego
 */
public class Mesa_prototype {

    private HashMap<String, Mesa> prototipos = new HashMap<String, Mesa>();

    public Mesa_prototype() {
        Mesa_Redonda redonda = new Mesa_Redonda(10.000, "4*4", "wengue", "cedro", 4);
        Mesa_Cuadrada cuadrada = new Mesa_Cuadrada(10.000, "4*4", "wengue", "cedro", 4);
        Mesa_Ovalada ovalada = new Mesa_Ovalada(10.000, "4*4", "wengue", "cedro", 6);
        prototipos.put("ovalada", ovalada);
        prototipos.put("cuadrada", cuadrada);
        prototipos.put("redonda", redonda);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();

    }

}
