package com.codific.senha;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        User usr = new User();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um login: ");
        usr.setLogin(input.nextLine());
    }
    
}
