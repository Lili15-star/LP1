public class Terno {
    private String cor;
    private String tamanho;
    private String tecido;

    public Terno (String cor, String tamanho, String tecido){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }

    void rasgar(){
        IO.println("Seu terno"+cor+ tamanho+" do tecido "+tecido+" rasgou");
    }
    void sujar (){
        IO.println("Seu terno"+cor+ tamanho+" do tecido "+tecido+" está sujo");
    }
    void passar (){
        IO.println("Seu terno"+cor+ tamanho+" do tecido "+tecido+" está passado");
    }
}
