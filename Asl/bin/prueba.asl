void main()
    funcion();
    a = 1;
    funcionInt(a);
    
    m1 = MOTOR(1);
    m1.setSpeed(2);
    m1.setSpeed(2.1);
    m1.setRadio(2);
    m1.setRadio(2.1);
    m1.avanzar(1);
    m1.avanzar(1.2);
    m1.avanzar();
    m1.parar();
    m1.acelerar(1);
    m1.acelerar(1.2);
    
endfunc

void funcion()
    a = 10;
    write "hola";
    b = true;
endfunc

void funcionInt(int a)
    a = a + 2;
endfunc