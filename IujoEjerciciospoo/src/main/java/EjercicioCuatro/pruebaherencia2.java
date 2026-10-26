/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author usuario
 */
public class pruebaherencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("=== PRUEBA DE INTANCIACION Y HERENCIA === \n");
        
        Persona personaGenerica = new Persona("Carlos Gomez", "V-18234567");
        System.out.println("--- Ficha de clase Padre ---");
        personaGenerica.mostrarFicha();
        
        System.out.println();
        
        Profesor docente = new Profesor ("Dra. Maria Torres", "V-12987654", "Programacion Orientada a Herencia");
        System.out.println("--- Ficha de la Clase Hijo ---");
        docente.mostrarFicha();
        
        
        System.out.println("\n Verificacion de getters heredados:");
        System.out.println("El profesor" + docente.getNombre() + "posee la cedula" + docente.getCedula());
        
    }
    
}
