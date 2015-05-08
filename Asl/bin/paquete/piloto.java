package paquete;
import lejos.nxt.*;

public class piloto {

    public static void girar(NXTRegulatedMotor m1, NXTRegulatedMotor m2, int grado) {
        m1.rotate(540,(4 < 5));
        m2.rotate(-(520 + 20),(5 < 3));
    }
}