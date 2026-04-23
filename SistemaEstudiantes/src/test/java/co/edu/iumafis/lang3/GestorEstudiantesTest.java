/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.iumafis.lang3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tobón
 */
class GestorEstudiantesTest {
    
        private GestorEstudiantes gestor;
        private Estudiante est1;
        
     @BeforeEach
    public void setUp() {
       gestor = new GestorEstudiantes();
        est1   = new Estudiante("Laura Gómez", 20241001, 5, 4.2, true);
    }
    
    @Test
    @DisplayName("Agregar un estudiante incrementa el total en 1")
    void agregar_unEstudiante_totalAumentaEnUno() {
        gestor.agregar(est1);
        assertEquals(1, gestor.getTotalEstudiantes());
    }

    @Test
    @DisplayName("Lista vacía retorna total 0")
    void listaVacia_total_esZero() {
        assertEquals(0, gestor.getTotalEstudiantes());  
    
 }
    
    //Arrange
    
    
    // Act
    
    //Assert
    
 
 
}
