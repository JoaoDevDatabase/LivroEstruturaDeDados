package br.com.estudo.livro.estruturadedados.listasligadas;

public class ProgramaInteiros {
    public static void main(String[] args) {
        ListasLigadas<Integer> listas = new ListasLigadas<Integer>();

        listas.adicionar(1);
        listas.adicionar(2);
        listas.adicionar(3);
        listas.adicionar(4);
        System.out.println(listas.get(0).getValor());
        System.out.println(listas.get(1).getValor());
        System.out.println(listas.get(2).getValor());
        System.out.println(listas.get(3).getValor());
    }
}
