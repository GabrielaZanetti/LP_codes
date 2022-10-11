package com.acme.exercicio_aula;

import java.util.Scanner;

public class TestarCarrinho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionar("Baralho", 37f);
        System.out.println      (carrinho.total());
        
    }    
}
