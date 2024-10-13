package EJ10_Observer;

//Interfaz para los reporteros
//Update es el método que se va a llamar cuando el clima cambie
public interface Observer {
    public void update(String clima);
}
