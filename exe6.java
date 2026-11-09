package prj_vetor;

public class exe6 {
    public static void main(String[] args) {
        final int TAMANHO = 11;
        int vetA[], indice, potencia;

        vetA = new int[TAMANHO];

        for(indice = 0; indice < TAMANHO; indice++) {
            potencia = 1;

            for(int auxiliar = 1; auxiliar <= indice; auxiliar++) {
                potencia *= 2;
            }

            vetA[indice] = potencia;
        }

        for(indice = 0; indice < TAMANHO; indice++) {
            System.out.println("A[" + indice + "] = " + vetA[indice]);
        }
    }
}
