package org.example;

public class Arvore {

    String folhagem;
    String especie;
    Double tamanho;

    public Arvore (String folhagem, String especie, Double tamanho) {
        this.folhagem = folhagem;
        this.especie = especie;
        this.tamanho = tamanho;
    }

    String cortar(){
        return ("A árvore de folhagem "+folhagem+" e da espécie " +especie+" do tamanho "+tamanho+ " metros"+" caiu pois você cortou ela");
    }

    String cuidar(){
        return ("A árvore de folhagem "+folhagem+" e da espécie " +especie+" do tamanho "+tamanho+" metros"+" cresceu e floresceu porque você cuidou dela");
    }


}