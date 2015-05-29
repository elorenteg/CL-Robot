import basic.sonar;
import lejos.nxt.*;
import lejos.util.Delay;

public class ejemplo1 {
    public static void main(String args[]) {
        NXTRegulatedMotor m1 = Motor.A;
        NXTRegulatedMotor m2 = Motor.B;
        m1.setSpeed(720);
        m2.setSpeed(720);
        sonar s = new sonar();
        s.init();
        UltrasonicSensor u = s.getUltra();
        NXTRegulatedMotor mu = s.getMotor();
        int desf = 0;
        mu.rotate(10,false);
        desf = (desf + 10);
        while(true) {
            int g = s.grados(0, true);
            m1.rotate(g,true);
            m2.rotate(-g,false);
            desf = (desf + 10);
            m1.rotate(20,true);
            m2.rotate(20,false);
        }
    }
}