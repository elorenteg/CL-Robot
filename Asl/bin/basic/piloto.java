package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class piloto {
    private static TouchSensor touchSen2;
    private static UltrasonicSensor ultraSen;
    private static TouchSensor touchSen1;
    private static NXTRegulatedMotor der;
    private static int relacion;
    private static int radio;
    private static int sep;
    private static int limiteUS;
    private static ColorSensor coloSen;
    private static NXTRegulatedMotor izq;
    private static int eje;



    public static boolean girar(int dire, int grados, boolean check) {
        if((dire >= 0)) {
            izq.rotate(((relacion * 2) * grados));
        } else {
            der.rotate(((relacion * 2) * grados));
        }
        return checkMotorSensor(check);
    }

    public static void setSensors(TouchSensor t1, TouchSensor t2, ColorSensor c, UltrasonicSensor u) {
        setTouchs(t1, t2);
        setColor(c);
        setUltra(u);
    }

    public static boolean girarInSitu(int dire, int grados, boolean check) {
        if((dire >= 0)) {
            izq.rotate((relacion * grados),true);
            der.rotate(-(relacion * grados),true);
        } else {
            der.rotate((relacion * grados),true);
            izq.rotate(-(relacion * grados),true);
        }
        return checkMotorSensor(check);
    }

    public static void setLimitUS(int lim) {
        limiteUS = lim;
    }

    public static boolean mover(int dire, int grados, boolean check) {
        if((dire < 0)) {
            grados = (-1 * grados);
        }

        izq.rotate(grados,true);
        der.rotate(grados,true);
        return checkMotorSensor(check);
    }

    public static boolean checkSensors() {
        boolean ret = false;
        if((((ultraSen.getDistance() < limiteUS) && !touchSen1.isPressed()) && !touchSen2.isPressed())) {
            ret = true;
        }

        return ret;
    }

    public static void setTouch2(TouchSensor t) {
        touchSen2 = t;
    }

    public static void init(NXTRegulatedMotor mizq, NXTRegulatedMotor mder, int s, int e, int r) {
        izq = mizq;
        der = mder;
        radio = r;
        sep = s;
        eje = e;
        relacion = (eje / radio);
        limiteUS = 1000;
        ultraSen = new UltrasonicSensor(SensorPort.S1);
        coloSen = new ColorSensor(SensorPort.S1);
        touchSen1 = new TouchSensor(SensorPort.S1);
        touchSen2 = new TouchSensor(SensorPort.S1);
    }

    public static void setTouch1(TouchSensor t) {
        touchSen1 = t;
    }

    public static void setTouchs(TouchSensor t1, TouchSensor t2) {
        setTouch1(t1);
        setTouch2(t2);
    }

    public static void setColor(ColorSensor c) {
        coloSen = c;
    }

    public static void setUltra(UltrasonicSensor u) {
        ultraSen = u;
    }

    public static boolean checkMotorSensor(boolean check) {
        while(((der.isMoving() && izq.isMoving()) && ((check && checkSensors()) || !check))) {
            Delay.msDelay(500);
        }
        return ((check && checkSensors()) || !check);
    }
}