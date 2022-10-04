package com.acme.exercicio_aula;

/**
 *
 * @author gabii
 */
public class SequenciaFibonacci {
    
    public static void main(String[] args) {
        OperationFibiocci num = new OperationFibiocci();
        int[] valor = num.generateNumbers();
        for (int v : valor){
            System.out.println(v);
        }
    }
}