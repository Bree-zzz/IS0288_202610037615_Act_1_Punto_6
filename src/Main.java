import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> carrito = new ArrayList<>();

        Producto Objeto1 = new Producto (143,"Leche", 7.000);
        Producto Objeto2 = new Producto (234,"Huevos",18.000);
        Producto Objeto3 = new Producto (156,"Carne", 20.000);
        Producto Objeto4 = new Producto (143 ,"Jugo", 9.000);

        Producto.addObjetos(carrito, Objeto1);
        Producto.addObjetos(carrito, Objeto2);
        Producto.addObjetos(carrito, Objeto3);
        Producto.addObjetos(carrito, Objeto4);

        System.out.print("\nProductos en su carrito:\n");
        Producto.mostrarCarrito(carrito);
        System.out.print("\nEliminando objeto");
        //Producto.removeObjetos(carrito, Objeto2);
        System.out.print("\nProductos en su carrito:\n");
        Producto.mostrarCarrito(carrito);    
        


    }
}