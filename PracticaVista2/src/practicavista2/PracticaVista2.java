/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavista2;

/**
 *
 * @author txaber
 */
import Vista.*;
import Modelo.*;
import java.util.ArrayList;
public class PracticaVista2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Persona> listaPersona;
    public static Valta v1;
    public static Vlista v2;
    
    public static void main(String[] args) {
        listaPersona = new ArrayList();
        
        v1 = new Valta();
        v1.setVisible(true);
        
    }
    
    public static void tenDatos(String dni,String nombre, String apellido) {
        listaPersona.add(new Persona(dni,nombre,apellido));
    }
    
    public static String mostrarDatos() {
        String ret = "";
        for (int x = 0;x < listaPersona.size();x ++) {
            ret += listaPersona.get(x).toString() + "\n";
        }
        return ret;
    }
    
    public static void mostrarLista() {
        v1.dispose();
        v2 = new Vlista();
        v2.setVisible(true);
    }
    
    public static void salir() {
        v2.dispose();
    }
}
