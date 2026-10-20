package org.example;

public class Gravata {
    String textura;
    String estampa;
    String modelo;

    public Gravata (String textura, String estampa, String modelo){
        this.textura = textura;
        this.estampa = estampa;
        this.modelo = modelo;
    }

    String amarrar(){
        return ("Eu amarrei a minha gravata de textura " + textura + ", estampa " + estampa + " e modelo " + modelo);
    }

    String pendurar(){
        return ("Eu pendurei a minha gravata de textura " + textura + ", estampa " + estampa + " e modelo " + modelo);
    }

    String cortar(){
        return ("Eu precisei cortar a minha gravata de textura " + textura + ", estampa " + estampa + " e modelo " + modelo + " pois usei ela no casamento");
    }
}