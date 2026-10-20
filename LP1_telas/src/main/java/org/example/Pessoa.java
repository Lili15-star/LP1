package org.example;

public class Pessoa {

    String nome;
    int idade;
    double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome; //"Pegue o nome que a tela me entregou (nome) e guarde na minha gaveta de nome (this.nome)"
        this.idade = idade;
        this.altura = altura;
    }


    String correr() {
        return (nome + " de " + idade + " anos e " + altura + " de altura preferiu correr");
    }

    String pedalar() {
        return (nome + " de " + idade + " anos e " + altura + " de altura preferiu pedalar");
    }

    String treinar() {
        return (nome + " de " + idade + " anos e " + altura + " de altura preferiu treinar");
    }
}