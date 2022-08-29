package com.acme;
/**
 * Esta classe representa a classe principal do sistema, 
* responsável pela execução do mesmo
* @author Gabriela R. Zanetti
* since 1.0 */
public class Start {
    //  Atributes

    // Operations
    public static void main(String[] args) {        
        /*
            as linhas abaixo imprimem 
            um conjunto de mensagem
        */
        System.out.println("Hoje e segunda-feita");
        System.out.println("Boa noite");
        
        Person p; // declaracao de uma referencia P
        p = new Person(); // cria um objeto da classe
        System.out.println(p);
        
        System.out.println("Objeto Person criado");
        
        Studant st = new Studant();
    }
}

/* 
* Rodar a class  file
* Run file
* shift + F6
*/