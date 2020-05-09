/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controller.singleton;



public class Singleton {
    
    private String usuario;
    private String clave;
    
    private static Singleton admin;

    public Singleton(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public static Singleton getSingletonInstance(String usuario, String clave){
        boolean v = false;
        if(admin == null){
            admin = new Singleton(usuario, clave);
        }else{
            System.out.println("No se puede crear otro administrador con el usuario" + usuario);
        }
        return admin;
    }
    
    
    
            
}

