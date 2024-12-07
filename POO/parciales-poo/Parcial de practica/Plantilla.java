import java.util.ArrayList;

public class Plantilla {
    private String usuario;
    private String equipoFav;
    private String paisFav;
    @SuppressWarnings("unused")
    private Integer quimicaEquipo;
    private ArrayList<Jugador> jugadores;

    public Plantilla(String usuario, String equipoFav, String paisFav) {
        this.usuario = usuario;
        this.equipoFav = equipoFav;
        this.paisFav = paisFav;
        this.jugadores = new ArrayList<>();
    }

    public void imprimirPlantel() {
        System.out.println(this.usuario);
        System.out.println("Quimica del equipo: " + this.getQuimicaEquipo());
        System.out.println("Equipo favorito: " + this.equipoFav);
        System.out.println("Pais favorito: " + this.paisFav);
        System.out.println();
        for (Jugador jugador : this.jugadores) {
            System.out.println(jugador.toString());
            System.out.println("---------------------------------------");
        }
    }

    private Integer getQuimicaEquipo() {
        Integer quimica = 0;
        for (Jugador jugador : this.jugadores) {
            quimica += jugador.getQuimica();
        }
        return (int) (quimica / this.jugadores.size());
    }

    public void addJugador(Jugador jugador) {
        jugador.calcularQuimica(equipoFav, paisFav);
        this.jugadores.add(jugador);
    }

    // GETTERS Y SETTERS
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEquipoFav() {
        return this.equipoFav;
    }

    public void setEquipoFav(String equipoFav) {
        this.equipoFav = equipoFav;
    }

    public String getPaisFav() {
        return this.paisFav;
    }

    public void setPaisFav(String paisFav) {
        this.paisFav = paisFav;
    }

}
