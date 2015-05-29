

int exponenciacion(int base, int expo)
    ret = 0;
    if expo=0 then
        ret = 1;
    else
        if expo=1 then
            ret = base;
        else
            if expo=2 then
                ret = base*base;
            else
                if (expo%2)=0 then
                    ret = exponenciacion(base,(expo/2));
                    ret = ret*ret;
                else
                    ret = exponenciacion(base,(expo/2));
                    ret = ret*ret*base;
                endif;
            endif;
        endif;
    endif;
    return ret;
endfunc

int absolute(int n)
    ret = 0;
    if n<0 then
        ret = -n;
    endif;
    return ret;
endfunc


