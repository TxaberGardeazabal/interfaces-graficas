/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author txaber
 */
public class Departamento {
    
    private String nombre;
    private ArrayList<Empleado> empTrabaja;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empTrabaja = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpTrabaja() {
        return empTrabaja;
    }

    public void setEmpTrabaja(ArrayList<Empleado> empTrabaja) {
        this.empTrabaja = empTrabaja;
    }
    
    public void anadirEmpleado (Empleado empleado) {
        this.empTrabaja.add(empleado);
    }
}
