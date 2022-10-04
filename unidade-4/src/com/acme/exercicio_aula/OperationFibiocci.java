package com.acme.exercicio_aula;

public class OperationFibiocci {
    public int[] generateNumbers(){
        int[] number = new int[100];
        number[0] = 0;
        number[1] = 1;
        for(int i = 2; i < 100; i++){
            number[i] = number[i-1] + number[i-2];
        }
        return number;
    }
}
