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
// ==================== SINGLETON - LIBRO DE RECETAS ====================
public class LibroRecetas {
    public static LibroRecetas instance;
    public List<Recetas> recetas;

    public LibroRecetas() {
        recetas = new ArrayList<>();
    }

    public static LibroRecetas getInstance() {
        if (instance == null) {
            instance = new LibroRecetas();
        }
        return instance;
    }

    public void agregarNuevaReceta(Recetas r) {
        recetas.add(r);
    }

    public void eliminarReceta(Recetas r) {
        recetas.remove(r);
    }

    public void consultarReceta() {
        recetas.forEach(Recetas::verListaRecetasGeneral);
    }

    public Recetas buscarPorNombre(String nombre) {
        for (Recetas r : recetas) {
            if (r instanceof Postre p && p.nombre.equals(nombre)) return p;
            if (r instanceof PlatoFuerte pf && pf.nombre.equals(nombre)) return pf;
            if (r instanceof Bebida b && b.nombre.equals(nombre)) return b;
        }
        return null;
    }
}
