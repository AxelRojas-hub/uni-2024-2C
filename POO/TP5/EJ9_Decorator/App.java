package EJ9_Decorator;

// Patrón decorator.
// Dada una clase Producto con un método public String getPrecio()que el precio del mismo como String y con dos decimales.Eje:90000,50
// Es necesario crear dos decorators,uno para cuando el sistema usa moneda estadounidense($USD)y otro para cuando el sistema usa moneda argentina($ARS).
// Cada decorator debe implementar getLineDescription de forma de que se devuelva el símbolo de la moneda antes del valor.Eje:$ARS 90000,50 o $USD 90000,50 
// Pruebe la implementación con un producto,imprimiendo:
//  ●Lo que retorna el método getPrecio()
//  ●Lo que retorna el método getPrecio()para el primer decorator.
//  ●Lo que retorna el método getPrecio()para el segundo decorator.
public class App {
    public static void main(String[] args) {
        Producto producto = new Producto(90000.50);
        System.out.println(producto.getPrecio());
        System.out.println(new DecoradorARS(producto).getLineDescription());
        System.out.println(new DecoradorUSD(producto).getLineDescription());
    }
}
