/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author txaber
 */

public class Alumno {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private Curso cursoMatriculado;

    public Alumno(String dni, String nombre, String apellidos, Curso cursoMatriculado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "dni= " + dni + ", nombre= " + nombre + " " + apellidos + ", cursoMatriculado=" + cursoMatriculado;
    }
    
    
}
