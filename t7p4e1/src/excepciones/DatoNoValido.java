/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author txaber
 */
public class DatoNoValido extends Exception{
    String mensaje;

    public DatoNoValido(String mensaje) {
        this.mensaje = mensaje;
    }

    public DatoNoValido() {
    }

    public String getMensaje() {
        return mensaje;
    }
    
    
}
