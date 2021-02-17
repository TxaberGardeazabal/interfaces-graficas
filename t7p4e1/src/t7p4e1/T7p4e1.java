/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p4e1;

import modelo.*;
import vista.*;
import java.util.ArrayList;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
/**
 *
 * @author txaber
 */
public class T7p4e1 {

    /**
     * @param args the command line arguments
     */
    public static Cliente[] lClientes;
    public static ArrayList<Cuenta> lCuentas;
    public static ArrayList<Movimiento> lMovimientos;
    
    public static Cliente clienteMem;
    public static Cuenta cuentaMem;
    
    public static VInicio vi;
    public static VClave vc;
    public static VPrincipal vp;
    
    public static void main(String[] args) {
        try {
            
            generarCuentas();
            generarClientes();
            generarMovimientos();
            
            vi = new VInicio();
            vi.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "problemas: "+e.getMessage());
        }
    }
    
    public static void generarClientes() {
        lClientes = new Cliente[2];
        
        lClientes[0] = new Cliente("11111111A","miren","010203",lCuentas.get(0));
        
        lClientes[1] = new Cliente("56443322T","manu","123456",lCuentas.get(1));
        lClientes[1].addCuentaAsociada(lCuentas.get(2));
    }
    
    public static void generarCuentas() {
        lCuentas = new ArrayList();
        
        lCuentas.add(new Cuenta("01010101"));
        lCuentas.get(0).setSaldo(1000f);
        lCuentas.add(new Cuenta("20202020"));
        lCuentas.get(0).setSaldo(1000f);
        lCuentas.add(new Cuenta("12312312"));
        lCuentas.get(1).setSaldo(1000f);
    }
    
    public static void generarMovimientos() {
        lMovimientos = new ArrayList();
        ArrayList<Movimiento> add = new ArrayList();
        
        lMovimientos.add(new Movimiento("ingreso",150f,LocalDate.now()));
        lMovimientos.add(new Movimiento("alquiler",-730f,LocalDate.now()));
        lMovimientos.add(new Movimiento("ingreso",74f,LocalDate.now()));
        
        add.add(lMovimientos.get(0));
        add.add(lMovimientos.get(1));
        add.add(lMovimientos.get(2));
        lCuentas.get(0).setTransacciones(add);
        
        lMovimientos.add(new Movimiento("reintegro",-30f,LocalDate.now()));
        lMovimientos.add(new Movimiento("all you can eat shrimp for 8.99",8.99f,LocalDate.now()));
        
        add = new ArrayList();
        add.add(lMovimientos.get(3));
        add.add(lMovimientos.get(4));
        lCuentas.get(1).setTransacciones(add);
    }
    
    public static boolean validarCliente(String dato) {
        clienteMem = null;
        int x = 0;
        for (x = 0;x < lClientes.length && !lClientes[x].getDNI().equals(dato);x++) {}
        
        if (x == lClientes.length)
            return false;
        
        clienteMem = lClientes[x];
        return true;
    }
    
    public static boolean validarCodigo(String codigo) {
        return clienteMem.getClave().equals(codigo);
    }
    
    public static JRadioButton[] procesoSeleccionCuenta(JRadioButton[] list) {
        int ret = clienteMem.getNumeroCuentaAsociada();
        int x;
        
        if (ret <= 6)
            for (x = 0;x < ret;x++) {
                list[x].setText(clienteMem.getCuentaAsociada().get(x).getIdentifier());
            }
        else {
            for (x = 0;x < 6;x++) {
                list[x].setText(clienteMem.getCuentaAsociada().get(x).getIdentifier());
            }
        }
        return list;         
    }
    
    public static void cuentaSeleccionada(javax.swing.JRadioButton id) {
        // cual es la cuenta
        lCuentas.stream().filter((lCuenta) -> (lCuenta.getIdentifier().equals(id.getText()))).forEachOrdered((lCuenta) -> {
            cuentaMem = lCuenta;
        });
    }
    
    public static JLabel[] consultaMov(JLabel[] labels) {
        int ret = cuentaMem.getNumeroMovimientos();
        int x;
        int contar;
        
        if (ret > 5) {
            for (x = ret-5, contar = 0;x < ret;x++, contar++) {
                labels[contar].setText(cuentaMem.getTransacciones().get(x).toString());
            }
        }
        else {
            for (x = 0;x < ret;x++ ) {
                labels[x].setText(cuentaMem.getTransacciones().get(x).toString());
            }
        }
        return labels;
    }
    
    public static String pasarSaldo() {
        return "Saldo: " + Float.toString(cuentaMem.getSaldo()) + "€";
    }
    
    public static boolean ValidarCuenta(String cod) {
        int x;
        for (x = 0;x < lCuentas.size() && !cod.equals(lCuentas.get(x).getIdentifier()); x++) {}
        if (x == lCuentas.size())
            return false;
        return true;
    }
    
    public static void nuevoMovimiento(String tipo, String destino, Float cantidad) {
        
        
        Movimiento mov = new Movimiento(tipo,cantidad,LocalDate.now());
        // se añade a la base de datos
        lMovimientos.add(mov);
        // se añade a la lista del la cuenta
        cuentaMem.nuevoMovimiento(mov);
        // actualizar saldo
        cuentaMem.setSaldo(cuentaMem.getSaldo() + cantidad);
        
        if (tipo.equals("Transferencia")) {
            // la cuenta destino se actializa
            Movimiento mov2 = new Movimiento(tipo,cantidad - cantidad * 2,LocalDate.now());
            
            Cuenta cuentaDest = lCuentas.get(0);
            for (int x = 0;x < lCuentas.size();x++) {
                if (lCuentas.get(x).getIdentifier().equals(destino)) 
                cuentaDest = lCuentas.get(x);
            }
            lMovimientos.add(mov2);
            cuentaDest.nuevoMovimiento(mov2);
            cuentaDest.setSaldo(cuentaMem.getSaldo() + (cantidad - cantidad * 2));
        }
    }
    
    public static void sacarVentanaAcceso() {
        vc = new VClave();
        vc.setVisible(true);
    }
    
    public static void acceder() {
        vp = new VPrincipal();
        vp.setVisible(true);
        
        vi.dispose();
        vc.dispose();
    }
    
}
