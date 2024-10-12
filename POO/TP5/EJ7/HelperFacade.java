package EJ7;

public class HelperFacade {
    private HelperTranslate helperTranslate;
    private HelperCaps helperCaps;

    public HelperFacade() {
        helperTranslate = new HelperTranslate();
        helperCaps = new HelperCaps();
    }

    public void traducir(String palabra) {
        System.out.println("Traduccion de " + palabra + ": " + helperTranslate.traducir(palabra));
    }

    public void mayuscula(String palabra) {
        System.out.println("Mayusculas de " + palabra + ": " + helperCaps.mayuscula(palabra));
    }

    public void minuscula(String palabra) {
        System.out.println("Minusculas de " + palabra + ": " + helperCaps.minuscula(palabra));
    }
}
