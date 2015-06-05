package basic;
import lejos.nxt.*;
import lejos.util.Delay;

public class piloto {
    private static TouchSensor touchSen2;
    private static NXTRegulatedMotor der;
    private static TouchSensor touchSen1;
    private static int eje;
    private static int colorToF2;
    private static UltrasonicSensor ultraSen;
    private static int relacion;
    private static int colorToF1;
    private static int sep;
    private static int radio;
    private static int limiteUS;
    private static ColorSensor colorSen;
    private static NXTRegulatedMotor izq;

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

    public static boolean girarInSitu(int dire, int grados, boolean check) {
        if((dire < 0)) {
            grados = (-1 * grados);
        }

        izq.rotate((relacion * grados),true);
        der.rotate(-(relacion * grados),true);
        return checkMotorSensor(check);
    }

    public static void setSensors(TouchSensor t1, TouchSensor t2, ColorSensor c, UltrasonicSensor u) {
        setTouchs(t1, t2);
        setColorSen(c);
        setUltra(u);
    }

    public static boolean barrido2(int maxAngle, boolean check) {
        System.out.println("entro barrido");
        int mult = 0;
        int grad = 10;
        int vel = izq.getSpeed();
        boolean ret = false;
        int a = colorSen.getColorID();
        while((((a != colorToF1) && ((check && checkSensors()) || !check)) && ((grad * mult) < (maxAngle * relacion)))) {
            der.rotate(-grad,false);
            a = colorSen.getColorID();
            mult = (mult + 1);
        }
        if((a == colorToF1)) {
            ret = true;
            mult = 0;
            while(((a == colorToF1) && ((check && checkSensors()) || !check))) {
                der.rotate(-grad,false);
                a = colorSen.getColorID();
                mult = (mult + 1);
            }
            if((a != colorToF1)) {
                der.rotate(((grad * mult) / 2),false);
            } else {
                ret = false;
            }
        } else {
            der.rotate((mult * grad),false);
            mult = 0;
            a = colorSen.getColorID();
            while((((a != colorToF1) && ((check && checkSensors()) || !check)) && ((mult * grad) < (maxAngle * relacion)))) {
                izq.rotate(-grad,false);
                a = colorSen.getColorID();
                mult = (mult + 1);
            }
            if((a == colorToF1)) {
                ret = true;
                mult = 0;
                while(((a == colorToF1) && ((check && checkSensors()) || !check))) {
                    izq.rotate(-grad,false);
                    a = colorSen.getColorID();
                    mult = (mult + 1);
                }
                if((a != colorToF1)) {
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
        ColorSensor coloSen = new ColorSensor(SensorPort.S4);
        touchSen1 = new TouchSensor(SensorPort.S4);
        touchSen2 = new TouchSensor(SensorPort.S4);
        colorToF1 = -1;
        colorToF2 = -1;
    }

    public static void setTouch1(TouchSensor t) {
        touchSen1 = t;
    }

    public static void setTouchs(TouchSensor t1, TouchSensor t2) {
        setTouch1(t1);
        setTouch2(t2);
    }

    public static int getVelo() {
        int vel = izq.getSpeed();
        return vel;
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

    public static void setVelo(int vel) {
        izq.setSpeed(vel);
        der.setSpeed(vel);
    }

    public static void setColorToFollow(int col, int col2) {
        colorToF1 = col;
        colorToF2 = col2;
    }

    public static boolean followBiColor(boolean check) {
        boolean ret = true;
        if(((colorToF1 != -1) && (colorToF1 != colorToF2))) {
            while(ret) {
                int estadoAct = colorSen.getColorID();
                int estadoAnt = -1;
                boolean movi = ((check && checkSensors()) || !check);
                int i = 0;
                while(((movi && ((estadoAct == colorToF1) || (estadoAct == colorToF2))) && ret)) {
                    movi = mover(1, 10, check);
                    estadoAnt = estadoAct;
                    estadoAct = colorSen.getColorID();
                    printColor(estadoAct, estadoAnt);
                }
                if(movi) {
                    int cont = 0;
                    if((estadoAnt == colorToF2)) {
                        cont = 0;
                        while((((movi && (estadoAct != colorToF2)) && ret) && (cont < 50))) {
                            movi = girar(1, -3, check);
                            cont = (cont + 1);
                            estadoAnt = estadoAct;
                            estadoAct = colorSen.getColorID();
                            printColor(estadoAct, estadoAnt);
                        }
                        if(((cont == 50) || !movi)) {
                            ret = false;
                        } else {
                            cont = 0;
                            while((((movi && (estadoAct == colorToF2)) && ret) && (cont < 10))) {
                                movi = girar(1, -3, check);
                                cont = (cont + 1);
                                estadoAnt = estadoAct;
                                estadoAct = colorSen.getColorID();
                                printColor(estadoAct, estadoAnt);
                            }
                            if((((cont == 10) || !movi) || (estadoAct != colorToF1))) {
                                ret = false;
                            }

                        }
                    } else {
                        cont = 0;
                        while((((movi && (estadoAct != colorToF1)) && ret) && (cont < 50))) {
                            movi = girar(-1, -3, check);
                            cont = (cont + 1);
                            estadoAnt = estadoAct;
                            estadoAct = colorSen.getColorID();
                            printColor(estadoAct, estadoAnt);
                        }
                        if(((cont == 50) || !movi)) {
                            ret = false;
                        } else {
                            cont = 0;
                            while((((movi && (estadoAct == colorToF1)) && ret) && (cont < 10))) {
                                movi = girar(-1, -3, check);
                                cont = (cont + 1);
                                estadoAnt = estadoAct;
                                estadoAct = colorSen.getColorID();
                                printColor(estadoAct, estadoAnt);
                            }
                            if((((cont == 10) || !movi) || (estadoAct != colorToF2))) {
                                ret = false;
                            }

                        }
                    }
                } else {
                    ret = false;
                }
            }
        } else {
            System.out.println("Colors To follow not defined or defined same color on both");
        }
        return ret;
    }

    public static void readColorAndSet() {
        System.out.println("press any button when ready to read left color");
        Button.waitForAnyPress();
        colorToF1 = colorSen.getColorID();
        System.out.println(colorToF1);
        System.out.println("press any button when ready to read right color");
        Button.waitForAnyPress();
        colorToF2 = colorSen.getColorID();
        System.out.println(colorToF2);
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
        if((colorToF1 != -1)) {
            while((((check && checkSensors()) || !check) && ret)) {
                moverNoLimit(1);
                int a = colorSen.getColorID();
                while(((a == colorToF1) && ((check && checkSensors()) || !check))) {
                    Delay.msDelay(25);
                    a = colorSen.getColorID();
                }
                stopMov();
                if((a != colorToF1)) {
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
        colorSen = c;
    }

    public static void printColor(int estadoAct, int estadoAnt) {
        System.out.println(estadoAct);
        System.out.println(estadoAnt);
        System.out.println(colorToF1);
        System.out.println(colorToF2);
    }
}