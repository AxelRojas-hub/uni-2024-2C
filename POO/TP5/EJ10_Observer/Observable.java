package EJ10_Observer;

//Para el sistema que notifica a los reporteros
public interface Observable {
    public void addObserver(Reportero reportero);

    public void removeObserver(Reportero reportero);

    public void notifyObservers();
}
