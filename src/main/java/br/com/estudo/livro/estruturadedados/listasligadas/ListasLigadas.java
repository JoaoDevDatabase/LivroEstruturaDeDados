package br.com.estudo.livro.estruturadedados.listasligadas;

public class ListasLigadas<TIPO> {
    private Elementos<TIPO> ultimo;
    private Elementos<TIPO> primeiro;
    private int tamanho;

    public ListasLigadas(){// METODO CONSTRUTOR CRIADO DE FORMA EXPLICITAMENTE
        this.tamanho = 0; // PASSANDO O TAMANHO DE MINHA LISTA QUANDO ELA FOR CRIADA
    }

    public Elementos<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elementos<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public Elementos<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elementos<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public int getTamanho() {

        return tamanho;
    }

    public void setTamanho(int tamanho) {

        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor){
        Elementos<TIPO> novoelemento = new Elementos<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoelemento;
            this.ultimo = novoelemento;
        } else {
            this.ultimo.setProximo(novoelemento);
            this.ultimo = novoelemento;
        }
        tamanho++;
    }
    public void remover(TIPO ValorComparado){
        Elementos<TIPO> atual = this.primeiro;
        Elementos<TIPO> anterior = null;
        for( int i = 0; i < this.getTamanho(); i++){
            if (atual.getValor().equals(ValorComparado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo){
                     this.ultimo = anterior;
                     anterior.setProximo(null);
                } else {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }
               this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public Elementos get(int posicao){
        Elementos atual = this.primeiro;
        for (int i = 0; i <posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
