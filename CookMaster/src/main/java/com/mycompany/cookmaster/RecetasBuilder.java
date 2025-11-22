/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookmaster;

/**
 *
 * @author ashly
 */
import java.util.ArrayList;
import java.util.List;

public abstract class RecetasBuilder implements Recetas {

    protected String nombre;
    protected double costo;

    protected List<String> ingredientes = new ArrayList<>();
    protected List<String> pasos = new ArrayList<>();

    @Override
    public void verListaRecetasGeneral() {
        System.out.println("Receta: " + nombre);
        System.out.println("Costo: $" + costo);
    }

    @Override
    public void verListaIngredientes() {
        System.out.println("Ingredientes:");
        ingredientes.forEach(System.out::println);
    }

    @Override
    public void verListaPasos() {
        System.out.println("Pasos:");
        pasos.forEach(System.out::println);
    }
}

