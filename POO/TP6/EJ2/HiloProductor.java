package EJ2;

public class HiloProductor extends Thread {
    public Compartido compartido;
    public HiloProductor(Compartido compartido){
        super();
        this.compartido = compartido;
    }
    @Override
    public void run(){
        while (compartido.getContador() < 5000) {
            compartido.incrementar();
            if(compartido.getContador() % 100 == 0){
                System.out.println("Hilo "+this.getName()+" contador: "+compartido.getContador());
            }
        }
    }
}
