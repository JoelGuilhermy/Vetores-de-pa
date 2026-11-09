package prj_vetor;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 20;
        int vetA[], vetB[], indice, posPar = 0, posImpar = TAMANHO;

        vetA = new int[TAMANHO];
        vetB = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            if(vetA[indice] % 2 == 0) {
                vetB[posPar] = vetA[indice];
                posPar++;
            } else {
                posImpar--;
                vetB[posImpar] = vetA[indice];
            }
        }

        System.out.println("Vetor B:");
        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.print(vetB[indice] + " ");
        }

        entrada.close();
    }
}
