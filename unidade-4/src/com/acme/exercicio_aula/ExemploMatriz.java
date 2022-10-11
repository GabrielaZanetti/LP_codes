package com.acme.exercicio_aula;

/**
 * Exemplo de criacao de matriz
 * @author gabii
 */
public class ExemploMatriz {

    public static void main(String[] args) {
        char[][] m = { {'A', 'D', 'F', 'P'},
                       {'G', 'B', 'E', 'Q'},
                       {'J', 'H' , 'C', 'W'},
                       {'L', 'L', 'I', 'Z'} 
                     };
//        System.out.println(m[2][2]);
        System.out.println('{');
        for( int l = 0; l < 4; l++){
            System.out.print('{');
            for( int c = 0; c < 4; c++){
                System.out.print("'"+ m[l][c]+"' ");    
                if (c != 3){
                    System.out.print(", ");
                }
            }
            System.out.println('}');
        }
        System.out.println('}');
    }
}
