package br.com.estudo.livro.estruturadedados.listascirculares;

public class No<TIPO> {
    private TIPO conteudo;
    private No<TIPO> NoProximo;

    public No(TIPO conteudo) {
        this.conteudo = conteudo;
        this.NoProximo = null;
    }

    public No<TIPO> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(No<TIPO> noProximo) {
        NoProximo = noProximo;
    }

    public TIPO getConteudo() {
        return conteudo;
    }

    public void setConteudo(TIPO conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
