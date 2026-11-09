package prj_vetor;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], indice, auxiliar, divisores;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            divisores = 0;

            for(auxiliar = 1; auxiliar <= vetA[indice]; auxiliar++) {
                if(vetA[indice] % auxiliar == 0) {
                    divisores = divisores + 1;
                }
            }

            if(divisores == 2) {
                System.out.println(vetA[indice] + " e primo");
            } else {
                System.out.println(vetA[indice] + " nao e primo");
            }
        }

        entrada.close();
    }
}
