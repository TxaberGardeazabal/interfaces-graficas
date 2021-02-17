/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavista6;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 *
 * @author txaber
 */
public class PracticaVista6 {

    public static ArrayList<Producto> listaProductos;
    public static Proveedor[] listaProveedores;
    public static Producto prodEnMem;
    public static int cantEnMem;
    public static ArrayList<String> provEnMem;
    
    public static VentanaPrincipal vp;
    public static VentanaCompra vc;
    public static VentanaVenta vv;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            generarProveedores();
            generarProductos();
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "problemas: "+e.getClass());
        }
        
    }
    
    public static void generarProductos() throws Exception {
        
        listaProductos = new ArrayList();
        
        ArrayList<Proveedor> ad = new ArrayList();
        ad.add(listaProveedores[1]);
        ad.add(listaProveedores[3]);
        listaProductos.add(new Producto("zanahoria",6,3.8f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[1]);
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("patata",34,2.8f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[0]);
        ad.add(listaProveedores[1]);
        listaProductos.add(new Producto("puerro",15,5f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[2]);
        listaProductos.add(new Producto("cebolla",0,4.89f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("pimientos en lata",9,6.2f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[3]);
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("setas",12,3.4f,ad));
        
        ad = new ArrayList();
        ad.add(listaProveedores[0]);
        listaProductos.add(new Producto("lentejas kilo",17,12f,ad));
    }
    
    public static void generarProveedores() throws Exception {
        listaProveedores = new Proveedor[5];
        
        listaProveedores[0] = new Proveedor("manolo verduras"); 
        listaProveedores[1] = new Proveedor("de la tierra");
        listaProveedores[2] = new Proveedor("almacen genaro");
        listaProveedores[3] = new Proveedor("tienda de la esquina");  
        listaProveedores[4] = new Proveedor("pimientos");
    }
    
    public static boolean validarProducto(String nombre) {
        
        int x;
        for (x = 0;x < listaProductos.size() && listaProductos.get(x).getNombre().compareTo(nombre) != 0; x++) {}
        if (x == listaProductos.size()) {
            prodEnMem = null;
            return false;
        }
        // guardar sus proveedores
        provEnMem = new ArrayList();
        for (int y = 0;y < listaProductos.get(x).getProvee().size(); y++) {
            provEnMem.add(listaProductos.get(x).getProvee().get(y).getNombre());
        }
        
        prodEnMem = listaProductos.get(x);
        return true;
    }
    
    public static boolean validarStock(int ud) {
        cantEnMem = ud;
        if (prodEnMem == null)
            return true;
        
        int stc = prodEnMem.getUdDisponible();
        int x = stc - ud;
        if (x <= 0)
            return false;
        else {
            prodEnMem.setUdDisponible(x);
            return true;
        }
    }
    
    public static String calcularImporte(float precio) {
        
        return String.valueOf(precio * cantEnMem);
    }
    
    public static javax.swing.JComboBox listar(javax.swing.JComboBox lista) {
        for (int x = 0;x < provEnMem.size(); x++) {
            lista.insertItemAt(provEnMem.get(x), x);
        }
        return lista;
    }
    
    public static void comprar() {
        vc = new VentanaCompra(vp,true);
        vc.setVisible(true);
    }
    
    //public static String calcularPrecio()
    
    public static void vender() {
        vv = new VentanaVenta(vp,true);
        vv.setVisible(true);
    }
    
    public static void salir() {
        vp.dispose();
    }
}
