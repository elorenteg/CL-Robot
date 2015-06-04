include basic/sonar

// mueve el robot siguiendo un objeto

void main()
    M1 = MOTOR(1);
    M2 = MOTOR(2);
    
    MU = MOTOR(3);
    U = ULTRA(4);
    s = OBJECT(sonar);
    s.init(M1,M2,MU,U);
    s.seguirRapido(10);
endfunc 
