import lejos.nxt.*;

public class Traduccion {

    public static Motor configura(boolean a, int b) {
        Motor m = Motor.A;
        m.setSpeed(5);
        m.setRadio(b);
        return m;
    }

    public static void funcion(Motor m, TouchSensor t) {
        m.rotate(1);
    }

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        TouchSensor ts = new TouchSensor(SensorPort.S1);
        funcion(m1, ts);
        int a = 12;
        int b = 20;
        m1 = configura((((3 + (5 * 8)) > 6) && (7 < 9)), b);
    }
}