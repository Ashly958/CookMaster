/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookmaster;

/**
 *
 * @author ashly
 */
public class Cocinero extends User{
    
    public Cocinero(String nombre, int id, String password){
        super(nombre, id, password);
    }
    
    // Metodos
    @Override
    public void leerRegistroPropio(){
        System.out.println("\n===== LEER REGISTRO DE USUARIO =====");
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+id);
        System.out.println("Password: "+password);
    }
    
    @Override
    public void logearse(){
        System.out.println("User logeado.");
    }
    
}
