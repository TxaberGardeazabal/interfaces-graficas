/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavista5;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import interfaz.*;
/**
 *
 * @author txaber
 */
public class PracticaVista5 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Producto> listaProductos;
    public static Proveedor[] listaProveedores;
    
    public static VentanaPrincipal vp;
    public static Producto mem;
    
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
        listaProductos.add(new Producto("zanahoria",6,3.8f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[1]);
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("patata",34,2.8f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[0]);
        ad.add(listaProveedores[1]);
        listaProductos.add(new Producto("puerro",15,5f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[2]);
        listaProductos.add(new Producto("cebolla",0,4.89f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("pimientos en lata",9,6.2f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[3]);
        ad.add(listaProveedores[4]);
        listaProductos.add(new Producto("setas",12,3.4f));
        
        ad = new ArrayList();
        ad.add(listaProveedores[0]);
        listaProductos.add(new Producto("lentejas kilo",17,12f));
    }
    
    public static void generarProveedores() throws Exception{
        listaProveedores = new Proveedor[5];
        
        listaProveedores[0] = new Proveedor("manolo verduras"); 
        listaProveedores[1] = new Proveedor("de la tierra");
        listaProveedores[2] = new Proveedor("almacen genaro");
        listaProveedores[3] = new Proveedor("tienda de la esquina");  
        listaProveedores[4] = new Proveedor("pimientos");
    }
    
    public static boolean validarProducto(String nombre) {
        mem = null;
        int x;
        for (x = 0;x < listaProductos.size() && listaProductos.get(x).getNombre().compareTo(nombre) != 0; x++) {}
        
        if (x == listaProductos.size())
            return false;
        
        mem = listaProductos.get(x);
        return true;
    }
    
    public static boolean validarStock(int cant) {
        // usa la variable mem para comprobar
        if (mem == null)
            return true;
        
        int stc = mem.getUdDisponible();
        int x = stc - cant;
        if (x <= 0)
            return false;
        else {
            mem.setUdDisponible(x);
            return true;
        }
    }
    
    public static ArrayList pedirLista(String nombre) {
        String ret = "";
        
    }
    
    public static void salir() {
        vp.dispose();
    }
}
