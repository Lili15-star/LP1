package org.example;

public class CompraMercado {
    String somarCompra (double valorArroz, double valorFeijao, double valorOleo, double valorAcucar, double valorCafe, double valorMacarrao, double valorfarinah, double valorFuba){
    double total = valorArroz + valorFeijao + valorOleo + valorAcucar + valorCafe + valorMacarrao + valorfarinah + valorFuba;
    return ("Compra realizada com sucesso! O valor da sua compra ficou: R$" + total);
    }
}
