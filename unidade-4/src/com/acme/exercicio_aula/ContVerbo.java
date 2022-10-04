package com.acme.exercicio_aula;

/**
 *
 * @author gabii
 */
public class ContVerbo {
    public static void main(String[] args) {
        /*
        *   Verificacao de valores dentro de string
        */
        String texto = "De acordo ar com o percusso de investigações sobre o texto, nas mais diversas correntes teóricas que "+
                       "se debruçam er sobre esse objeto o conceito foi se modificando e se ampliando Hoje o texto não é "+
                       "considerado uma ir estrutura pronta com unidade de sentido completa pois consideram-se também os processos "+
                       "de planejamento,construção e recepção do texto.";
        texto = clearText(texto);
        
        String[] palavras = texto.split(" ");
        
        int ar = 0;
        int er = 0;
        int ir = 0;
        
        for (String p : palavras){
            if (p.endsWith("ar")){
                ar++;
            }
            if (p.endsWith("er")){
                er++;
            }
            if (p.endsWith("ir")){
                ir++;
            }
        }
        System.out.println("Existem "+ar+" ar");
        System.out.println("Existem "+er+" er");
        System.out.println("Existem "+ir+" ir");
    }
    
    public static String clearText(String t){
        String res = t.replace(",", "");
        return res;
    }
}