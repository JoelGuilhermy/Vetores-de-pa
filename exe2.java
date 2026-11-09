package prj_vetor;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 5;
        int vetA[], indice, auxiliar;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("\nTabuada do " + vetA[indice]);

            for(auxiliar = 1; auxiliar <= 10; auxiliar++) {
                System.out.println(vetA[indice] + " valor " + auxiliar + " = " + (vetA[indice]*auxiliar));
            }
        }

        entrada.close();
    }
}
