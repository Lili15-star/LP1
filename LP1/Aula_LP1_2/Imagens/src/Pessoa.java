public class Pessoa {

    private String nome;
    private double altura;
    private int idade;

    public Pessoa (String nome, double altura, int idade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    void correr (){
       IO.print(nome+" de "+idade+" anos de "+altura+" foi correr");
    }
    void pedalar(){
        IO.print(nome+" de "+idade+" anos de "+altura+" foi pedalar");
    }
    void gritar(){
        IO.print(nome+" de "+idade+" anos de "+altura+" esta gritando");
    }

}

