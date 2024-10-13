package EJ9_Decorator;

// Es necesario crear dos decorators,uno para cuando el sistema usa moneda estadounidense($USD)y otro para cuando el sistema usa moneda argentina($ARS).
// Cada decorator debe implementar getLineDescription de forma de que se devuelva el símbolo de la moneda antes del valor.Eje:$ARS 90000,50 o $USD 90000,50 
public class DecoradorARS implements Moneda {
    protected Producto producto;

    public DecoradorARS(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getLineDescription() {
        return "$ARS " + producto.getPrecio();
    }
}
