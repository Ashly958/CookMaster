/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookmaster;
import java.lang.String;

/**
 *
 * @author ashly
 */
public class Admin extends User{
    
    public Admin(String nombre, int id, String password){
        super(nombre, id, password);
    }
    
    // Metodos
    @Override
    public void leerRegistroPropio(){
        System.out.println("\n===== LEER REGISTRO DE USUARIO =====");
        System.out.println("- Nombre: "+nombre);
        System.out.println("- ID: "+id);
        System.out.println("- Password: "+password);
    }
    
    @Override
    public void logearse(){
        System.out.println("User logeado.");
    }
    
    public void agregarNuevaReceta(){
        System.out.println("Agregando nueva receta.");
    }
    
    public void editarReceta(){
        System.out.println("Editar receta.");
    }
    
    public void eliminaReceta(){
        System.out.println("Eliminar receta.");
    }
    
    public void consultarRecetas(){
        System.out.println("Consultando recetas.");
    }
    
    public void buscarPorNombre(){
        System.out.println("buscando por nombre.");
    }
}
