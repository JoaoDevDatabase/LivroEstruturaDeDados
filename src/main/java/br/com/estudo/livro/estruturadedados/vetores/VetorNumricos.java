package br.com.estudo.livro.estruturadedados.vetores;

public class VetorNumricos {
    public static void main(String[] args) {
        /*
        MANIPULAÇÃO DE VETOR COM NÚMEROS!
         */
        int[] vetor = new int[6];
        vetor[0] = 1;
        vetor[1] = 33;
        vetor[2] = 4;
        vetor[3] = 55;
        vetor[4] = 5;
        vetor[5] = 77;
        for (int i = 0; i < 6; i++){
            System.out.println(vetor[i]);
        }
    }
}
