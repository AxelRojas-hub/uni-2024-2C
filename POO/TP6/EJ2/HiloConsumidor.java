package EJ2;

public class HiloConsumidor implements Runnable {
    private final Compartido compartido;

    public HiloConsumidor(Compartido compartido){
        super();
        this.compartido = compartido;
    }
    @Override
    public void run(){
        this.compartido.incrementar();
    }
}
