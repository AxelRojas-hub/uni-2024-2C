package EJ9_Decorator;

// Dada una clase Producto con un método public String getPrecio() que el precio del mismo como String y con dos decimales.Eje:90000,50
public class Producto {
    private Double precio;

    public Producto(Double precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return String.format("%.2f", precio);
    }
}
