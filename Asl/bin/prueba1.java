import basic.piloto;
import lejos.nxt.*;
import lejos.util.Delay;

public class prueba1 {



    public static void main(String args[]) {
        NXTRegulatedMotor m1 = Motor.A;
        NXTRegulatedMotor m2 = Motor.B;
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        piloto p = new piloto();
        p.init(m1, m2, 9, 12, 2);
        boolean r = p.girar(1, 180, true);
        System.out.println(r);
        Button.waitForAnyPress();
        r = p.girarInSitu(1, 360, true);
        System.out.println(r);
        Button.waitForAnyPress();
        r = p.girarInSitu(-1, 360, false);
        System.out.println(r);
        Button.waitForAnyPress();
        r = p.mover(1, 10, true);
        System.out.println(r);
        Button.waitForAnyPress();
    }
}