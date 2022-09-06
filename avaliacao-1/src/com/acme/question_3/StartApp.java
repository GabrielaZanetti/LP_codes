package com.acme.question_3;

public class StartApp {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.id = 1;
        c.name = "Erico Verissimo";
        c.phone = "(55) 3478-8593";
        c.priority = true;
        
        Address a = new Address();
        a.rua = "Rua das Flores Centro";
        a.numero = 315;
        a.bairro = "Centro";
        a.cidade = "Cruz Alta";
        a.cep = 78200-040;
        a.estado = "RS, Brasil.";
        a.pais = "Brasil.";
        
        System.out.print("Customer ID #"+c.id);
        System.out.print("\n------------------------------");
        System.out.print("\nName:     "+c.name);
        System.out.print("\nAddress:  "+a.rua+","+a.numero+","+a.bairro+", "+a.cidade+", "+a.cep+", "+a.estado+", "+a.pais);
        System.out.print("\nPhone:    "+c.phone);
        System.out.print("\nPriority: "+c.priority+"\n");
    }    
}
