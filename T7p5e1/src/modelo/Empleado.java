/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author txaber
 */
public class Empleado {
    
    private String Nºempleado;
    private String DNI;
    private String NSS;
    private String apellidos;
    private String direccion;
    private String telefono;
    private Character sexo;
    private Character estadoCivil;
    private LocalDate Fºalta;
    private Departamento departamento ;
    private Contrato contrato;
    private Usuario usuario;

    public Empleado(String Nºempleado, String DNI, String NSS, String apellidos, 
            String direccion, String telefono, Character sexo, Character estadoCivil, 
            LocalDate Fºalta, Departamento departamento, Contrato contrato) {
        this.Nºempleado = Nºempleado;
        this.DNI = DNI;
        this.NSS = NSS;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.Fºalta = Fºalta;
        this.departamento = departamento;
        this.contrato = contrato;
        this.usuario = null;
    }
    
    public Empleado(String Nºempleado, String DNI, String NSS, String apellidos, 
            String direccion, String telefono, Character sexo, Character estadoCivil, 
            LocalDate Fºalta, Departamento departamento, Contrato contrato,Usuario usuario) {
        this.Nºempleado = Nºempleado;
        this.DNI = DNI;
        this.NSS = NSS;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.Fºalta = Fºalta;
        this.departamento = departamento;
        this.contrato = contrato;
        this.usuario = usuario;
    }

    public String getNºempleado() {
        return Nºempleado;
    }

    public void setNºempleado(String Nºempleado) {
        this.Nºempleado = Nºempleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFºalta() {
        return Fºalta;
    }

    public void setFºalta(LocalDate Fºalta) {
        this.Fºalta = Fºalta;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
