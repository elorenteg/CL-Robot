import lejos.nxt.*;

public class Traduccion {

    public static void funcion(Motor m, TouchSensor t) {
        m.rotate(1);
    }

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        TouchSensor ts = new TouchSensor(SensorPort.S1);
        funcion(m1, ts);
    }
}