import basic.piloto;
import lejos.nxt.*;
import lejos.util.Delay;

public class sigueBi {
    public static boolean baileCL(piloto p1) {
        boolean ret = true;
        int vel = p1.getVelo();
        System.out.println("baile bienvenida demostracion CL");
        p1.setVelo(720);
        ret = p1.girarInSitu(1, 720, true);
        Delay.msDelay(2000);
        p1.setVelo(360);
        ret = p1.mover(1, 360, true);
        ret = p1.girar(-1, 90, true);
        ret = p1.mover(1, 1080, true);
        ret = p1.girar(-1, 90, true);
        ret = p1.mover(1, 360, true);
        if(ret) {
            System.out.println("C");
        }

        Delay.msDelay(2000);
        p1.setVelo(720);
        ret = p1.girar(-1, 90, true);
        ret = p1.mover(1, 1080, true);
        ret = p1.girar(1, 90, true);
        ret = p1.mover(1, 360, true);
        ret = p1.girarInSitu(1, 90, true);
        Delay.msDelay(2000);
        p1.setVelo(360);
        ret = p1.mover(1, 1080, true);
        ret = p1.girar(-1, 90, true);
        ret = p1.mover(1, 360, true);
        if(ret) {
            System.out.println("L");
        }

        Delay.msDelay(2000);
        p1.setVelo(720);
        ret = p1.girarInSitu(1, 1440, true);
        p1.setVelo(vel);
        return ret;
    }

    public static void main(String args[]) {
        NXTRegulatedMotor m1 = Motor.A;
        NXTRegulatedMotor m2 = Motor.B;
        m1.setSpeed(180);
        m2.setSpeed(180);
        piloto p = new piloto();
        p.init(m2, m1, 9, 12, 2);
        p.setSensors(new TouchSensor(SensorPort.S2), new TouchSensor(SensorPort.S3), new ColorSensor(SensorPort.S1), new UltrasonicSensor(SensorPort.S4));
        System.out.println("pasamos a modo SEGUIMIENTO");
        p.readColorAndSet();
        boolean ret = p.followBiColor(true);
        if(!ret) {
            System.out.println("linea acabada o no he podido recuperarme :S");
        }

        System.out.println("pulsa cualquier boton para salir de este programa");
        Button.waitForAnyPress();
    }
}