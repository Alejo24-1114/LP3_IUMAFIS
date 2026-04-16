/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.lang3;

/**
 *
 * @author Tobón
 */
public class Estudiante {

    private String nombre;
    private String estado;
    private int codigo;
    private int semestre;
    private double promedio;
    private boolean activo;

    public Estudiante(String nombre, int codigo, int semestre,
            double promedio, boolean activo) {
        this.nombre = nombre;
        this.estado = estado;
        this.codigo = codigo;
        this.semestre = semestre;
        this.promedio = promedio;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
        }

    }

    @Override
    public String toString() {
        return String.format("[%d] %-15s | S%d | %.1f | %s | " + getEstado(),
                codigo, nombre, semestre, promedio,
                activo ? "Activo" : "Inactivo");
        
        
    }
}
