package EJ6_FactoryMethod;

// los juegos digitales el precio depende de la plataforma en la cual se compra teniendo como atributo el precio de la plataforma.Estos valores deben ser float y multiplicarlos al importe.
public class Digitales extends Juego {
    public Float precioPlataforma;

    public Digitales(Integer ID, Double importe, Float precioPlataforma) {
        this.ID = ID;
        this.importe = importe;
        this.precioPlataforma = precioPlataforma;
    }

    public Double getPrecio() {
        return importe * precioPlataforma;
    }
}
