import paquete.piloto;
import paquete.sensor;
import lejos.nxt.*;

public class objeto {
    private piloto pil;
    private int a;



    public static void girar(int a, NXTRegulatedMotor m1, piloto pi) {
        int b = a;
    }

    public static piloto ejemplo() {
        piloto o = new piloto();
        return o;
    }

    public static NXTRegulatedMotor ejemplo2() {
        NXTRegulatedMotor m1 = Motor.C;
        return m1;
    }

    public static void ja() {
        a = 2;
    }

    public static void main(String args[]) {
        piloto o = new piloto();
        o = ejemplo();
        o = new piloto();
        sensor b = new sensor();
        int numero = 5;
        NXTRegulatedMotor m1 = Motor.A;
        m1 = Motor.B;
        m1 = ejemplo2();
        NXTRegulatedMotor m2 = Motor.B;
        NXTRegulatedMotor m3 = ejemplo2();
        o.girar(m1, m2, 45);
        o.sensor();
        b.girar(m2, m1, 20);
        girar(10, m1, o);
    }
}