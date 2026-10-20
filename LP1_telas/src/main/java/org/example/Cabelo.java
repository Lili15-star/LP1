package org.example;

public class Cabelo {
    String cor;
    Double tamanho;
    String textura;

    public Cabelo(String cor, Double tamanho, String textura) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.textura = textura;
    }

    String cortar() {
        return ("Você cortou o seu cabelo da textura " + textura + " da cor " + cor + " e do tamanho " + tamanho + " cm de compriemnto");
    }
    String lavar() {
        return ("Você lavou o seu cabelo da textura " + textura + " da cor " + cor + " e do tamanho " + tamanho + " cm de compriemnto");
    }

    String escovar() {
        return ("Você escovou o seu cabelo da textura " + textura + " da cor " + cor + " e do tamanho " + tamanho + " cm de compriemnto");
    }

}
