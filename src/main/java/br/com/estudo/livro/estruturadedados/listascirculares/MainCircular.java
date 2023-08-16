package br.com.estudo.livro.estruturadedados.listascirculares;

public class MainCircular {
    public static void main(String[] args) {
        ListaCircular<String> listas = new ListaCircular<String>();
        listas.add("NO1");
        listas.add("NO2");
        listas.add("NO3");
        listas.add("NO4");
        listas.remove(3);
        System.out.println(listas);
    }
}
