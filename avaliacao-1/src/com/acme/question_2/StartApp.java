package com.acme.question_2;

public class StartApp {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.id = 1;
        c.name = "Erico Verissimo";
        c.address = "Rua das Flores, 315. Centro, Cruz Alta, 78200-040, RS, Brasil.";
        c.phone = "(55) 3478-8593";
        c.priority = true;
        
        System.out.print("Customer ID #"+c.id);
        System.out.print("\n------------------------------");
        System.out.print("\nName:     "+c.name);
        System.out.print("\nAddress:  "+c.address);
        System.out.print("\nPhone:    "+c.phone);
        System.out.print("\nPriority: "+c.priority+"\n");
    }    
}
