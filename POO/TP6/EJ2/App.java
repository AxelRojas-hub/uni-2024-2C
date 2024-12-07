package EJ2;

// Programa que lance 4 threads, cada uno incrementa una variable contador de tipo entero, compartida por todos, 5000 veces y luego imprima

import java.util.ArrayList;
import java.util.List;

// Que diferencia hay entre trabajar con Runnable o Threads?
public class App {
    public static void main(String[] args) throws Exception{
        List<HiloProductor> hilosProductores = new ArrayList<>();
        Compartido compartido = new Compartido();
        HiloConsumidor consumidor = new HiloConsumidor(compartido);
        Thread hiloConsumidor = new Thread(consumidor);
        hiloConsumidor.start();

        for (int i = 1; i < 5; i++) {
            HiloProductor h = new HiloProductor(compartido);
            hilosProductores.add(h);
            h.start();
        }

        for(HiloProductor hiloProductor:hilosProductores){
            hiloProductor.join();
        }
        hiloConsumidor.join();
        System.out.println("fin del Main");
    }
}
