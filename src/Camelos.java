import java.util.Scanner;

public class Camelos {
    void main (){
        int Bereniz;
        int Hamaded;
        int Harim;
        int quantidadeDeCamelo;
        int contador;
        Scanner s=new Scanner (System.in);
        IO.println("Digite quantos camelos vai ser divido");
        quantidadeDeCamelo = s.nextInt();
        Bereniz = quantidadeDeCamelo/2;
        Hamaded = quantidadeDeCamelo/3;
        Harim = quantidadeDeCamelo/9;
      contador = quantidadeDeCamelo - (Bereniz+Hamaded+Harim);
      IO.println("\nDepois do contador adicionar mais um camelo o total foi 36 camelos sendo" +
               "\n Bereniz ficou com:" + Bereniz +
               "\n Hamaded ficou com:" + Hamaded +
              "\n Harim ficou com:" + Harim +
              "\n De pagamento para o contador é:" + contador);



    }
}
