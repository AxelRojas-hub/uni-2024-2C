package EJ1;
//Programa que escriba un hola mundo por cada hilo que se cree (6)

import java.util.ArrayList;
import java.util.List;


// Indicar desde que hilo se imprime cada hola mundo
// Que cada uno espere un tiempo proporciona a su identificador antes de imprimir el mensaje(el thread 1, un segundo; el thread 2, dos segundos, etc)

public class App {
    public static void main(String[] args) {
        List<Hilos> hilos = new ArrayList<>();
        for(int i = 1; i<=6; i++){
            hilos.add(new Hilos(i));
        }
        for(Hilos hilo : hilos){
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
