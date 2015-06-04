
ultra U;
motor M;
motor M1;
motor M2;

// funcion inicializadora del objeto sonar
// m1 y m2: motor izquierdo y derecho del robot
// mu: motor del sensor ultrasonico
// u: sensor ultrasonico
void init(motor m1, motor m2, motor mu, ultra u)
    U = u;
    M = mu;
    M.setSpeed(180);
    
    M1 = m1;
    M2 = m2;
    M1.setSpeed(180);
    M2.setSpeed(180);
endfunc


// gira g grados el motor del sensor ultrasonico
void girarUltra(int g)
    M.avanzar(g,true);
    M.retroceder(g,false);
endfunc


// funcion principal de resolucion de un laberinto
// lim: num. de movimientos maximo que puede realizar
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

// busca el angulo que han de girar los motores del robot para
// ir al sitio mas despejado
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


// funcion principal para seguir un objeto cercano
// lim: num. de movimientos maximo que puede realizar
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

// busca el angulo que han de girar los motores del robot para
// seguir el objeto mas cercano
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

bool mover(int grados)
    M1.avanzar(grados,true);
    M2.avanzar(grados,true);
    return U.getUltrasonic() > 10;
endfunc

void rapido(int lim)
    i = 0;
    while i < lim do
        despejado = true;
        write "Caminando hasta tope";
        while(despejado) do
            despejado = mover(50);
        endwhile;
        write "Tope encontrado";
        
        g = grados();
        write "Girando";
        write g;
        M1.retroceder(2 * g, true);
        M2.avanzar(2 * g, false);
        
        i = i + 1;
    endwhile;
endfunc