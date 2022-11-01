package com.acme;

public class ExemploPassagemParametro {

    public static void main(String[] args) {
        
        int x = 10;
        int i = foo( x );
        System.out.println(i);
        System.out.println(x);
            
        int[] vet = new int[5];
        System.out.println(vet[0]);
        foo(vet);
        System.out.println(vet[0]);
        
    }
    
    private static int foo( int val ) {
        
        int res = val + 5;
        
        return res;
    }
    
    private static void foo( int[] v ) {
        v[0] = 99;
    }
}
