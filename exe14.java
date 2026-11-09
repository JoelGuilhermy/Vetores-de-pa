package prj_vetor;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], vetB[], indice;

        vetA = new int[TAMANHO];
        vetB = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            if(vetA[indice] % 2 == 0) {
                vetB[indice] = 1;
            } else {
                vetB[indice] = 0;
            }
        }

        System.out.println("Vetor B:");
        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.print(vetB[indice] + " ");
        }

        entrada.close();
    }
}
