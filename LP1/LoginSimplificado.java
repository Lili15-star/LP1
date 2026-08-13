import java.util.Scanner;

public class LoginSimplificado {
    void main(){
        int SenhaCorreta;
        int SenhaDoUsuario;
        SenhaCorreta = 1234;
        Scanner s = new Scanner(System.in);
        IO.println("Digite a senha");
        SenhaDoUsuario = s.nextInt();
        if (SenhaDoUsuario == SenhaCorreta) IO.println("Acesso permitido");
        else IO.println("Acesso negado");

    }
}
