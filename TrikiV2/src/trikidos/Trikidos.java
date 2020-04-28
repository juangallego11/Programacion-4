/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trikidos;

/**
 *
 * @author cristiancg
 */
public class Trikidos {
       
    public static void main(String[] args) {
        int i = 0;
        Triki triki = new Triki();
        while (i == 0) {
            triki.reinicio();
            if (triki.marco.isVisible() == false) {
                i = 1;
            }
        }
    }
}
