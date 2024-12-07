package EJ6_FactoryMethod;

// Para ello los juegos físicos tienen un atributo que es el precio de traslado(a caso de ejemplo elija usted)

public class Fisico extends Juego {
    private Float precioTraslado;

    public Fisico(Integer ID, Double importe, Float precioTraslado) {
        this.ID = ID;
        this.importe = importe;
        this.precioTraslado = precioTraslado;
    }

    @Override
    protected Double getPrecio() {
        return importe + precioTraslado;
    }

}
