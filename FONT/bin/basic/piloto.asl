
int sep;
int eje;
int radio;
int relacion;
motor izq;
motor der;
color colorSen;
ultra ultraSen;
touch touchSen1;
touch touchSen2;
int limiteUS;
int colorToF1;
int colorToF2;


//funcion inicializadora del objeto piloto
// se le pasa el motor izq el motor derecho la separacion de los ejes en cm
// la longitud de un eje en cm y la longitud del radio de las ruedas motrices en cm
// ademas inicializa los sensores a el puerto numero 4.
// para una utilizacion correcta del modulo no conectar ningun sensor al puerto 4 si no se configura
// mas tarde con la funcion setter correspondiente. para que el sistema no falle se han de inicializar a un
// puerto aunque luego no haya sensor conectado
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
    colorToF1 = -1;
    colorToF2 = -1;
    
endfunc


//funcion que checkea los sensores y devuleve true si algun sensor es activado o false si ninguno es activado
bool checkSensors()
    ret = false;
    if ((ultraSen.getUltrasonic()>limiteUS) and (not touchSen1.getTouch()) and (not touchSen2.getTouch())) then
        ret = true;
    endif;
    return ret;
endfunc

//funcion que impone el limite maximo antes de que el sensor ultrasonico devulva un true a la hora
//de checkear distancia
void setLimitUS(int lim)
    limiteUS = lim;
endfunc

//funcion set del sensor touch 1
void setTouch1(touch t)
    touchSen1 = t;
endfunc

//funcion set del sensor touch 2
void setTouch2(touch t)
    touchSen2 = t;
endfunc

//funcion set de los sensores de touch
void setTouchs(touch t1, touch t2)
    setTouch1(t1);
    setTouch2(t2);
endfunc

//funcion set del sensor de color
void setColorSen(color c);
    colorSen = c;
endfunc

//funcion set del sensor de ultrasonicos.
void setUltra(ultra u)
    ultraSen = u;
endfunc

//funcion set de los sensores de touch 1 y 2, de color y de ultrasonicos del objeto piloto
void setSensors(touch t1, touch t2, color c, ultra u)
    setTouchs(t1,t2);
    setColorSen(c);
    setUltra(u);
endfunc

//funcion set de misma velocidad en ambos motores
void setVelo(int vel)
    izq.setSpeed(vel);
    der.setSpeed(vel);
endfunc

int getVelo()
    vel = izq.getSpeed();
    return vel;
endfunc


//esta funcion realiza un giro del robot de acuerdo a los grados proporcionados y la direccion
//dire indica direccion del movimiento si dire>= 0 sera giro a la derecha si dire<0 sera giro a la izq
//grados indica los grados a girar. si grados es positivo el giro sera en la direccion que indique dire
//si grados son negativos el giro sera en retroceso.
// ejemplo girar(1,45,false) gira a la derecha 45 grados avanzando el motor izq.
//         girar(-1,-45,false) gira a la derecha 45 grados retrasando el motor der.
//         el resultado final es el mismo(orientacion) aunque uno estada mas adelante que el otro. 
//check indica si se quiere activar el checkeo de los sensores mientras se realiza el giro
// interrumpiendo el mismo en el caso de que se active alguno de ellos
// esta funcion devolvera true si el giro se completo o false si el giro fallo debido a un bloqueo
// de los sensores
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

//esta funcion realiza un giro in situ del robot de acuerdo a los grados proporcionados
//dire indica direccion del movimiento si dire>= 0 sera giro a la derecha si dire<0 sera giro a la izq
//grados indica los grados a girar. si grados es positivo el giro sera en la direccion que indique dire
//si grados son negativos el giro sera como realizar el giro con dire en el signo contrario
//check indica si se quiere activar el checkeo de los sensores mientras se realiza el giro
// interrumpiendo el mismo en el caso de que se active alguno de ellos
// esta funcion devolvera true si el giro se completo o false si el giro fallo debido a un bloqueo
// de los sensores
bool girarInSitu(int dire,int grados, bool check)
    if dire<0 then
        grados = -1*grados;
    endif;
        izq.avanzar(relacion*grados,true);
        der.retroceder(relacion*grados,true);
    return checkMotorSensor(check);
endfunc


//funcion mueve el robot en direccion dire (avance si dire>=0 retroceso si dire<0) el numero de grados
//proporcionados (igual que en todas las funciones una dire positiva y grados negativos es equivalente a
//dire negativa y grados positivos.
//check igual que en otras funciones indica si checkear los sensores para interrumpir el movimiento.
// esta funcion devolvera true si el movimiento se completo o false si el movimiento fallo debido a un bloqueo
// de los sensores
bool mover(int dire,int grados,bool check)
    if dire<0 then
        grados = -1*grados;
    endif;
    izq.avanzar(grados,true);
    der.avanzar(grados,true);
    return checkMotorSensor(check);
endfunc

//esta funcion activa los 2 motores para moverse de forma indefinida en la direccion indicada
// para que la funcion no sea bloqueante no se pueden checkear sensores dentro de la funcion.
void moverNoLimit(int dire)
    if dire<0 then
        izq.retroceder();
        der.retroceder();
    else
        izq.avanzar();
        der.avanzar();
    endif;
endfunc

// esta funcion para los dos motores tanto si se estuviesen moviendo o no
void stopMov()
    izq.parar();
    der.parar();
endfunc

// esta funcion checkea que los motores estan en movimiento y si check es true tambien controla
// los sensores definidos en el objeto. hasta que se paren los motores o se bloqueen los sensores se seguira
// checkeando cada 100ms. si se sale del bucle por parada de los motores se considera una salida true
// si no sera false ( se ha salido del bucle por activacion de algun sensor)
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

//funcion para hacer set de los colores de la linea a seguir de forma manual
// col indica el color izq de la linea, col2 indica el color derecho de la linea
void setColorToFollow(int col, int col2)
    colorToF1 = col;
    colorToF2 = col2;
endfunc

//funcion para leer colores del mundo real a traves del sensor haciendo set primero
// del color izq de la linea y luego leyendo el color derecho de la linea

void readColorAndSet()
    write "press any button when ready to read left color";
    sleep();
    colorToF1 = colorSen.getColor();
    write colorToF1;
    write "press any button when ready to read right color";
    sleep();
    colorToF2 = colorSen.getColor();
    write colorToF2;
endfunc

//funcion para, una vez definidos los colores de la linea, seguir la linea hasta que se bloquee.
// si la linea es una forma geometrica cerrada, casi seguro seguira sin parar nunca dando vueltas.
// la variable check igual que en todo el objeto define si checkear los sensores mientras se mueve el robot
// o hacer caso omiso.
bool followBiColor(bool check)
    ret = true;
    if colorToF1 != -1 and colorToF1 != colorToF2 then
        while (ret) do
            estadoAct = colorSen.getColor();
            estadoAnt = -1;
            movi = (check and checkSensors()) or not check;
            while(movi and (estadoAct = colorToF1 or estadoAct = colorToF2) and ret) do
                movi = mover(1,10,check);
                estadoAnt = estadoAct;
                estadoAct = colorSen.getColor();
            endwhile;
            if (movi) then
                cont = 0;
                //he salido por segunda clausula de colores
                if (estadoAnt = colorToF2) then
                    //me tengo que recuperar a la izq
                    while (movi and estadoAct != colorToF2 and ret and cont<17) do
                        movi = girar(1,-10,check);
                        cont = cont+1;
                        estadoAnt = estadoAct;
                        estadoAct = colorSen.getColor();
                    endwhile;
                    if ( (cont = 17) or (not movi )) then
                        // me he intentado recuperar a la izq y no he encontrado el color
                        // derecho de la linea colorToF2 o me he parado por sensores
                        // si check estaba activado
                        ret = false;
                    else
                        //giro izq y he encontrado color derecho colorToF2 para corregir mejor
                        //sigo hasta justo cuando encuentre el color izq colorToF1 asi intento
                        //salirme menos
                        while (movi and estadoAct = colorToF2 and ret and cont < 17) do
                            movi = girar(1,-10,check);
                            cont = cont+1;
                            estadoAnt = estadoAct;
                            estadoAct = colorSen.getColor();
                        endwhile;
                        if ((cont = 17) or (not movi) or (estadoAct != colorToF1)) then
                            ret = false;
                        endif;
                    endif;
                else
                    // me tengo que recuperar a la derecha
                    //me tengo que recuperar a la izq
                    while (movi and estadoAct != colorToF1 and ret and cont<17) do
                        movi = girar(-1,-10,check);
                        cont = cont+1;
                        estadoAnt = estadoAct;
                        estadoAct = colorSen.getColor();
                    endwhile;
                    if ((cont = 17) or (not movi)) then
                        // me he intentado recuperar a la izq y no he encontrado el color
                        // derecho de la linea colorToF2 o me he parado por sensores
                        // si check estaba activado
                        ret = false;
                    else
                        //giro derecha y he encontrado color izq colorToF1 para corregir mejor
                        //sigo hasta justo cuando encuentre el color der colorToF2 asi intento
                        //salirme menos
                        while (movi and estadoAct = colorToF1 and ret and cont<17) do
                            movi = girar(-1,-10,check);
                            cont = cont+1;
                            estadoAnt = estadoAct;
                            estadoAct = colorSen.getColor();
                        endwhile;
                        if ((cont = 17) or (not movi) or (estadoAct != colorToF2)) then
                            ret = false;
                        endif;
                    endif;
                endif;
            else
                // movi es false asi que problema con sensores y me bloqueo
                ret = false;
            endif;
        endwhile;
    else
        write "Colors To follow not defined or defined same color on both"
    endif;
    return ret;
endfunc


//funcion para hacer follow a linea de un color. se usara el color definido como colortoF1
// la variable check igual que en todo el objeto define si checkear los sensores mientras se mueve el robot
// o hacer caso omiso.
bool followColor(bool check)
    ret = true;
    if colorToF1 != -1 then
        while (((check and checkSensors()) or (not check)) and ret) do
            //write "ando";
            moverNoLimit(1);
            a = colorSen.getColor();
            while (a = colorToF1 and ((check and checkSensors()) or not check)) do
                sleep(25);
                a = colorSen.getColor();
            endwhile;
            stopMov();
            if (a != colorToF1 ) then
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

//funcion auxiliar para el seguimiento de linea de 1 color. cuando perdemos el path
// hacemos un barrido en forma de abanico para encontrarnos de nuevo.
// la variable check igual que en todo el objeto define si checkear los sensores mientras se mueve el robot
// o hacer caso omiso.
// devuleve true si ha podido volver a la linea o false si no ha encontrado el path en el barrido.

bool barrido2(int maxAngle, bool check)
    write "entro barrido";
    mult = 0;
    grad = 10;
    vel = izq.getSpeed();
    ret = false;
    a = colorSen.getColor();
    while (a != colorToF1 and ((check and checkSensors()) or not check)and (grad*mult)<maxAngle*relacion) do
        der.retroceder(grad,false);
        a = colorSen.getColor();
        mult = mult+1;
    endwhile;
    if (a = colorToF1 ) then
        ret = true;
        mult = 0;
        while(a = colorToF1 and ((check and checkSensors()) or not check)) do
            der.retroceder(grad,false);
            a = colorSen.getColor();
            mult = mult+1;
        endwhile;
        if a != colorToF1 then
            der.avanzar(grad*mult/2,false);
        else
            ret = false;
        endif;
    else
        der.avanzar(mult*grad,false);
        mult = 0;
        a = colorSen.getColor();
        while (a != colorToF1 and ((check and checkSensors()) or not check)) and mult*grad<maxAngle*relacion do
            izq.retroceder(grad,false);
            a = colorSen.getColor();
            mult = mult+1;
        endwhile;
        if a = colorToF1 then
            ret = true;
            mult = 0;
            while(a = colorToF1 and ((check and checkSensors()) or not check)) do
                izq.retroceder(grad,false);
                a = colorSen.getColor();
                mult = mult+1;
            endwhile;
            if a != colorToF1 then
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


