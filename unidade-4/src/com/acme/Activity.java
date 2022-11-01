package com.acme;

import java.util.ArrayList;
import java.util.UUID;

public class Activity {

    /*  Atributos   */
    private long runAt;             //  usado quando a atividade vai iniciar
    private long endRun;            //  usado quando a atividade vai finalizada
    private boolean active;         //  se a atividade esta ativa : true ? false ;
    
    /*  Operacoes   */
    public long getRunAt() {
        return runAt;
    }
    
    public long getEndRun() {
        return endRun;
    }
    
    public boolean isActive() {    //  quando boleano inicia com is ( uma pergunta se e true ou false   )
        return active;
    }
    
    public void setActive(boolean act) {
        active = act;
    }
    
    
    /*  overloading da operacao perform ( mesmo nome mas com funcoes diferentes )  */
    public void perform( ) {
        runAt = System.currentTimeMillis();
        active = true;

        ArrayList<String> temp = new ArrayList();
        for( int i = 0; i < 100_000; i++) { // usando _ para separar os numeros e ter uma melhor resolucao
            temp.add( UUID.randomUUID().toString() );
        }
        
        endRun   = System.currentTimeMillis();
    }

    public void perform ( Target notify ) {
        perform();        
        notify.SetMessage("Codigo executado com sucesso!");
    }
    
    public long getRuningTime() {
        return (endRun - runAt);
    }
    
}