package EJ8_Composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo {
    private final String nombre;
    private final List<Archivo> archivos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.archivos = new ArrayList<>();
    }

    public void agregarSubArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    public void removeSubArchivo(Archivo archivo) {
        archivos.remove(archivo);
    }

    @Override
    public void imprimir() {
        System.out.println("+" + nombre); // Carpeta
        // For en todos los archivos de la carpeta
        for (Archivo archivo : archivos) {
            archivo.imprimir();
        }
    }
}
