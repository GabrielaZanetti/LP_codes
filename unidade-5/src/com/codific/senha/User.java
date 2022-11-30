package com.codific.senha;

/*
*   Usada para codificar senha e login
*/
public class User {
    //  Atributo
    private String login, password;
    
    //  Operacoes
    private boolean validateLogin(String login){
        int iArroba = login.indexOf("@");
        int iPonto = login.indexOf(".");
        return ( (iArroba > 0) && (iPonto > iArroba + 3) && (login.length() > iPonto + 2) );
    }
    
    private boolean validatePassword(String password){
        
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            
            boolean isDigit = switch (x){
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
                default -> false;
            };
            if (!isDigit){
                return false;
            }
            
        }
        
        if( password.length() >=8 && password.length() <= 10 ){
            return true;
        }
        return false;
    }
    
   public String getLogin(){
       return this.login;
   }
    
    public void setLogin(String login){
        if( validateLogin(login) ){
            this.login = login;
            
            System.out.println("Login valido");
        } else {
            System.out.println("Seu login nao e valido!");
        }
    }
    
   public String getPassword(){
       return this.password;
   }
    
    public void setPassword(String password){
        if( validatePassword(password) ){
            this.password = password;            
        } else {
            System.out.println("Sua senha nao e valido!");
        }
    }
    
}
