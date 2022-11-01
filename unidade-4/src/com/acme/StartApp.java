package com.acme;

public class StartApp {

    public static void main(String[] args) {
        
        Target t = new Target();
        
        Activity act = new Activity();          
        act.perform(t);  //  inicia a atividade
        
//        System.out.println( "Run At: " + act.getRunAt() );
//        System.out.println( "End run at: " + act.getEndRun() );
//        System.out.println( "Runing time: " + act.getRuningTime() );
//        System.out.println( "A atividade esta iniciada? " + act.isActive() );

//        System.out.println(t.getMessage());
        
        Activity act2 = new Activity();
        act2.perform();  //  inicia a atividade 2
//        System.out.println( "Runing time act 2: " + act2.getRuningTime() );
        
        PrintDocument print = new PrintDocument();
        print.perform();
        
        
    }
    
}
