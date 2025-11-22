/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookmaster;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashly
 */
public class Bebida implements Recetas {
    public String nombre;
    public int id;
    public double tiempoPreparacion;
    public List<Ingrediente> ingredientes;
    public List<Paso> pasos;
    public String tipo = "Bebida";
    public String nivelDulce;
    public String nivelAlcohol;
    public int cantidadTopping;

    public Bebida(String nombre, int id, double tiempoPreparacion, 
                   String nivelDulce, String nivelAlcohol, int cantidadTopping) {

        this.nombre = nombre;
        this.id = id;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
        this.nivelDulce = nivelDulce;
        this.nivelAlcohol = nivelAlcohol;
        this.cantidadTopping = cantidadTopping;
    }
    
    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Paso> getPasos() {
        return pasos;
    }
    
     public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }
     
    public void agregarPaso(Paso paso) {
        pasos.add(paso);
    } 

    @Override
    public void verListaRecetasGeneral() {
        System.out.println("Bebida: " + nombre);
    }
    @Override
    public void verListaPreparacion() {
        pasos.forEach(p -> System.out.println(p.getDescripcion()));
    }
    @Override
    public void verListaIngredientes() {
        ingredientes.forEach(i -> System.out.println(i.getNombre() + " - " + i.getCantidad()));
    }
    @Override
    public void verListaPasos() {
        pasos.forEach(p -> System.out.println(p.getNumero() + ". " + p.getDescripcion()));
    }

    public void preparar() {
        System.out.println("Preparando bebida " + nombre);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== BEBIDA ===\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Tiempo de preparacion: ").append(tiempoPreparacion).append(" minutos\n");
        sb.append("Nivel dulce: ").append(nivelDulce).append("\n");
        sb.append("Nivel alcohol: ").append(nivelAlcohol).append("\n");
        sb.append("Cantidad de Topping: ").append(cantidadTopping).append("\n");
        sb.append("Ingredientes:\n");
        ingredientes.forEach(i ->
            sb.append(" - ").append(i.getNombre()).append(": ").append(i.getCantidad()).append("\n")
        );
        sb.append("Pasos:\n");
        pasos.forEach(p ->
            sb.append(" ").append(p.getNumero()).append(". ").append(p.getDescripcion()).append("\n")
        );
        return sb.toString();
    }
    
    @Override
    public void definirCosto() {
        System.out.println("Definiendo costo.");
    }
}
