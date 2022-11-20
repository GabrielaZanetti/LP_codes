package com.acme;

import java.util.ArrayList;

public class NomesMatriz {
    static void printArray(ArrayList arr, int tamanho){
        String posicao = (String) arr.get(0);
        System.out.print(posicao.length() + ": ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(arr.get(i));
            if (i < tamanho-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String nomes[][] = {{"Gabriel", "Ana", "Pedro", "Gabi", "Ivi", "Joao", "Rafael"},
                            {"Anderia", "Marcia", "Adalberto", "Rosangela", "Aline", "Walter", "Luis"},
                            {"Marilia", "Lia", "Fernanda", "Beatriz", "Gabriela", "Andressa", "Larissa"},
                            {"Laura", "Leticia", "Ema", "Lucas", "Saulo", "Yuri", "Sandro"}};
        
        ArrayList<String> listaNome_3 = new ArrayList<>();
        ArrayList<String> listaNome_4 = new ArrayList<>();
        ArrayList<String> listaNome_5 = new ArrayList<>();
        ArrayList<String> listaNome_6 = new ArrayList<>();
        ArrayList<String> listaNome_7 = new ArrayList<>();
        ArrayList<String> listaNome_8 = new ArrayList<>();
        ArrayList<String> listaNome_9 = new ArrayList<>();
        
        for (String[] nome : nomes) {
            for (String pessoa : nome) {
                switch(pessoa.length()) {
                    case 3 -> listaNome_3.add(pessoa);
                    case 4 -> listaNome_4.add(pessoa);
                    case 5 -> listaNome_5.add(pessoa);
                    case 6 -> listaNome_6.add(pessoa);
                    case 7 -> listaNome_7.add(pessoa);
                    case 8 -> listaNome_8.add(pessoa);
                    case 9 -> listaNome_9.add(pessoa);
                    default -> {
                    }
                }
            }
        }
        
        printArray(listaNome_3, listaNome_3.size());
        printArray(listaNome_4, listaNome_4.size());
        printArray(listaNome_5, listaNome_5.size());
        printArray(listaNome_6, listaNome_6.size());
        printArray(listaNome_7, listaNome_7.size());
        printArray(listaNome_8, listaNome_8.size());
        printArray(listaNome_9, listaNome_9.size());
    }    
}