import basic.piloto;
import lejos.nxt.*;
import lejos.util.Delay;

public class prueba1 {



    public static void main(String args[]) {
        NXTRegulatedMotor m1 = Motor.A;
        NXTRegulatedMotor m2 = Motor.B;
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        m1.setSpeed(180);
        m2.setSpeed(180);
        piloto p = new piloto();
        p.init(m1, m2, 9, 12, 2);
        p.setColorSen(new ColorSensor(SensorPort.S1));
        p.setColorToFollow(7);
        boolean r = p.followColor(true);
        Button.waitForAnyPress();
    }
}