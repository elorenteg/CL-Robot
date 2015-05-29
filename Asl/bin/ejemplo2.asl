include basic/sonar

// mueve el robot siguiendo un objeto

void main()

    m1 = MOTOR(1);
    m2 = MOTOR(2);
    m1.setSpeed(720);
    m2.setSpeed(720);
    
    s = OBJECT(sonar);
    s.init();        // ULTRA(1) en MOTOR(3)
    
    u = s.getUltra();
    mu = s.getMotor();
    
    desf = 0;
    mu.avanzar(10,false); desf = desf + 10;
    
    while true do
        g = s.gradosObj(0);
        m1.avanzar(g,true);
        m2.retroceder(g,false);
        
        desf = desf + 10;
        
        m1.avanzar(20,true);
        m2.avanzar(20,false);
    endwhile;

endfunc 
