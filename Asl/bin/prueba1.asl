include paquete/piloto

void main()

    m1 = MOTOR(1);
    m2 = MOTOR(2);
    us = ULTRA(1);


    m1.setSpeed(720);
    m2.setSpeed(720);
    while true do
        m1.avanzar();
        m2.avanzar();
        
        while us.getUltrasonic() > 20 do
            sleep(1);
        endwhile;
        m1.parar();
        m2.parar();
        girar(m1,m2,90);
        
    endwhile;
    

endfunc



