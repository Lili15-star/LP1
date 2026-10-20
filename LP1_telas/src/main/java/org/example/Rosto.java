package org.example;

public class Rosto {
    String cor_olho;
    String tamanho_nariz;
    String cor_boca;

    public Rosto (String cor_olho, String tamanho_nariz, String cor_boca){
        this.cor_olho = cor_olho;
        this.tamanho_nariz = tamanho_nariz;
        this.cor_boca = cor_boca;
    }

    String hidratar(){
        return ("Eu estou com o meu rosto hidratado, que tem os olhos na cor " + cor_olho + ", nariz de tamanho " + tamanho_nariz + " e boca na cor " + cor_boca);
    }

    String limpar (){
        return ("Eu limpei o meu rosto, que tem os olhos na cor " + cor_olho + ", nariz de tamanho " + tamanho_nariz + " e boca na cor " + cor_boca);
    }

    String maquiar (){
        return ("Eu me maquiei, destacando os olhos na cor " + cor_olho + ", o nariz de tamanho " + tamanho_nariz + " e a boca na cor " + cor_boca);
    }
}