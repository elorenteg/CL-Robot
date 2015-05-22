include paquete/piloto
include paquete/sensor

int a;
piloto pil;

void main()
    o = OBJECT(piloto);
    o = ejemplo();
    o = OBJECT(piloto);
    b = OBJECT(sensor);
    numero = 5;
    m1 = MOTOR(1);
    m1 = MOTOR(2);
    m1 = ejemplo2();
    m2 = MOTOR(2);
    m3 = ejemplo2();
    o.girar(m1,m2,45);
    o.sensor();
    b.girar(m2,m1,20);
    girar(10,m1,o);
    

endfunc

void ja()

    a=2;
endfunc

void girar(int a,motor m1, piloto pi)
    
    b = a;
endfunc


piloto ejemplo()

    o = OBJECT(piloto);
    
    return o;
    
endfunc

motor ejemplo2()
    
    m1 = MOTOR(3);
    
    return m1;
    
endfunc