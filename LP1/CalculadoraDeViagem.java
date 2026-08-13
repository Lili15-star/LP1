import java.util.Scanner;

public class CalculadoraDeViagem {
    void main (){
        double DistanciaViagem;
        double ValorCombustivel;
        double total;
        double desconto;
        double valorGasto;
        valorGasto = 0;
        desconto = 0;
        Scanner s=new Scanner(System.in);
        IO.println("Qual a distância da sua viagem?");
        DistanciaViagem = s.nextDouble();
        IO.println("Qual é preço do combustível (por litro)?");
        ValorCombustivel = s.nextDouble();
        valorGasto = (DistanciaViagem/12) * ValorCombustivel;
        if (DistanciaViagem > 500){
            IO.println ("Você ganhou um desconto de 5%");
        desconto = valorGasto * 0.05;
        }
        total = valorGasto-desconto;
        IO.println("Para percorrer: " + DistanciaViagem + " Você irá gastar: " + total);


    }

}
