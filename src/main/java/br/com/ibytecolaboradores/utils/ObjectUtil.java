package br.com.ibytecolaboradores.utils;

import org.springframework.stereotype.Component;

@Component
public class ObjectUtil {
    public Object clearObject(Object object){
        object = null;
        return object;
    }
}
