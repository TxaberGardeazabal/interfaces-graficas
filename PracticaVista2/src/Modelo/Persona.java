/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author txaber
 */
public class Persona {
    
    private String DNI;
    private String nombre;
    private String apellidos;

    public Persona(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona " + "DNI= " + DNI + ", nombre= " + nombre + " " + apellidos;
    }
    
    
}
