package org.example;

public class Terno {
    String cor;
    String tamanho;
    String tecido;

    public Terno (String cor, String tamanho, String tecido){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }

    String rasgar(){
        return ("Eu acabei rasgando o meu terno de cor " + cor + ", tamanho " + tamanho + ", feito de " + tecido);
    }

    String sujar (){
        return ("Eu acabei sujando o meu terno de cor " + cor + ", tamanho " + tamanho + ", feito de " + tecido);
    }

    String passar (){
        return ("Eu passei o meu terno de cor " + cor + ", tamanho " + tamanho + ", feito de " + tecido);
    }
}