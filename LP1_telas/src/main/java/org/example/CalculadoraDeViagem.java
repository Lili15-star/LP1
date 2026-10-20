package org.example;

import java.util.Scanner;

public class CalculadoraDeViagem {

    String calculadora(double DistanciaViagem,double ValorCombustivel) {//inserir dentro da string o que o usuário vai inserir
        double valorGasto = (double)0.0F;
        double desconto = (double)0.0F;String descontar = "";
        valorGasto = DistanciaViagem / (double)12.0F * ValorCombustivel;
        if (DistanciaViagem > (double)500.0F) {
            descontar = "Você ganhou um desconto de 5%";
            desconto = valorGasto * 0.05;
        }

        double total = valorGasto - desconto;
        return (descontar + " Para percorrer: " + DistanciaViagem + " Você irá gastar: " + total);
    }
}

