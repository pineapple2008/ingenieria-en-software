/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author usuario
 */
public class Profesor extends Persona {
    
    private String especialidad;
    
    public Profesor (String nombre,String cedula,String especialidad) {
        
        super(nombre, cedula);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    @Override
    public void mostrarFicha() {
        System.out.println("PROFESOR -> Nombre: " + nombre + "|Cedula" + cedula + "|Especialidad" + especialidad );
    }
    
}
