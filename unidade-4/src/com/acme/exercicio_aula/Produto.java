package com.acme.exercicio_aula;

/**
 *  Class produto para setar preco e descricao e receber os mesmos
 * @author gabii
 */
public class Produto {
    
    // Atributo
    private String descricao;
    private float preco;

    // Metodo
    public void setDescricao(String d){
        descricao = d;
    }

    public String getDescricao(){
        return descricao;
   }
   
    public void setPreco(float p){
        preco = p;
    }
    
   public float getPreco(){
       return preco;
   }
}
