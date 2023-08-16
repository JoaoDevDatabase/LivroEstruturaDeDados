package br.com.estudo.livro.estruturadedados.vetores;

import java.util.Scanner;


public class VetorString {
    public static void main(String[] args) {
       /*
       MANIPULAÇÃO DE VETOR EM STRING
        */
        String[] estados = new String[6];

        estados[0] = "RJ";
        estados[1] = "SP";
        estados[2] = "AC";
        estados[3] = "AM";
        estados[4] = "MS";
        estados[5] = "MG";

        for (int i = 0; i < estados.length;  i++){
            System.out.println("ESTADO --> " + estados[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----DIGITE A SILGA DO ESTADO QUE VOCE DESEJA VER NA LISTA : -----");
        String silgabusca = scanner.nextLine();
        for (int i = 0; i < estados.length; i++){
            String elementos = estados[i];
            if (elementos.equals(silgabusca)){
                System.out.println("ESTADO ENCONTRADO");
                break;
            } else {
                System.out.println("ESTADO NÃO ENCONTRADO NA LISTA");
                break;
            }
        }
    }


}
