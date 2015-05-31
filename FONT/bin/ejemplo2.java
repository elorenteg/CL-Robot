import basic.sonar;
import lejos.nxt.*;
import lejos.util.Delay;

public class ejemplo2 {
    public static void main(String args[]) {
        NXTRegulatedMotor M1 = Motor.A;
        NXTRegulatedMotor M2 = Motor.B;
        NXTRegulatedMotor MU = Motor.C;
        UltrasonicSensor U = new UltrasonicSensor(SensorPort.S4);
        sonar s = new sonar();
        s.init(M1, M2, MU, U);
        s.sigueObjeto(10);
    }
}