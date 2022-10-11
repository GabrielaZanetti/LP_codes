package com.acme.exercicio_aula;

import java.util.ArrayList;

/**
 *  Class para executar metodos de uma outra class      
 * @author gabii
 */
public class ExemploVetorDinamico {
   
    public static void main(String[] args) {
       
       String[] dias = new String[7];
       ArrayList<Produto> carrinho = new ArrayList();
       Produto p1 = new Produto();
       
       p1.setDescricao( "Baralho de cartas" );
       p1.setPreco( 7f );
       
       carrinho.add( p1 );
       
       Produto p2 = new Produto();
       
       p2.setDescricao( "Copo de chop" );
       p2.setPreco( 37f );
       
       carrinho.add( p2 );
      
//       carrinho.remove(p2);
//       carrinho.clear();
       
//       System.out.println("Numero de produtos: "+ carrinho.size());
       
       for(Produto p: carrinho){
           System.out.println(p.getDescricao() +" -- "+ p.getPreco());
       }
       
       Produto res = carrinho.get(0);
        System.out.println(res.getDescricao());
        System.out.println(res.getPreco());
        
        Boolean b = carrinho.contains(p2);
        System.out.println(b);
   }    
}
