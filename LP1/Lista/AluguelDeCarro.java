import java.util.Scanner;

public class AluguelDeCarro {
    void main (){
    int qntd_dias;
    int quilometro;
    int limite = 100;
    double aluguel;
    double diaria;
    double adicional = 0;
    Scanner s=new Scanner (System.in);
    IO.println("Quantas diárias você irá querer com o carro?");
    qntd_dias = s.nextInt();
    IO.println("Quantos Km você você andou?");
    quilometro = s.nextInt();
    diaria = 60*qntd_dias;
    if (quilometro > 100 ) {
        adicional = 15 * (quilometro - 100);
        IO.println("Você ultrapassou o limite");
    }
    aluguel = diaria+adicional;
    IO.println("O valor do seu aluguel é: " + aluguel);
    }
}
