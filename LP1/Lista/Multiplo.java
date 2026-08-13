import java.util.Scanner;

public class Multiplo {
    void main () {
        int num1;
        int num2;
        Scanner s=new Scanner(System.in);
        IO.println("Digite um número");
        num1=s.nextInt();
        IO.println("Digite outro número");
        num2=s.nextInt();
        if(num1%num2 == 0)
        IO.println("O primeiro é multiplo do segundo");
        else IO.println("O primeiro não é múltiplo do segundo");



    }
}
