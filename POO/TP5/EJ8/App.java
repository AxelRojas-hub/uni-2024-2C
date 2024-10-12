package EJ8;

// Como parte de un sistema de administración de archivos debe implementar,usando el patrón Composite,las clases necesarias para organizar carpetas y archivos.
// Todo elemento posee un nombre y un método que indica si es carpeta o no.En el caso de las carpetas cuentan con un listado de elementos que contienen.
// El objetivo final será crear una serie de elementos y su contenido para luego imprimir el nombre de cada uno.

// Ejemplo de salida:
// ●Carpeta 1
//     ○Carpeta 2 
//         ■Archivo 1
//         ■Archivo 2
//     ○Archivo 3
// ●Carpeta 
//     ○Archivo 4

public class App {
    public static void main(String[] args) throws Exception {
        ArchivoHoja archivo1 = new ArchivoHoja("Archivo 1");
        ArchivoHoja archivo2 = new ArchivoHoja("Archivo 2");
        ArchivoHoja archivo3 = new ArchivoHoja("Archivo 3");
        ArchivoHoja archivo4 = new ArchivoHoja("Archivo 4");

        Carpeta carpeta1 = new Carpeta("Carpeta 1");
        Carpeta carpeta2 = new Carpeta("Carpeta 2");
        Carpeta carpeta3 = new Carpeta("Carpeta 3");

        carpeta1.agregarSubArchivo(carpeta2);
        carpeta2.agregarSubArchivo(archivo1);
        carpeta2.agregarSubArchivo(archivo2);
        carpeta1.agregarSubArchivo(archivo3);
        carpeta1.agregarSubArchivo(carpeta3);
        carpeta3.agregarSubArchivo(archivo4);

        carpeta1.imprimir();
    }
}
