package com.acme.eai;
/**
 * Exercicio - 2
 */
public class StartApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filter f = new Filter();
        System.out.println("Objeto filtro criado na posicao "+f);
        Splitter s = new Splitter();
        System.out.println( s );
    }
}
