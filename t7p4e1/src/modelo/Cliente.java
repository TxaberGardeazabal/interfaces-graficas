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
public class Cliente {
    
    private String DNI;
    private String nombre;
    private String clave;
    private ArrayList<Cuenta> cuentaAsociada;

    public Cliente(String DNI, String nombre, String clave, Cuenta cuentaAsociada) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.clave = clave;
        this.cuentaAsociada = new ArrayList();
        this.cuentaAsociada.add(cuentaAsociada);
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(ArrayList<Cuenta> cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }
    
    public void addCuentaAsociada(Cuenta cuenta) {
        this.cuentaAsociada.add(cuenta);
    }
    
    public int getNumeroCuentaAsociada() {
        return cuentaAsociada.size();
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", clave=" + clave + ", cuentaAsociada=" + cuentaAsociada + '}';
    }
    
}
