void main()

    m1 = MOTOR(1);
    m1.setSpeed(10);
    
    us = ULTRA(1);
    while us.getUltrasonic() > 4 do
        m1.avanzar(1);
    endwhile;
    m1.parar();
    
    ts = TOUCH(2);
    if ts.getTouch() then
        m1.avanzar(10);
    endif;
    
    sleep(100);

endfunc