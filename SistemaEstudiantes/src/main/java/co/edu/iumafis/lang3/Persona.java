/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.lang3;

/**
 *
 * @author Tobón
 */
public abstract class Persona {
    String nombre;
    int id;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public abstract String toString();
}

