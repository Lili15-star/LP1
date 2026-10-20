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
        return ("A árvore da "+folhagem+" e da " +especie+" do tamanho "+tamanho+" caiu pois você cortou ela");
    }

    String cuidar(){
        return ("A árvore da "+folhagem+" e da " +especie+" do tamanho "+tamanho+" cresceu e floresceu porque você cuidou dela");
    }


}