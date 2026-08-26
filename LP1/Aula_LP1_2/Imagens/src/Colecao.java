public class Colecao {
    private String tipo_arte;
    private int quantidade;
    private int valor;

     //contrutor
    public Colecao(String tipo_arte, int quantidade, int valor) {
        this.tipo_arte = tipo_arte;
        this.quantidade = quantidade;
        this.valor = valor;
    }
        //métodos
        void adicionar(){
            quantidade = quantidade +1;
            IO.println("Você adicionou 1 xícara na sua coleção de "+tipo_arte+". Quantidade atual: " + quantidade);
        }
        void retirar(){
            quantidade = quantidade - 1 ;
            IO.println("Você reitrou uma xícara na sua coleção. Agora você tem " + quantidade);
        }
        void guardar(){
            IO.println("Você guardou sua coleção no seu armário");

        }

    }
