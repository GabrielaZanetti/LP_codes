package com.acme.exemplos;

public class TipoPrimitivo {

    public static void main(String[] args) {
/*
        int a = 40;
        int b = a + a;
//        System.out.println(b);
        
        char x = 'B';
//        System.out.println(x);
        
        String s = "Rua das Flores";
//        System.out.println(s);
        
//        char z = s.charAt(10); // posicao da string
//        boolean z = s.contains("das"); // verifica se existe uma substring
//        int z = s.length(); // soma da string
//        String s2 = s.toString(); // soma da string
        String s1 = "Ijui"; 
        String s2 = "Ijui"; 
        
        boolean v = s1.equalsIgnoreCase(s2); // comparacao de string 
        System.out.println(v);
        
        String v1 = "Ijui "; 
        String v2 = "Ijui       "; 
        
        s2.trim(); //remocao de espaco entre os textos
        System.out.println(s2);
*/

        /*
        * Freach de vetor
        ************************************
        String[] vet = new String[10];
        
        for (String s : vet){
            System.out.println(s);
        }
        
        System.out.println("Fim do codigo");
        */
        
        /*
        * Vetor de inteiros
            int [] notas = new int[15];
            for(int v : notas){
                System.out.print(v+", ");
            }
        */
        
        int[] metragem = {20,25,30,35,40,45,50};
        for ( int  m : metragem){
            System.out.println(m);
        }
    }   
}