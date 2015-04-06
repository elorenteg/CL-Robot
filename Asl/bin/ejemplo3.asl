void funcion(motor m, touch t)
    m.avanzar(1);
endfunc

void main()
    m1 = MOTOR(1);
    ts = TOUCH(1);
    funcion(m1,ts);
    a=12;
    b=20;
    m1 = configura (((3+(5*8))>6)and(7<9),b);
endfunc

motor configura(bool a,int b)
    m = MOTOR(1);
    m.setSpeed(5);
    m.setRadio(b);
    return m
    
endfunc
    