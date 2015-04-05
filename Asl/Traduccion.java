public class Traduccion {

    public static void funcionInt(int a) {
        a = a + 2;
    }

    public static void funcion() {
        int a = 10;
        System.out.println("hola");
        boolean b = true;
    }

    public static void main(String args[]) {
        funcion();
        int a = 1;
        funcionInt(a);
    }
}