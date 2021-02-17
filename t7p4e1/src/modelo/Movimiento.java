/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author txaber
 */
public class Movimiento {
    
    private String tipo;
    private Float cantidad;
    private LocalDate fecha;

    public Movimiento(String tipo, Float cantidad, LocalDate fecha) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(form) + " " + tipo + " " + cantidad;
    }
    
    
}
