import lejos.nxt.*;

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
        Motor.A.setSpeed(2);
        Motor.A.setSpeed(2.1);
        Motor.A.setRadio(2);
        Motor.A.setRadio(2.1);
        Motor.A.avanzar(1);
        Motor.A.avanzar(1.2);
        Motor.A.avanzar();
        Motor.A.parar();
        Motor.A.acelerar(1);
        Motor.A.acelerar(1.2);
    }
}