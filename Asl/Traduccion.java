import lejos.nxt.*;

public class Traduccion {

    public static Motor configura(boolean a, int b) {
        Motor m = Motor.A;
        m.forward();
        m.stop();
        m.rotate(15);
        m.backward();
        m.rotate(-10);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        ColorSensor cs = new ColorSensor(SensorPort.S2);
        TouchSensor ts = new TouchSensor(SensorPort.S3);
        System.out.println(us.getDistance());
        System.out.println(cs.getColorNumber());
        System.out.println(ts.isPressed());
        m.setSpeed(5);
        return m;
    }

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        Motor b = Motor.B;
        int c = 12;
        b.setSpeed((5 + c));
        int a = 12;
        try {
            Thread.sleep((20 + a));
        } catch (InterruptedException e) {};
        m1 = configura(((3 + (5 * 8)) > 6), c);
    }
}