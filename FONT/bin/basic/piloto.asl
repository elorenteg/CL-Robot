
int sep;
int eje;
int radio;
int relacion;
motor izq;
motor der;
color coloSen;
ultra ultraSen;
touch touchSen1;
touch touchSen2;
int limiteUS;
int colorToFollow;

void init(motor mizq, motor mder, int s, int e, int r)
    izq = mizq;
    der = mder;
    radio = r;
    sep = s;
    eje = e;
    relacion = eje/radio;
    limiteUS = -1;
    ultraSen = ULTRA(4);
    coloSen = COLOR(4);
    touchSen1 = TOUCH(4);
    touchSen2 = TOUCH(4);
    colorToFollow = -1;
    
endfunc

bool checkSensors()
    ret = false;
    if ((ultraSen.getUltrasonic()>limiteUS) and (not touchSen1.getTouch()) and (not touchSen2.getTouch())) then
        ret = true;
    endif;
    return ret;
endfunc

void setLimitUS(int lim)
    limiteUS = lim;
endfunc

void setTouch1(touch t)
    touchSen1 = t;
endfunc

void setTouch2(touch t)
    touchSen2 = t;
endfunc

void setTouchs(touch t1, touch t2)
    setTouch1(t1);
    setTouch2(t2);
endfunc

void setColorSen(color c);
    coloSen = c;
endfunc

void setUltra(ultra u)
    ultraSen = u;
endfunc

void setSensors(touch t1, touch t2, color c, ultra u)
    setTouchs(t1,t2);
    setColorSen(c);
    setUltra(u);
endfunc

bool girar(int dire,int grados, bool check)
    if dire>=0 then
        izq.avanzar(relacion*2*grados,true);
        while (izq.isMoving() and ( (check and checkSensors()) or not check)) do
            sleep(100);
        endwhile;
    else
        der.avanzar(relacion*2*grados,true);
        while (der.isMoving() and ( (check and checkSensors()) or not check)) do
            sleep(100);
        endwhile;
    endif;
    checkeo = (check and checkSensors()) or not check;
    if not checkeo then
        stopMov();
    endif;
    return checkeo;
endfunc

bool girarInSitu(int dire,int grados, bool check)
    if dire<0 then
        grados = -1*grados;
    endif;
        izq.avanzar(relacion*grados,true);
        der.retroceder(relacion*grados,true);
    return checkMotorSensor(check);
endfunc

bool mover(int dire,int grados,bool check)
    if dire<0 then
        grados = -1*grados;
    endif;
    izq.avanzar(grados,true);
    der.avanzar(grados,true);
    return checkMotorSensor(check);
endfunc

void moverNoLimit(int dire)
    if dire<0 then
        izq.retroceder();
        der.retroceder();
    else
        izq.avanzar();
        der.avanzar();
    endif;
endfunc

void stopMov()
    izq.parar();
    der.parar();
endfunc

bool checkMotorSensor(bool check)
    while (der.isMoving() and izq.isMoving() and ( (check and checkSensors()) or not check)) do
        sleep(100);
    endwhile;
    checkeo = (check and checkSensors()) or not check;
    if not checkeo then
        stopMov();
    endif;
    return checkeo;
endfunc

void setColorToFollow(int col)
    colorToFollow = col;
endfunc

bool followColor(bool check)
    ret = true;
    if colorToFollow != -1 then
        while (((check and checkSensors()) or (not check)) and ret) do
            write "ando";
            moverNoLimit(1);
            a = coloSen.getColor();
            while (a = colorToFollow and ((check and checkSensors()) or not check)) do
                sleep(25);
                a = coloSen.getColor();
            endwhile;
            stopMov();
            if (a != colorToFollow ) then
                ret = barrido2(320, check);
            endif;
            write "antes vuelta";
        endwhile;
        
        if not ret then
            write "Could not find path again";
        else
            write "stuck by sensors";
            ret = false;
        endif;
        
    else
        write "Color to Follow not defined";
        ret = false;
    endif;
    return ret;
endfunc


bool barrido(int maxAngle, bool check)
    write "entro barrido";
    vel = izq.getSpeed();
    ret = false;
    izq.setSpeed(25);
    der.setSpeed(25);
    der.retroceder(maxAngle*relacion,true);
    sleep(25);
    a = coloSen.getColor();
    while (a != colorToFollow and der.isMoving() and ((check and checkSensors()) or not check)) do
        sleep(25);
        a = coloSen.getColor();
    endwhile;
    stopMov();
    izq.setSpeed(vel);
    der.setSpeed(vel);
    if (a = colorToFollow) then
        ret = true;
    else
        der.avanzar(maxAngle*relacion,false);
        izq.setSpeed(25);
        der.setSpeed(25);
        izq.retroceder(maxAngle*relacion,true);
        sleep(25);
        a = coloSen.getColor();
        while (a != colorToFollow and izq.isMoving() and ((check and checkSensors()) or not check)) do
            sleep(25);
            a = coloSen.getColor();
        endwhile;
        stopMov();
        izq.setSpeed(vel);
        der.setSpeed(vel);
        if a = colorToFollow then
            ret = true;
        else
            izq.avanzar(maxAngle*relacion,false);
        endif;
        
    endif;
    write "salgo barrido";
    return ret;
endfunc

bool barrido2(int maxAngle, bool check)
    write "entro barrido";
    mult = 0;
    grad = 10;
    vel = izq.getSpeed();
    ret = false;
    a = coloSen.getColor();
    while (a != colorToFollow and ((check and checkSensors()) or not check)and (grad*mult)<maxAngle*relacion) do
        der.retroceder(grad,false);
        a = coloSen.getColor();
        mult = mult+1;
    endwhile;
    if (a = colorToFollow ) then
        ret = true;
        mult = 0;
        while(a = colorToFollow and ((check and checkSensors()) or not check)) do
            der.retroceder(grad,false);
            a = coloSen.getColor();
            mult = mult+1;
        endwhile;
        if a != colorToFollow then
            der.avanzar(grad*mult/2,false);
        else
            ret = false;
        endif;
            
            
    else
        der.avanzar(mult*grad,false);
        mult = 0;
        a = coloSen.getColor();
        while (a != colorToFollow and ((check and checkSensors()) or not check)) and mult*grad<maxAngle*relacion do
            izq.retroceder(grad,false);
            a = coloSen.getColor();
            mult = mult+1;
        endwhile;
        if a = colorToFollow then
            ret = true;
            mult = 0;
            while(a = colorToFollow and ((check and checkSensors()) or not check)) do
                izq.retroceder(grad,false);
                a = coloSen.getColor();
                mult = mult+1;
            endwhile;
            if a != colorToFollow then
                izq.avanzar(grad*mult/2,false);
            else
                ret = false;
            endif;
        else
            izq.avanzar(grad*mult,false);
        endif;
        
    endif;
    write "salgo barrido";
    return ret;
endfunc