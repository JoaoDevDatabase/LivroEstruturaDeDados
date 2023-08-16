package br.com.estudo.livro.estruturadedados.listascirculares;

public class ListaCircular<TIPO> {
    private No<TIPO> cabeca;
    private No<TIPO> calda;
    private int size;

    public ListaCircular() {
        this.cabeca = null;
        this.calda = null;
        this.size = 0;
    }

    public void add(TIPO conteudo){
        No<TIPO> novoNo = new No<>(conteudo);
        if (this.size == 0 ){
            this.cabeca = novoNo;
            this.cabeca.setNoProximo(calda);
            this.calda = this.cabeca;
        } else {
            novoNo.setNoProximo(this.calda);
            this.cabeca.setNoProximo(novoNo);
            this.calda = novoNo;
        }
        this.size++;
    }

    public void remove( int index){
        if (index >= this.size){
        throw new IndexOutOfBoundsException("O ÍNDICE E MAIOR QUE O TAMANHO DA LISTA");
        }
        No<TIPO> noAuxiliar = this.calda;
        if (index == 0 ){
            this.calda = this.calda.getNoProximo();
            this.cabeca.setNoProximo(this.calda);
        } else if(index == 1){
            this.calda.setNoProximo(this.calda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index -1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
    }

    private TIPO get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<TIPO> getNo(int index){
        if (this.isEmpty())// CASO A LISTA ESTEJA VAZIA ELE VAI ME RETORNAR ESTA ESCESSÃO
            throw new IndexOutOfBoundsException();

        if (index == 0){
            return this.calda;
        }
        No<TIPO> noAuxiliar = this.calda;
        for (int i =0; (i < index) && (noAuxiliar != null); i ++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
    public boolean isEmpty(){
        if (this.size == 0 ){
            return true;
        } else {
            return false;
        }
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
       String strRetorno = "";
       No<TIPO> noAuxiliar = this.calda;
       for (int i = 0 ; i < this.size; i++ ){
           strRetorno += "No[conteudo : " + noAuxiliar.getConteudo() + "}]--->";
           noAuxiliar = noAuxiliar.getNoProximo();
       }

       strRetorno += this.size != 0 ? "(RETORNA AO INICIO)" : "[]";
        return strRetorno;
    }
}
