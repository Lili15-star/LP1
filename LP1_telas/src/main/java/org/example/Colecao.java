package org.example;

public class Colecao {
    String tipo_arte;
    int quantidade;
    int valor;

    public Colecao(String tipo_arte, int quantidade, int valor) {
        this.tipo_arte = tipo_arte;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    String adicionar(){
        quantidade = quantidade + 1;
        return ("Eu adicionei 1 item na minha coleção de " + tipo_arte + ". A quantidade atual é " + quantidade + " e o valor estimado agora é mais de R$ " + valor);
    }

    String retirar(){
        quantidade = quantidade - 1;
        return ("Eu retirei 1 item da minha coleção de " + tipo_arte + ". Agora restaram " + quantidade + " unidades e o valor estimado é menos de R$ " + valor);
    }

    String guardar(){
        return ("Eu guardei a minha coleção de " + tipo_arte + ", contendo " + quantidade + " unidades e valor estimado de R$ " + valor + ", no meu armário");
    }
}