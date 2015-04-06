import lejos.nxt.*;

public class Traduccion {

    public static Motor configura(int a, int b) {
        Motor m = Motor.A;
        m.setSpeed(a);
        m.setRadio(b);
        return m;
    }

    public static  funcion(Motor m, TouchSensor t) {
        m.rotate(1);
    }

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        TouchSensor ts = new TouchSensor(SensorPort.S1);
        funcion(m1, ts);
        int a = 12;
        int b = 20;
        m1 = configura(a, b);
    }
}