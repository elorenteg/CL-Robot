
ultra U;
motor M;
motor M1;
motor M2;

void init(motor m1, motor m2, motor mu, ultra u)
    U = u;
    M = mu;
    M.setSpeed(180);
    
    M1 = m1;
    M2 = m2;
    M1.setSpeed(180);
    M2.setSpeed(180);
endfunc



void girarUltra(int g)
    M.avanzar(g,true);
    M.retroceder(g,false);
endfunc



void laberinto(int lim)
    i = 0;
    while (i < lim) do
        g = grados();
        write g;
        
        M1.retroceder(2 * g,true);
        M2.avanzar(2 * g,false);
        
        if (g != 180) then
            M1.avanzar(100,true);
            M2.avanzar(100,false);
        endif;
        
        i = i + 1;
    endwhile;
endfunc

int grados()
    girarUltra(- 75);
    
    grad = 0;
    dist = 0;
    i = -65;
    cerca = true;
    while i <= 75 do
        
        if (U.getUltrasonic() > dist) then
            dist = U.getUltrasonic();
            grad = i;
        endif;
        
        if (U.getUltrasonic() > 50) then
            cerca = false;
        endif;
        
        girarUltra(10);
        i = i + 10;
    endwhile;
    
    girarUltra(- 65);
    
    if (cerca) then grad = 180; endif;
    
    return grad;
endfunc



void sigueObjeto(int lim)
    i = 0;
    while (i < lim) do
        g = gradosObjeto();
        write g;
        
        M1.retroceder(2 * g,true);
        M2.avanzar(2 * g,false);
        
        if (g != 180 and U.getUltrasonic() > 10) then
            M1.avanzar(100,true);
            M2.avanzar(100,false);
        endif;
        
        i = i + 1;
    endwhile;
endfunc

int gradosObjeto()
    girarUltra(- 75);
    
    grad = 0;
    dist = 255;
    i = -65;
    cerca = false;
    while i <= 75 do
        
        if (U.getUltrasonic() < dist) then
            dist = U.getUltrasonic();
            grad = i;
        endif;
        
        if (U.getUltrasonic() < 100) then
            cerca = true;
        endif;
        
        girarUltra(10);
        i = i + 10;
    endwhile;
    
    girarUltra(- 65);
    
    if (not cerca) then grad = 180; endif;
    
    return grad;
endfunc