package com.acme;

import java.util.UUID;

public class Target {
    
    /*  Atributo    */
    private UUID id = UUID.randomUUID();
    private String message;
    
    /*  Operacao    */
    public UUID getId() {
        return id;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void SetMessage (String m){
        message = m;
    }
}
