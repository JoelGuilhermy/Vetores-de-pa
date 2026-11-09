package prj_vetor;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], indice, auxiliar;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("\nDivisores de " + vetA[indice]);

            for(auxiliar = 1; auxiliar <= vetA[indice]; auxiliar++) {
                if(vetA[indice] % auxiliar == 0) {
                    System.out.print(auxiliar + " ");
                }
            }
            System.out.println();
        }

        entrada.close();
    }
}
