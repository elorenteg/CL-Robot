void main()
    funcion();
    a = 1;
    funcionInt(a);
    
    m1 = MOTOR(1);
    m1.setSpeed(1);
    c = m1.getSpeed();
    d = getUltrasonic(1);
    
endfunc

void funcion()
    a = 10;
    write "hola";
    b = true;
endfunc

void funcionInt(int a)
    a = a + 2;
endfunc