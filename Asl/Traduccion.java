import lejos.nxt.*;

public class Traduccion {

    public static void girar(NXTRegulatedMotor m1, NXTRegulatedMotor m2, int grado) {
        m1.rotate(540,(4 < 5));
        m2.rotate(-(520 + 20),(5 < 3));
    }

    public static void main(String args[]) {
        NXTRegulatedMotor m1 = Motor.A;
        NXTRegulatedMotor m2 = Motor.B;
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        m1.setSpeed(720);
        m2.setSpeed(720);
        while(true) {
            m1.forward();
            m2.forward();
            while((us.getDistance() > 20)) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {};
            }
            m1.stop();
            m2.stop();
            girar(m1, m2, 90);
        }
    }
}