package EJ2;

public class Compartido {
    private int contador = 0;

    public synchronized void incrementar() {
        if(contador < 5000){
            contador++;
        }
    }

    public int getContador() {
        return contador;
    }
}
