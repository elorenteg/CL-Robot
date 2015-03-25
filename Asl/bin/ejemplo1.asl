func main()

    m1 = MOTOR(1);
    m1.setRadio(2);
    m1.setSpeed(10);
    
    while getUltrasonico(1) > 4 do
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

endfunc