package EJ1;

public class Hilos extends Thread {
    private final int nroHilo;
    public Hilos(int nroHilo){
        //Llama al constructor de Thread
        super();
        this.nroHilo = nroHilo;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(this.nroHilo*1000);
            System.out.println("Hola mundo desde el hilo "+this.nroHilo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
