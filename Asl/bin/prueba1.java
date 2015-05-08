import paquete.piloto;
import lejos.nxt.*;

public class prueba1 {

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
            piloto.girar(m1, m2, 90);
        }
    }
}