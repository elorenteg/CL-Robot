
ultra U;
motor M;

void init()
    U = ULTRA(1);
    M = MOTOR(3);
    M.setSpeed(720);
endfunc

ultra getUltra()
    u = U;
    return u;
endfunc

motor getMotor()
    m = M;
    return m;
endfunc

void girar(int g)
    M.avanzar(g,true);
    M.retroceder(g,false);
endfunc


int grados(int desf)
    girar(- desf - 75);
    
    grad = 0;
    dist = 0;
    i = -75;
    while i <= 75 do
        
        if (U.getUltrasonic() > dist) then
            dist = U.getUltrasonic();
            grad = i;
        endif;
        
        girar(10);
        
        i = i + 10;
    endwhile;
    
    girar(desf - 75);
    
    return grad;
endfunc

int gradosObj(int desf)
    girar(- desf - 10);
    
    grad = 0;
    dist = 255;
    i = -10;
    while i <= 10 do
        
        if (U.getUltrasonic() < dist) then
            dist = U.getUltrasonic();
            grad = i;
        endif;
        
        girar(10);
        
        i = i + 10;
    endwhile;
    
    girar(desf - 10);
    
    return grad;
endfunc