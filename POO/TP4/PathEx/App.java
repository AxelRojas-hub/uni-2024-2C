package PathEx;

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingresa nombre del archivo o directorio:");

            Path path = Paths.get(input.nextLine());

            if (Files.exists(path)) {
                System.out.printf("%n%s existe%n", path.getFileName());
                System.out.printf("%s un directorio%n", Files.isDirectory(path) ? "Es" : "No es");
                System.out.printf("%s es una direccion absoluta%n", path.isAbsolute() ? "Es" : "No es");
                System.out.printf("Ultima modificacion: %s%n", Files.getLastModifiedTime(path));
                System.out.printf("Tamaño: %s%n", Files.size(path));
                System.out.printf("Dirección: %s%n", path);
                System.out.printf("Dirección absoluta: %s%n", path.toAbsolutePath());

                if (Files.isDirectory(path)) {
                    System.out.printf("%nContenido del directorio:%n");
                    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                        for (Path p : directoryStream) {
                            System.out.println(p.getFileName());
                        }
                    } catch (IOException | DirectoryIteratorException ex) {
                        System.err.println("Error leyendo el contenido del directorio: " + ex.getMessage());
                    }
                }
            } else {
                System.out.printf("%s no existe%n", path);
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}