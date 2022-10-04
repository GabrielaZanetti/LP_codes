package com.acme.exercicio_aula;

/**
 *
 * @author gabii
 */
public class SequenciaFibonacci {
    
    public static void main(String[] args) {
        long[] valor = generateNumbers(10);
        for (long v : valor){
            System.out.println(v);
        }
    }
    public static long[] generateNumbers(int x){
        long[] number = new long[x];
        number[0] = 0;
        number[1] = 1;
        for(int i = 2; i < x; i++){
            number[i] = number[i-1] + number[i-2];
        }
        return number;
    }
}