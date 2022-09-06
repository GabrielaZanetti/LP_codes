package br.com.bank;

public class StartApp {

    public static void main(String[] args) {
        Costumer c = new Costumer(); // cria um objeto da class Costumer
        c.id = 98572;
        c.name = "João da Silva";
        
        Address addr = new Address();
        addr.city = "Ijui";
        addr.postalCode = "98700-000";
        addr.street = "Rua das Palmeiras";
        addr.number = 272;   
        
        c.address = addr;
            
    }
    
}
