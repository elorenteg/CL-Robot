package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class piloto {
    private static TouchSensor touchSen2;
    private static UltrasonicSensor ultraSen;
    private static TouchSensor touchSen1;
    private static NXTRegulatedMotor der;
    private static int relacion;
    private static int colorToFollow;
    private static int radio;
    private static int sep;
    private static int limiteUS;
    private static ColorSensor coloSen;
    private static NXTRegulatedMotor izq;
    private static int eje;



    public static boolean girar(int dire, int grados, boolean check) {
        if((dire >= 0)) {
            izq.rotate(((relacion * 2) * grados),true);
            while((izq.isMoving() && ((check && checkSensors()) || !check))) {
                Delay.msDelay(100);
            }
        } else {
            der.rotate(((relacion * 2) * grados),true);
            while((der.isMoving() && ((check && checkSensors()) || !check))) {
                Delay.msDelay(100);
            }
        }
        boolean checkeo = ((check && checkSensors()) || !check);
        if(!checkeo) {
            stopMov();
        }

        return checkeo;
    }

    public static void setSensors(TouchSensor t1, TouchSensor t2, ColorSensor c, UltrasonicSensor u) {
        setTouchs(t1, t2);
        setColorSen(c);
        setUltra(u);
    }

    public static boolean girarInSitu(int dire, int grados, boolean check) {
        if((dire < 0)) {
            grados = (-1 * grados);
        }

        izq.rotate((relacion * grados),true);
        der.rotate(-(relacion * grados),true);
        return checkMotorSensor(check);
    }

    public static boolean barrido2(int maxAngle, boolean check) {
        System.out.println("entro barrido");
        int mult = 0;
        int grad = 5;
        int vel = izq.getSpeed();
        boolean ret = false;
        int a = coloSen.getColorID();
        while((((a != colorToFollow) && ((check && checkSensors()) || !check)) && ((grad * mult) < (maxAngle * relacion)))) {
            der.rotate(-grad,false);
            a = coloSen.getColorID();
            mult = (mult + 1);
        }
        if((a == colorToFollow)) {
            ret = true;
            mult = 0;
            while(((a == colorToFollow) && ((check && checkSensors()) || !check))) {
                der.rotate(-grad,false);
                a = coloSen.getColorID();
                mult = (mult + 1);
            }
            if((a != colorToFollow)) {
                der.rotate(((grad * mult) / 2),false);
            } else {
                ret = false;
            }
        } else {
            der.rotate((mult * grad),false);
            mult = 0;
            a = coloSen.getColorID();
            while((((a != colorToFollow) && ((check && checkSensors()) || !check)) && ((mult * grad) < (maxAngle * relacion)))) {
                izq.rotate(-grad,false);
                a = coloSen.getColorID();
                mult = (mult + 1);
            }
            if((a == colorToFollow)) {
                ret = true;
                mult = 0;
                while(((a == colorToFollow) && ((check && checkSensors()) || !check))) {
                    izq.rotate(-grad,false);
                    a = coloSen.getColorID();
                    mult = (mult + 1);
                }
                if((a != colorToFollow)) {
                    izq.rotate(((grad * mult) / 2),false);
                } else {
                    ret = false;
                }
            } else {
                izq.rotate((grad * mult),false);
            }
        }
        System.out.println("salgo barrido");
        return ret;
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
        if((((ultraSen.getDistance() > limiteUS) && !touchSen1.isPressed()) && !touchSen2.isPressed())) {
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
        limiteUS = -1;
        ultraSen = new UltrasonicSensor(SensorPort.S4);
        coloSen = new ColorSensor(SensorPort.S4);
        touchSen1 = new TouchSensor(SensorPort.S4);
        touchSen2 = new TouchSensor(SensorPort.S4);
        colorToFollow = -1;
    }

    public static void setTouch1(TouchSensor t) {
        touchSen1 = t;
    }

    public static void setTouchs(TouchSensor t1, TouchSensor t2) {
        setTouch1(t1);
        setTouch2(t2);
    }

    public static void moverNoLimit(int dire) {
        if((dire < 0)) {
            izq.backward();
            der.backward();
        } else {
            izq.forward();
            der.forward();
        }
    }

    public static void setColorToFollow(int col) {
        colorToFollow = col;
    }

    public static boolean barrido(int maxAngle, boolean check) {
        System.out.println("entro barrido");
        int vel = izq.getSpeed();
        boolean ret = false;
        izq.setSpeed(25);
        der.setSpeed(25);
        der.rotate(-(maxAngle * relacion),true);
        Delay.msDelay(25);
        int a = coloSen.getColorID();
        while((((a != colorToFollow) && der.isMoving()) && ((check && checkSensors()) || !check))) {
            Delay.msDelay(25);
            a = coloSen.getColorID();
        }
        stopMov();
        izq.setSpeed(vel);
        der.setSpeed(vel);
        if((a == colorToFollow)) {
            ret = true;
        } else {
            der.rotate((maxAngle * relacion),false);
            izq.setSpeed(25);
            der.setSpeed(25);
            izq.rotate(-(maxAngle * relacion),true);
            Delay.msDelay(25);
            a = coloSen.getColorID();
            while((((a != colorToFollow) && izq.isMoving()) && ((check && checkSensors()) || !check))) {
                Delay.msDelay(25);
                a = coloSen.getColorID();
            }
            stopMov();
            izq.setSpeed(vel);
            der.setSpeed(vel);
            if((a == colorToFollow)) {
                ret = true;
            } else {
                izq.rotate((maxAngle * relacion),false);
            }
        }
        System.out.println("salgo barrido");
        return ret;
    }

    public static void stopMov() {
        izq.stop();
        der.stop();
    }

    public static void setUltra(UltrasonicSensor u) {
        ultraSen = u;
    }

    public static boolean checkMotorSensor(boolean check) {
        while(((der.isMoving() && izq.isMoving()) && ((check && checkSensors()) || !check))) {
            Delay.msDelay(100);
        }
        boolean checkeo = ((check && checkSensors()) || !check);
        if(!checkeo) {
            stopMov();
        }

        return checkeo;
    }

    public static boolean followColor(boolean check) {
        boolean ret = true;
        if((colorToFollow != -1)) {
            while((((check && checkSensors()) || !check) && ret)) {
                System.out.println("ando");
                moverNoLimit(1);
                int a = coloSen.getColorID();
                while(((a == colorToFollow) && ((check && checkSensors()) || !check))) {
                    Delay.msDelay(25);
                    a = coloSen.getColorID();
                }
                stopMov();
                if((a != colorToFollow)) {
                    ret = barrido2(320, check);
                }

                System.out.println("antes vuelta");
            }
            if(!ret) {
                System.out.println("Could not find path again");
            } else {
                System.out.println("stuck by sensors");
                ret = false;
            }
        } else {
            System.out.println("Color to Follow not defined");
            ret = false;
        }
        return ret;
    }

    public static void setColorSen(ColorSensor c) {
        coloSen = c;
    }
}