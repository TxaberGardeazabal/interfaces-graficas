/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p5e1;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;
/**
 *
 * @author txaber
 */
public class T7p5e1 {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList<Empleado> lEmpleados;
    private static Contrato[] lContratos;
    private static ArrayList<Departamento> lDepartamentos;
    
    public static VentanaInicio vi;
    public static VentanaPrincipal vp;
    
    public static Empleado empMem;
    public static Empleado empMem2;
    public static void main(String[] args) {
        try {
            generarContratos();
            generarDepartamentos();
            generarEmpleados();
            
            
            vi = new VentanaInicio();
            vi.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "problemas: "+e.getMessage());
        }
    }
    
    public static void generarContratos() {
        lContratos = new Contrato[4];
        
        lContratos[0] = new Contrato("indefinido");
        lContratos[1] = new Contrato("tiempo parcial");
        lContratos[2] = new Contrato("relevos");
        lContratos[3] = new Contrato("definido");
    }
    
    public static void generarDepartamentos() {
        lDepartamentos = new ArrayList();
        
        lDepartamentos.add(new Departamento("administracion"));
        lDepartamentos.add(new Departamento("personal"));
        lDepartamentos.add(new Departamento("oficina"));
        lDepartamentos.add(new Departamento("marketing"));
    }
    
    public static void generarEmpleados() {
        lEmpleados = new ArrayList();
        
        lEmpleados.add(new Empleado("17248","57813343H","1234","mikel zuazo","33","999999999",'H','S',LocalDate.now(),lDepartamentos.get(1),lContratos[0]
        ,new Usuario("mZuazo","12345Abcde")));
        lDepartamentos.get(1).anadirEmpleado(lEmpleados.get(0));
        lEmpleados.add(new Empleado("19537","41943046M","1234","marcel work","33","999999999",'H','C',LocalDate.now(),lDepartamentos.get(3),lContratos[3]));
        lDepartamentos.get(3).anadirEmpleado(lEmpleados.get(1));
        lEmpleados.add(new Empleado("15641","19572697Y","1234","txe gebara","33","999999999",'H','S',LocalDate.now(),lDepartamentos.get(2),lContratos[2]));
        lDepartamentos.get(2).anadirEmpleado(lEmpleados.get(2));
        lEmpleados.add(new Empleado("19266","15882569P","1234","pepe frog","33","999999999",'M','C',LocalDate.now(),lDepartamentos.get(2),lContratos[1]));
        lDepartamentos.get(2).anadirEmpleado(lEmpleados.get(3));
        lEmpleados.add(new Empleado("17591","57062965T","1234","asd dsa das sad","33","999999999",'M','S',LocalDate.now(),lDepartamentos.get(0),lContratos[0]));
        lDepartamentos.get(0).anadirEmpleado(lEmpleados.get(4));
        lEmpleados.add(new Empleado("19952","10696276H","1234","marta martinez","33","999999999",'M','C',LocalDate.now(),lDepartamentos.get(1),lContratos[1]
        ,new Usuario("mMartinez","987654321")));
        lDepartamentos.get(1).anadirEmpleado(lEmpleados.get(5));
    }
    
    public static boolean validarAcceso(String nombre, String contrasena) {
        // buscar que el usuario existe y de cual empleado es
        empMem = null;
        int x;
        boolean a = true;
        for (x = 0;x < lEmpleados.size() && a; x++) {
            // comprobar si hay valores nulos
            if (lEmpleados.get(x).getUsuario() !=  null) {
                if (lEmpleados.get(x).getUsuario().getNombre().equals(nombre)) {
                    a = false;
                    x = x - 1;
                }
            }
        }
        
        if (x == lEmpleados.size())
            return false;
        else {
            empMem = lEmpleados.get(x);
            
            // validar la contraseña de dicho usuario
            if (empMem.getUsuario().getContrasena().equals(contrasena))
                return true;
        }

        return false;
    }
    
    public static String generarCodigo() {
        // supuestamente el codigo se deberia de generar una secuencia 
        // pero no tengo de esos
        int x;
        boolean fond;
        do {
            fond = false;
            x = (int) (Math.random() * 10000);
            int y;
            for (y = 0;y < lEmpleados.size() && lEmpleados.get(y).getNºempleado().equals(String.valueOf(x));y++) {}
            if (y == lEmpleados.size())
                fond = true;
        }
        while (fond);
        return String.valueOf(x);
    }
    
    public static boolean validarNumero(String numero) {
        // aqui se valida el numero  de empleado
        empMem2 = null;
        int x;
        for (x = 0;x < lEmpleados.size() && lEmpleados.get(x).getNºempleado().equals(numero);x++) {}
        if (x == lEmpleados.size()) {
            return false;
        }
        return true;
    }
    
    public static void abrirVentanaPrincipal() {
        vi.dispose();
        vp = new VentanaPrincipal(empMem.getApellidos());
        vp.setVisible(true);
    }
    
    public static void salirInicio() {
        vi.dispose();
    }
    
    public static void salir() {
        vp.dispose();
    }
}