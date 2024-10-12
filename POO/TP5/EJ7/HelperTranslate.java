package EJ7;

public class HelperTranslate {
    public String traducir(String palabra) {
        switch (palabra) {
            case "hola":
                return "hello";
            case "chau":
                return "goodbye";
            case "patron":
                return "pattern";
            case "diseño":
                return "design";
            case "programa":
                return "program";
            default:
                return "No se encontro traduccion";
        }
    }
}
