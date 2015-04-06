import lejos.nxt.*;

public class Traduccion {

    public static void funcionMotor(Motor m) {
        m.setRadio(3);
    }

    public static void funcion() {
        int a = 10;
        System.out.println("hola");
        boolean b = true;
    }

    public static void main(String args[]) {
        Motor m1 = Motor.A;
        m1.setRadio(2);
        m1.setSpeed(10);
        while(ATENCIOOOON!! getUltrasonic(SensorPort S1) > 4) {
            m1.avanzar(10);
        }
        if(ATENCIOOOON!! getColor(SensorPort S2) == 4) {
            Motor m2 = Motor.B;
            m2.avanzar(10);
        } else {
            m2.avanzar(-10);
        }
        sleep(100);
        m1.avanzar(100);
        funcionMotor(m1);
    }
}