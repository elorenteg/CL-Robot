public class Traduccion {

    public static void funcionInt(Integer a) {
        a = a + 2;
    }

    public static void funcion() {
        Integer a = 10;
        System.out.println("hola");
        Boolean b = true;
    }

    public static void main (String args[]) {
        funcion();
        Integer a = 1;
        funcionInt(a);
    }
}