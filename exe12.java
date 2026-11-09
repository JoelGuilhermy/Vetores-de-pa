package prj_vetor;

import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 10;
        int senhas[], indice, opcao, qtd = 0, proximaSenha = 1;

        senhas = new int[TAMANHO];

        do {
            System.out.println("\n1 - Adicionar senhas");
            System.out.println("2 - Chamar senhas");
            System.out.println("3 - Sair");
            System.out.println("Escolha:");
            opcao = entrada.nextInt();

            if(opcao == 1) {
                if(qtd < TAMANHO) {
                    senhas[qtd] = proximaSenha;
                    System.out.println("Senha adicionada: " + senhas[qtd]);
                    qtd++;
                    proximaSenha++;
                } else {
                    System.out.println("Fila cheia!");
                }
            }

            if(opcao == 2) {
                if(qtd > 0) {
                    System.out.println("Senha chamada: " + senhas[0]);

                    for(indice = 0; indice < qtd-1; indice++) {
                        senhas[indice] = senhas[indice+1];
                    }

                    qtd--;
                } else {
                    System.out.println("Fila vazia!");
                }
            }

        } while(opcao != 3);

        entrada.close();
    }
}
