package br.com.estudo.livro.estruturadedados.listasligadas;

public class Main {
    public static void main(String[] args) {
        ListasLigadas<String> listas = new ListasLigadas<String>();
        listas.adicionar("AC");
        listas.adicionar("SP");
        listas.adicionar("RJ");

        System.out.println("Primeiro-ELemento : " +listas.getPrimeiro().getValor());
        System.out.println("Último Valor: " + listas.getUltimo().getValor());
        System.out.println("Tamanho da Lista: " + listas.getTamanho());
        System.out.println(listas.get(0).getValor());
        System.out.println(listas.get(1).getValor());
        System.out.println(listas.get(2).getValor());

        // REMOVER ESTADO RJ
        listas.remover("AC");
        listas.remover("SP");
        listas.remover("RJ");
        System.out.println(listas.getTamanho());
        System.out.println("TODOS OS ELEMENTOS RMOVIDOS DA LISTA: TAMANHO DA LISTA = 0");
        listas.adicionar("RJ");
        System.out.println(listas.getTamanho());

    }
}
