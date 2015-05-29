include basic/piloto



void main()
    
    
    
    
    m1 = MOTOR(1);
    m2 = MOTOR(2);
    us = ULTRA(1);
    
    m1.setSpeed(180);
    m2.setSpeed(180);
    
    p = OBJECT(piloto);
    p.init(m1,m2,9,12,2);
    p.setColorSen(COLOR(1));
    p.setColorToFollow(7);
    r = p.followColor(true);
    sleep();
    

endfunc



