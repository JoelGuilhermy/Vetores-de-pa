package prj_vetor;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 15;
        int vetA[], vetB[], indice, auxiliar;

        vetA = new int[TAMANHO];
        vetB = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1) +
                               " (use um valor entre 0 e 12)");
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            vetB[indice] = 1;

            for(auxiliar = 1; auxiliar <= vetA[indice]; auxiliar++) {
                vetB[indice] = vetB[indice] * auxiliar;
            }
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("A: " + vetA[indice] + " B: " + vetB[indice]);
        }

        entrada.close();
    }
}
