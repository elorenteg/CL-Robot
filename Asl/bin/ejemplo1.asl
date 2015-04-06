
void funcion()
    a = 10;
    write "hola";
    b = true;
endfunc

void funcionMotor(motor m)
    m.setRadio(3);
endfunc

void main()

    m1 = MOTOR(1);
    m1.setRadio(2);
    m1.setSpeed(10);
    
    while getUltrasonic(1) > 4 do
        m1.avanzar(10);
    endwhile;
    
    if getColor(2) = 4 then
        m2 = MOTOR(2);
        m2.avanzar(10);
    else
        //MOTOR(3).avanzar(10);
        m2.avanzar(-10);
    endif;
    
    sleep(100);
    
    m1.avanzar(100);
    
    funcionMotor(m1);

endfunc