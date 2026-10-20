package org.example;

public class Mascara {
    String material;
    String estampa;
    String estilo;

    public Mascara (String material, String estampa, String estilo){
        this.material = material;
        this.estampa = estampa;
        this.estilo = estilo;
    }

    String pendurar(){
        return ("Você pendurou sua máscara de " + material + ", com estampa " + estampa + " e estilo " + estilo);
    }

    String restaurar(){
        return ("Você conseguiu restaurar sua máscara de " + material + ", com estampa " + estampa + " e estilo " + estilo);
    }

    String produzir(){
        return ("Você produziu a sua própria máscara de " + material + ", com estampa " + estampa + " e estilo " + estilo);
    }
}