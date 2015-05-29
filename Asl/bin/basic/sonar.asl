
ultra U;
motor M;

void init(int portU, int portM)
    U = ULTRA(portU);
    M = MOTOR(portM);
    M.setSpeed(720);
    
endfunc


void girar(int g)
    M.avanzar(g,True);
    M.retroceder(g,False);
enfunc


int grados(int desf)
    girar(-desf-75);
    
    grad = 0;
    dist = 0;
    i = -75;
    while i < 75 do
        girar(10);
        
        if U.getUltrasonic() > dist then
            dist = U.getUltrasonic();
            grad = i;
        endif;
        
        i = i + 10;
    endwhile;
    
    girar(desf-75);
    
    return grad;
    
endfunc