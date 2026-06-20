import java.util.ArrayList;

public class Producto {
    private int Id;
    private String Nombre;
    private double Precio;
    
    ArrayList<Producto> carrito = new ArrayList<>();

    public Producto (int Id, String Nombre, double Precio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public int getId(){
        return Id;
    }

    public String getNombre(){
        return Nombre;
    }

    public double getPrecio(){
        return Precio;
    }

    public static void addObjetos (ArrayList<Producto> carrito, Producto Objeto){
        if (!carrito.contains(Objeto)) {
            carrito.add(Objeto);
            System.out.println(Objeto.Nombre);
        } else {
            System.out.println(Objeto.Id + " ya existe");
        }
    }
    public static void removeObjetos (ArrayList<Producto> carrito, Producto Objeto){
                       if (carrito.remove(Objeto)){
                        System.out.println(Objeto.Nombre+" eliminado");
        }else{
            System.out.println("Producto no existe");
        }
    }
 
    
    public static void mostrarCarrito (ArrayList<Producto> carrito){
        for (int i = 0; i< carrito.size(); i++) {
            Producto Objeto = carrito.get(i);
            System.out.println( "Id: "+Objeto.Id+" Nombre: "+Objeto.Nombre+" Precio: "+Objeto.Precio);
        }
    }

    public boolean equals(Object obj1) {
        if (obj1 instanceof Producto) {
        Producto Diferente = (Producto) obj1;
        return this.Id == Diferente.Id;
    }
    return false; 
}
    
    

    }


