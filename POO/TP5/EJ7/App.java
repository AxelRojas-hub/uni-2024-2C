package EJ7;
// Cree una clase Helper con un método que permita traducir una palabra de español a inglés.

// Establezca traducciones para al menos 5 palabras.
// Cree una clase Helper dos métodos:uno que convierta una cadena a mayúsculas y otro que convierta a minúsculas.
// Luego,implemente un patrón Facade para permitir el acceso a estos tres métodos desde una nueva clase.
// Para probar la solución,elija tres palabras e imprima para cada una
//  ●Su traducción a inglés 
//  ●Su versión con solo mayúsculas
//  ●Su versión con solo minúsculas

public class App {
    // Palabras con traduccion disponible: hola, chau, patron, diseño, programa
    public static void main(String[] args) {
        HelperFacade helperFacade = new HelperFacade();

        helperFacade.traducir("hola");
        helperFacade.mayuscula("hola");
        helperFacade.minuscula("HOLA");
    }
}
