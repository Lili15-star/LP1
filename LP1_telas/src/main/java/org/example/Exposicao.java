package org.example;

public class Exposicao {
    String dia; // Mudado de int para String para aceitar barras (ex: 4/12/2026)
    String local;
    String artes;

    public Exposicao(String dia, String local, String artes){
        this.dia = dia;
        this.local = local;
        this.artes = artes;
    }

    String organizar(){
        return ("Está sendo organizado uma exposição " + artes + " para o dia " + dia + ", e vai ser no " + local);
    }

    String visitar(){
        return ("Irei visitar a exposição de " + artes + " no dia " + dia + ", que vai acontecer no " + local);
    }

    String observar(){
        return ("Vou ir observar a exposição " + artes + " no dia " + dia + ", lá no " + local);
    }
}