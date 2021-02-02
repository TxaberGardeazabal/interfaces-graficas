
package practicavista4;

/**
 *
 * @author txaber
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto;
import Vista.*;
public class PracticaVista4 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Producto> listaProductos;
    public static VistaGeneral ven1;
    public static VistaCompras ven2;
    public static VistaVentas ven3;
    public static Producto mem;
    
    public static void main(String[] args) {
        try {
            
            declararProductos();
            mostrarVentanaGeneral();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "preoblemas: "+e.getClass());
        }
    }
    
    public static void declararProductos() throws Exception {
        
        listaProductos = new ArrayList();
        
        listaProductos.add(new Producto("zanahoria",3.8f,6));
        listaProductos.add(new Producto("patata",2.8f,34));
        listaProductos.add(new Producto("puerro",5f,15));
        listaProductos.add(new Producto("cebolla",4.89f,0));
        listaProductos.add(new Producto("pimientos en lata",6.2f,9));
        listaProductos.add(new Producto("setas",3.4f,12));
        listaProductos.add(new Producto("lentejas kilo",12f,17));
    }
    
    public static boolean validarProducto(String nombre) {
        mem = null;
        // producto existe?
        int x;
        for (x = 0;x < listaProductos.size() && listaProductos.get(x).getNombre().compareTo(nombre) != 0;x ++) {}
        if (x == listaProductos.size()) {
            //no se encontro el producto
            return false;
        }
        // si no
        mem = listaProductos.get(x);
        return true;
    }
    
    public static void comprar(Integer unidades, Float precio) {
        // pillo el objeto de la variable memoria y le cambio valor
        
        mem.setStock(mem.getStock() + unidades);
        mem.setPrecio((mem.getPrecio() + precio) / 2);
    }
    
    public static void vender() {
        mem.setStock(mem.getStock() - 1);
    }
    
    public static Float pasarPrecio() {
        return mem.getPrecio();
    }
    
    public static void mostrarVentanaGeneral() {
        ven1 = new VistaGeneral();
        ven1.setVisible(true);
    }
    
    public static void mostrarVentanaCompras() {
        ven1.dispose();
        ven2 = new VistaCompras();
        ven2.setVisible(true);
    }
    
    public static void mostrarVentanaVentas() {
        ven1.dispose();
        ven3 = new VistaVentas();
        ven3.setVisible(true);
    }
    
    public static void cancelarOperacion(int a) {
        if (a == 0)
            ven2.dispose();
        else
            ven3.dispose();
        
        mostrarVentanaGeneral();
    }
    
    public static void salir() {
        ven1.dispose();
    }
}
