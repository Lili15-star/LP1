public class Arvore {
    private String folhagem;
    private String especie;
    private int tamanho;

    public Arvore (String folhagem, String especie, int tamanho){
        this.folhagem = folhagem;
        this.especie = especie;
        this.tamanho = tamanho;
    }

    void cair(){
        IO.println("A folha da "+folhagem+" e da " +especie+" do tamanho "+tamanho+" caiu");
    }
    void crescer (){
        IO.println("A árvore da "+folhagem+" e da " +especie+" do tamanho "+tamanho+" cresceu");
    }
    void florescer (){
        IO.println("A árvore da "+folhagem+" e da " +especie+" do tamanho "+tamanho+" floresceu");
    }
}


