/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavista3;

import Vistas.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Objetos.*;
/**
 *
 * @author txaber
 */
public class PracticaVista3 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Alumno> listaAlumnos;
    private static ArrayList<Curso> listaCursos;
    
    private static VistaEntradaAlumnos ventana1;
    private static VistaAccion ventana2;
    private static String dniRep;
    
    public static void main(String[] args) {
        
        try {
            listaAlumnos = new ArrayList();
            listaCursos = new ArrayList();
            generarCursos();
            
            ventana1 = new VistaEntradaAlumnos();
            ventana1.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    
    public static void generarCursos() throws Exception{
        
        // genera cogigos de cursos
        for (int x = 0;x < 4;x ++) {
            char cup = '0';
            switch (x) 
            {
                case 0:
                    cup = 'A'; break;
                case 1:
                    cup = 'B'; break;
                case 2:
                    cup = 'C'; break;
                case 3:
                    cup = 'D'; break;
            }
            for (int y = 1;y < 5; y++){
                String cod = y + "" + cup;
                listaCursos.add(new Curso(cod));
            }
        }
    }
    
    public static void crearAlumno(String dni, String nombre, String apellidos, String curso) throws Exception {
        
        try {
            // valido curso aqui por seguridad
            int k = 0;
            Curso cur;
            for (k = 0;k < listaCursos.size() || curso.equals(listaCursos.get(k).getCodigo());k ++) {}
            if (k == listaCursos.size()) {
                //throw
            }
            
            Alumno add = new Alumno(dni, nombre, apellidos, listaCursos.get(k));
            if (listaAlumnos.contains(add)) {
                // throw
            }
            listaAlumnos.add(add);
            
            // existe el alumno?
            boolean exists = false;
            for (int x = 0;x < listaAlumnos.size();x ++) {
                if (dni.equals(listaAlumnos.get(x).getDni()))
                    exists = true;
            }
            if (exists) {
                ventanaAccion(dni);
            }
        }
        catch (Exception e) {
            
        }
    }
    
    public static void ventanaAccion(String dni) {
        dniRep = dni;
        ventana2 = new VistaAccion();
        ventana2.setVisible(true);
    }
    
    public static String mostrarDatos() {
        String ret = "";
        // esta formula devuelve los datos de todos los alumnos cuyo dni equivale al
        // repetido.
        // tambien excluye el ultimo registro para asi no mostrar 
        // el mismo alumno
        for (int x = 0;x < (listaAlumnos.size()-1);x ++) 
        {
            if (listaAlumnos.get(x).getDni().equals(dniRep)) 
                ret += listaAlumnos.get(x).toString() + "\n";
        }
        
        return ret;
    }
    
    public static void borrar() {
        // retirar el alumno añadido hace poco
        listaAlumnos.remove(listaAlumnos.size()-1);
        ventana2.dispose();
    }
    
    public static void anadir() {
        // no hace nada porque el alumno ya esta añadido
        ventana2.dispose();
    }
    
    public static void salir() {
        ventana1.dispose();
    }
}
