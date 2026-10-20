package org.example;

public class Bicicleta {
    String cor;
    String marca;
    String modelo;

    public Bicicleta(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    String andar (){
        return ("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está andando normalmente.");}
    String quebrar (){
        return ("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está quebrada.");}

    String freiar (){
       return ("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está freiada.");}
}
