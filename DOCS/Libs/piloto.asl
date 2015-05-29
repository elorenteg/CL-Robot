
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

void init(motor mizq, motor mder, int s, int e, int r)
    izq = mizq;
    der = mder;
    radio = r;
    sep = s;
    eje = e;
    relacion = eje/radio;
    limiteUS = 1000;
    ultraSen = ULTRA(1);
    coloSen = COLOR(1);
    touchSen1 = TOUCH(1);
    touchSen2 = TOUCH(1);
    
endfunc

bool checkSensors()
    ret = false;
    if ((ultraSen.getUltrasonic()<limiteUS) and (not touchSen1.getTouch()) and (not touchSen2.getTouch())) then
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

void setColor(color c);
    coloSen = c;
endfunc

void setUltra(ultra u)
    ultraSen = u;
endfunc

void setSensors(touch t1, touch t2, color c, ultra u)
    setTouchs(t1,t2);
    setColor(c);
    setUltra(u);
endfunc

bool girar(int dire,int grados, bool check)
    if dire>=0 then
        izq.avanzar(relacion*2*grados);
    else
        der.avanzar(relacion*2*grados);
    endif;
    return checkMotorSensor(check);
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

bool checkMotorSensor(bool check)
    while (der.isMoving() and izq.isMoving() and ( (check and checkSensors()) or not check)) do
        sleep(500);
    endwhile;
    return (check and checkSensors()) or not check;
endfunc
    