
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



// mueve los motores del robot g grados para girar in situ
void mover(int g)
    M1.avanzar(g,true);
    M2.avanzar(g,true);
endfunc

// gira g grados el motor del sensor ultrasonico
void girarUltra(int g)
    M.avanzar(g,false);
    sleep(100);
endfunc

// comprueba que no haya un obstaculo a tope cm por delante del sensor
bool checkUltra(int tope)
    d = U.getUltrasonic();
    return d > tope;
endfunc





// busca el angulo que han de girar los motores del robot para
// ir al sitio mas despejado
int grados()
    girarUltra(- 75);
    
    grad = 0;
    dist = 0;
    i = -75;
    cerca = true;
    while i <= 75 do
        d = U.getUltrasonic();
        if (d > dist) then
            dist = d;
            grad = i;
        endif;
        
        if (d > 20) then
            cerca = false;
        endif;
        
        girarUltra(10);
        i = i + 10;
    endwhile;
    
    girarUltra(- 85);
    
    if (cerca) then grad = 90; endif;
    
    return grad;
endfunc


// busca el angulo que han de girar los motores del robot para
// seguir el objeto mas cercano
int gradosObjeto()
    girarUltra(- 75);
    
    grad = 0;
    dist = 255;
    i = -75;
    cerca = false;
    while i <= 75 do
        d = U.getUltrasonic();
        if (d < dist) then
            dist = d;
            grad = i;
        endif;
        
        if (d < 150) then
            cerca = true;
        endif;
        
        girarUltra(10);
        i = i + 10;
    endwhile;
    
    girarUltra(- 85);
    
    if (not cerca) then grad = 90; endif;
    
    return grad;
endfunc



void laberintoRapido(int lim)
    i = 0;
    while i < lim do
        write "Caminando hasta tope";
        despejado = checkUltra(10);
        while(despejado) do
            mover(50);
            despejado = checkUltra(10);
        endwhile;
        write "Tope encontrado";
        
        g = grados();
        write "Girando";
        write g;
        M1.avanzar(6 * g, true);
        M2.retroceder(6 * g, false);
        
        i = i + 1;
    endwhile;
endfunc

void seguirRapido(int lim)
    i = 0;
    while i < lim do
        write "Caminando hasta encontrar objeto";
        despejado = checkUltra(10);
        while(despejado) do
            mover(50);
            despejado = checkUltra(10);
        endwhile;
        write "Objeto encontrado";
        
        while(not despejado) do
            sleep(1000);
            despejado = checkUltra(10);
        endwhile;
        write "Objeto movido";
        
        g = gradosObjeto();
        write "Girando";
        write g;
        M1.avanzar(4 * g, true);
        M2.retroceder(4 * g, false);
        
        i = i + 1;
    endwhile;
endfunc







// funcion principal de resolucion de un laberinto (forma lenta)
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

// funcion principal para seguir un objeto cercano (forma lenta)
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