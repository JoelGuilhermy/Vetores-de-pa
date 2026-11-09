package prj_vetor;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], vetB[], indice, auxiliar, total;

        vetA = new int[TAMANHO];
        vetB = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            total = 0;

            for(auxiliar = indice; auxiliar < TAMANHO; auxiliar++) {
                total += vetA[auxiliar];
            }

            vetB[indice] = total;
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("B[" + indice + "] = " + vetB[indice]);
        }

        entrada.close();
    }
}
