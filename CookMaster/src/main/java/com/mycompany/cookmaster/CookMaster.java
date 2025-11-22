/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cookmaster;

/**
 *
 * @author ashly
 */
public class CookMaster {

    public static void main(String[] args) {
        System.out.println("=== CookMaster - Sistema de Recetas ===\n");
        
        User user1 = new User("Ana", 1, "ana123");
        Admin admin1 = new Admin("Ashly", 1, "ashly1306");
        Cocinero cocinero1 = new Cocinero("Santiago", 1, "santiago31");
        
        admin1.leerRegistroPropio();
        admin1.logearse();
        admin1.agregarNuevaReceta();
        admin1.editarReceta();
        admin1.eliminaReceta();
        admin1.consultarRecetas();
        admin1.buscarPorNombre();
        
        cocinero1.leerRegistroPropio();
        cocinero1.logearse();
        

        // Crear receta tipo Postre
        Postre postre = new Postre("Tiramisu", 45, 30.5, "Media", 350);
        postre.agregarIngrediente(new Ingrediente("Cafe", 100.0, 2));
        postre.agregarIngrediente(new Ingrediente("Queso Mascarpone", 200, 1));
        postre.agregarPaso(new Paso(1, "Mezclar los ingredientes."));
        postre.agregarPaso(new Paso(2, "Refrigerar por 2 horas."));
        
        // Crear receta tipo Plato Fuerte
        PlatoFuerte plato = new PlatoFuerte("Lasania", 60, 120.4, 3, 5, "Alta", "Carne molida");
        plato.agregarIngrediente(new Ingrediente("Carne molida", 500, 2 ));
        plato.agregarIngrediente(new Ingrediente("Queso Mozzarella", 200, 4));
        plato.agregarPaso(new Paso(1, "Armar capas."));
        plato.agregarPaso(new Paso(2, "Hornear 40 minutos."));

        // Crear receta tipo Bebida
        Bebida bebida = new Bebida("Limonada", 10, 50, "Baja", "Bajo", 4);
        bebida.agregarIngrediente(new Ingrediente("Limon", 500, 3));
        bebida.agregarIngrediente(new Ingrediente("Azucar", 100, 4));
        bebida.agregarPaso(new Paso(1, "Mezclar todo."));
        bebida.agregarPaso(new Paso(2, "Agregar hielo."));

        // Imprimir usando toString()
        System.out.println(postre.toString());
        System.out.println(plato.toString());
        System.out.println(bebida.toString());

    }
}