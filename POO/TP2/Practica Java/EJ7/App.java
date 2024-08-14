package EJ7;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Axel", "Rojas", "1999-02-11");
        Persona persona2 = new Persona("Susana", "Morales", "1968-10-18");
        Persona persona3 = new Persona("Guadalupe", "Rojas", "2015-02-13");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
