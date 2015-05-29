package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class sonar {
    private static UltrasonicSensor U;
    private static NXTRegulatedMotor M;

    public static void girar(int g) {
        M.rotate(g,true);
        M.rotate(-g,false);
    }

    public static int grados(int desf) {
        girar((-desf - 75));
        int grad = 0;
        int dist = 0;
        int i = -75;
        while((i <= 75)) {
            if((U.getDistance() > dist)) {
                dist = U.getDistance();
                grad = i;
            }

            girar(10);
            i = (i + 10);
        }
        girar((desf - 75));
        return grad;
    }

    public static UltrasonicSensor getUltra() {
        UltrasonicSensor u = U;
        return u;
    }

    public static NXTRegulatedMotor getMotor() {
        NXTRegulatedMotor m = M;
        return m;
    }

    public static void init() {
        U = new UltrasonicSensor(SensorPort.S1);
        M = Motor.C;
        M.setSpeed(720);
    }

    public static int gradosObj(int desf) {
        girar((-desf - 10));
        int grad = 0;
        int dist = 255;
        int i = -10;
        while((i <= 10)) {
            if((U.getDistance() < dist)) {
                dist = U.getDistance();
                grad = i;
            }

            girar(10);
            i = (i + 10);
        }
        girar((desf - 10));
        return grad;
    }
}