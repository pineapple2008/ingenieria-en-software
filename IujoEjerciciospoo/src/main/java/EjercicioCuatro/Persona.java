/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuatro;

/**
 *
 * @author usuario
 */
public class Persona {
    
    protected String nombre;
    protected String cedula;
    
    
    
    public Persona(String nombre,String cedula){
        
            this.nombre =nombre;
            this.cedula = cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void mostrarFicha(){
        System.out.println("algo");
    }
    
}
