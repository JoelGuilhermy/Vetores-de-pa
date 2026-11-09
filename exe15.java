package prj_vetor;

import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], vetB[], vetC[], indice;

        vetA = new int[TAMANHO];
        vetB = new int[TAMANHO];
        vetC = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite B " + (indice+1));
            vetB[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            if(vetA[indice] > vetB[indice]) {
                vetC[indice] = 1;
            } else if(vetA[indice] == vetB[indice]) {
                vetC[indice] = 0;
            } else {
                vetC[indice] = -1;
            }
        }

        System.out.println("Vetor C:");
        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.print(vetC[indice] + " ");
        }

        entrada.close();
    }
}
