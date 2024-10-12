package EJ6;

// Aplique el patrón Factory Method para la creación de juegos físicos y digitales.Los juegos comparten un id y un importe.También el método abstracto getPrecio,que se encarga de calcular el precio de uno u otro.Para ello los juegos físicos tienen un atributo que es el precio de traslado(a caso de ejemplo elija usted).Y los juegos digitales el precio depende de la plataforma en la cual se compra teniendo como atributo el precio de la plataforma.Estos valores deben ser float y multiplicarlos al importe.

public class App {
    public static void main(String[] args) {
        Juego juego1 = new Fisico(1, 100.0, 10.0f);
        Juego juego2 = new Digitales(2, 100.0, 1.5f);
        System.out.println(juego1.getPrecio());
        System.out.println(juego2.getPrecio());
    }
}
