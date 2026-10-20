package org.example;

public class Camisa {
    String cor;
    String tamanho;
    String tecido;

    public Camisa(String cor, String tamanho, String tecido){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tecido = tecido;
    }

    String lavar() {
        return ("Eu lavei a minha camisa de tecido " + tecido + ", cor " + cor + ", com tamanho " + tamanho + ".");
    }

    String costurar() {
        return ("Eu costurei a minha camisa de tecido " + tecido + ", cor " + cor + ", com tamanho " + tamanho + " e agora ela está consertada.");
    }

    String secar() {
        return ("Eu sequei a minha camisa de tecido " + tecido + ", cor " + cor + ", com tamanho " + tamanho + " e ela está pronta para ser usada.");
    }
}