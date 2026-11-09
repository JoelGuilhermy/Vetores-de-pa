package prj_vetor;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], indice;
        boolean ehPalindromo = true;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        for(indice = 0; indice < TAMANHO/2; indice++) {
            if(vetA[indice] != vetA[TAMANHO-1-indice]) {
                ehPalindromo = false;
                break;
            }
        }

        if(ehPalindromo == true) {
            System.out.println("O vetor e ehPalindromo!");
        } else {
            System.out.println("O vetor nao e ehPalindromo!");
        }

        entrada.close();
    }
}
