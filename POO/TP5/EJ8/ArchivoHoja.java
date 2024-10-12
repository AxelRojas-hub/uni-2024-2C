package EJ8;

public class ArchivoHoja implements Archivo {
    private String nombre;

    public ArchivoHoja(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimir() {
        System.out.println("\t-" + nombre);
    }
}