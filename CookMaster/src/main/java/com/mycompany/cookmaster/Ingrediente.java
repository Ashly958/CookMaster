/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cookmaster;

/**
 *
 * @author ashly
 */
public class Ingrediente {

    static void add(String azúcar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String nombre;
    public double cantidad;
    public int unidades;

    public Ingrediente(String nombre, double cantidad, int unidades) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidades = unidades;
    }

    public String getNombre() { return nombre; }
    public double getCantidad() { return cantidad; }
    public int getUnidades() { return unidades; }
    
    @Override
    public String toString() {
        return nombre + " (" + cantidad + " x " + unidades + ")";
    }
}
