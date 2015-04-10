void main()
    m1 = MOTOR(1);
    
    b = MOTOR(2);
    c = 12;
    
    b.setSpeed(5+c);
    a=12;
    sleep(20+a);
    m1 = configura (((3+(5*8))>6),c);
endfunc

motor configura(bool a,int b)
    m = MOTOR(1);
    m.avanzar();
    m.parar();
    m.avanzar(15);
    m.retroceder();
    m.retroceder(10);
    us = ULTRA(1);
    cs = COLOR(2);
    ts = TOUCH(3);
    write us.getUltrasonic();
    write cs.getColor();
    write ts.getTouch();
    m.setSpeed(5);
    return m
endfunc
    