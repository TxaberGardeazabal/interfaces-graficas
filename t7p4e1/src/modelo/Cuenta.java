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
public class Cuenta {
 
    private String identifier;
    private Float saldo;
    private ArrayList<Movimiento> transacciones;

    public Cuenta(String identifier) {
        this.identifier = identifier;
        this.saldo = 0f;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Movimiento> transacciones) {
        this.transacciones = transacciones;
    }
    
    public int getNumeroMovimientos() {
        return transacciones.size();
    }
    
    public void nuevoMovimiento(Movimiento movimiento) {
        this.transacciones.add(movimiento);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "identifier=" + identifier + ", saldo=" + saldo + ", transacciones=" + transacciones + '}';
    }
    
    
}
