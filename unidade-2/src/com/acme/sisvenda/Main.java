package com.acme.sisvenda;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.codigo = 1;
        p1.name = "TV LED 32 LG";
        p1.preco = 1400.0;
        
        p2.codigo = 2;
        p2.name = "SMART TV LED 32 Sansung";
        p2.preco = 1800.0;
        
        System.out.println("Lista de Produtos:");
        
        System.out.println("------------------");
        
        System.out.println("Codigo: "+p1.codigo);
        System.out.println("Codigo: "+p1.name);
        System.out.println("Codigo: "+p1.preco);
        
        System.out.println("------------------");
        
        System.out.println("Codigo: "+p2.codigo);
        System.out.println("Codigo: "+p2.name);
        System.out.println("Codigo: "+p2.preco);
        
    }    
}