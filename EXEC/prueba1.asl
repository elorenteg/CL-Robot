include basic/piloto



void main()
    
    
    
    
    m1 = MOTOR(1);
    m2 = MOTOR(2);
    us = ULTRA(1);
    p = OBJECT(piloto);
    p.init(m1,m2,9,12,2);
    r = p.girar(1,180,true);
    write r;
    sleep();
    r = p.girarInSitu(1,360,true);
    write r;
    sleep();
    r = p.girarInSitu(-1,360,false);
    write r;
    sleep();
    r = p.mover(1,10,true);
    write r;
    sleep();

endfunc



