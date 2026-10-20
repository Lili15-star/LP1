package org.example;

import java.util.Scanner;

public class AluguelDeCarro {

    String alugar(int quilometro, int qntd_dias) { //metodo(ação que os objetos da classe vão fazer)
        int limite = 100; String ultrapassar = "";
        double adicional = (double) 0.0F;
        double diaria = (double) (60 * qntd_dias);
        if (quilometro > 100) {
            adicional = (double) (15 * (quilometro - 100));
            ultrapassar =  "Você ultrapassou o limite pois seu quilometro foi " + quilometro;
        }

            double aluguel = diaria + adicional;
            return (ultrapassar + " O valor do seu aluguel é: " + aluguel);
        }

    }

