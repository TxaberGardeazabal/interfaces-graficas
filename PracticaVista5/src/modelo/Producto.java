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
public class Producto {
    
    private String nombre;
    private Integer udDisponible;
    private Float precio;
    
    private ArrayList<Proveedor> provee;

    public Producto(String nombre, Integer udDisponible, Float precio) {
        this.nombre = nombre;
        this.udDisponible = udDisponible;
        this.precio = precio;
    }

    public Producto(String nombre, Integer udDisponible, Float precio, ArrayList<Proveedor> provee) {
        this.nombre = nombre;
        this.udDisponible = udDisponible;
        this.precio = precio;
        this.provee = provee;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUdDisponible() {
        return udDisponible;
    }

    public void setUdDisponible(Integer udDisponible) {
        this.udDisponible = udDisponible;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedor> getProvee() {
        return provee;
    }

    public void setProvee(ArrayList<Proveedor> provee) {
        this.provee = provee;
    }
    
    
}
