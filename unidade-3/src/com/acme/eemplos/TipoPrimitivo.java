package com.acme.eemplos;

public class TipoPrimitivo {

    public static void main(String[] args) {
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
    }   
}