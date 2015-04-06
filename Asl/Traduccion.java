import lejos.nxt.*;

public class Traduccion {

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        m1.setSpeed(10);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        while(us.getDistance() > 4) {
            m1.rotate(1);
        }
        m1.stop();
        TouchSensor ts = new TouchSensor(SensorPort.S2);
        if(ts.isPressed()) {
            m1.rotate(10);
        }

        sleep(100);
    }
}