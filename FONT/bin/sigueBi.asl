include basic/piloto



void main()
    
    
    
    
    m1 = MOTOR(1);
    m2 = MOTOR(2);
    
    m1.setSpeed(180);
    m2.setSpeed(180);
    
    p = OBJECT(piloto);
    p.init(m1,m2,9,12,2);
    p.setSensors(TOUCH(2),TOUCH(3),COLOR(1),ULTRA(4));
    
    
    ret = baileCL(p);
    
    if ret then
        write "baile realizado con exito"
    endif;
    
    write "pasamos a modo SEGUIMIENTO";
    
    
    p.readColorAndSet();
    ret = p.followBiColor(true);
    
    if not ret  then
        write "linea acabada o no he podido recuperarme :S";
    endif;
    
    write "pulsa cualquier boton para salir de este programa";
    sleep();
    

endfunc



bool baileCL(piloto p1)
    ret = true;
    vel = p1.getVelo();
    
    write "baile bienvenida demostracion CL";
    
    p1.setVelo(720);
    ret = p1.girarInSitu(1,720,true);
    sleep(2000);
    
    // letra C
    p1.setVelo(360);
    ret = p1.mover(1,360,true);
    ret = p1.girar(-1,90,true);
    ret = p1.mover(1,1080,true);
    ret = p1.girar(-1,90,true);
    ret = p1.mover(1,360,true);
    if ret then
        write "C"
    endif;
    sleep(2000);
    
    //posiciono para letra L
    p1.setVelo(720);
    ret = p1.girar(-1,90,true);
    ret = p1.mover(1,1080,true);
    ret = p1.girar(1,90,true);
    ret = p1.mover(1,360,true);
    ret = p1.girarInSitu(1,90,true);
    sleep(2000);
    
    //letra L
    p1.setVelo(360);
    ret = p1.mover(1,1080,true);
    ret = p1.girar(-1,90,true);
    ret = p1.mover(1,360,true);
    if ret then
        write "L"
    endif;
    sleep(2000);
    
    //segundo baile victoria!!!
    p1.setVelo(720);
    ret = p1.girarInSitu(1,1440,true);
    
    p1.setVelo(vel);
    return ret;
endfunc