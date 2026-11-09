package prj_vetor;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int vetA[], vetB[], vetC[], indice, auxiliar, quantidade = 0, valor;
        boolean encontrado;

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
            for(auxiliar = 0; auxiliar < TAMANHO; auxiliar++) {
                if(vetA[indice] == vetB[auxiliar]) {
                    encontrado = false;

                    for(valor = 0; valor < quantidade; valor++) {
                        if(vetC[valor] == vetA[indice]) {
                            encontrado = true;
                        }
                    }

                    if(encontrado == false) {
                        vetC[quantidade] = vetA[indice];
                        quantidade++;
                    }

                    break;
                }
            }
        }

        System.out.println("C = [");
        for(indice = 0; indice < quantidade; indice++) {
            System.out.print(vetC[indice] + " ");
        }
        System.out.println("]");

        entrada.close();
    }
}
