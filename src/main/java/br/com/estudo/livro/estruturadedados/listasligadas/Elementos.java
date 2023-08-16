package br.com.estudo.livro.estruturadedados.listasligadas;

public class Elementos<TIPO> {
    private TIPO valor;
    private Elementos<TIPO> elemetos;

    private Elementos<TIPO> proximo;

    public Elementos(TIPO novoValor){
        this.valor = novoValor;
    }
    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elementos<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Elementos<TIPO> proximo) {
        this.proximo = proximo;
    }

    public Elementos<TIPO> getElemetos() {
        return elemetos;
    }

    public void setElemetos(Elementos<TIPO> elemetos) {
        this.elemetos = elemetos;
    }
}
