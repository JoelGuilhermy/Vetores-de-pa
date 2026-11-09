package prj_vetor;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], indice, valor;
        boolean achou = false;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("Digite o valor de A " + (indice+1));
            vetA[indice] = entrada.nextInt();
        }

        System.out.println("Digite o numero que deseja buscar:");
        valor = entrada.nextInt();

        for(indice = 0; indice < TAMANHO; indice++) {
            if(vetA[indice] == valor) {
                achou = true;
                break;
            }
        }

        if(achou == true) {
            System.out.println("Numero encontrado!");
        } else {
            System.out.println("Numero nao encontrado!");
        }

        entrada.close();
    }
}
