void funcion(motor m, touch t)
    m.avanzar(1);
endfunc

void main()
    m1 = MOTOR(1);
    ts = TOUCH(1);
    funcion(m1,ts);
    a=12;
    b=20;
    m1 = configura (a,b);
endfunc

motor configura(int a,int b)
    m = MOTOR(1);
    m.setSpeed(a);
    m.setRadio(b);
    return m
    
endfunc
    