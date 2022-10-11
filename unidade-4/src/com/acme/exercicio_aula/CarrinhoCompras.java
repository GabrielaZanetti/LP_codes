package com.acme.exercicio_aula;

import java.util.ArrayList;

public class CarrinhoCompras {
    //  Atributo
    private ArrayList<Produto> produtos = new ArrayList();
    
    // Metodo
    public void adicionar(String desc, float preco){
        Produto p = new Produto();
        
        p.setDescricao(desc);
        p.setPreco(preco);
        
        produtos.add(p);
    }
   
    public float total(){
        float t = 0;
        for (Produto p : produtos){
            t = t + p.getPreco();
        }
        return t;
    }
}