public class Camisa {
    //atributos
    private String cor;
    private String tamanho;
    private String tecido;

    //construtor
    public  Camisa(String cor, String tamanho, String tecido){ //parametros entre parenteses, diferente do atributo
        // o construtor obriga o usuário a colocar parametro quando criar o objeto
        this.cor = cor;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }
    void lavar() {//metodo
        IO.println("A sua camisa " + tecido +" "+ cor + " com " + tamanho + "cm de comprimento está lavada.");
    }
    void costurar() {
        IO.println("o seu cabelo " + tecido +" "+ cor + " com " + tamanho + "cm de comprimento foi costurada e agora está concertada.");
    }
    void secar() {
        IO.println("o seu cabelo " + tecido +" "+ cor + " com " + tamanho + "cm de comprimento está seca e pronta para ser usada.");
    }
}