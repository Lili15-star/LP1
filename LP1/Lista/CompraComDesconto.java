import java.util.Scanner;

public class CompraComDesconto {
    void main(){
        double soma, valor_arroz,valor_feijao,valor_oleo,valor_acucar,valor_cafe,valor_macarrao,valor_farinha;
        double valor_fuba,valor_molho,valor_sal,desconto;
        desconto = 0;
        Scanner s=new Scanner(System.in);
        IO.println("Digite o valor do arroz (tipo 1,5kg):");
        valor_arroz = s.nextDouble();
        IO.println("Digite o valor de feijão (carioca ou preto, 1kg a 2kg):");
        valor_feijao = s.nextDouble();
        IO.println("Digite o valor do óleo de soja, 900ml):");
        valor_oleo = s.nextDouble();
        IO.println("Digite o valor do açucar (refinado ou cristal, 1kg):");
        valor_acucar = s.nextDouble();
        IO.println("Digite o valor do Café (torrado ou moído, 250g ou 500g:");
        valor_cafe = s.nextDouble();
        IO.println("Macarrão (espaguete ou parafuso, 500g):");
        valor_macarrao = s.nextDouble();
        IO.println("Farinha de mandioca ou de trigo (1 kg ou 500g):");
        valor_farinha = s.nextDouble();
        IO.println("Fubá de milho (500g):");
        valor_fuba = s.nextDouble();
        IO.println ("Molho ou extrato de tomate (300 g):");
        valor_molho = s.nextDouble();
        IO.println ("Sal refinado (1 kg):");
        valor_sal = s.nextDouble();
        soma = valor_acucar+valor_arroz+valor_cafe+valor_farinha+valor_feijao+valor_fuba+valor_macarrao+valor_molho+valor_oleo+valor_sal;
        if (soma > 100)
            desconto= (soma*0.9);
        IO.println("Você conseguiu um desconto de 10%");
        IO.println("\n Nota fiscal \n" +
                "\n 1 Arroz tipo 1,5kg " + valor_arroz +
                "\n 1 Feijão carioca 1kg" + valor_feijao +
                "\n 1 Óleo de soja 900ml" + valor_oleo +
                "\n 1 Açucar refinado 1kg" + valor_acucar +
                "\n 1 Café torrado 250g" + valor_cafe +
                "\n 1 Macarrão espaguete 500g" + valor_macarrao +
                "\n 1 Farinha de mandioca 500g" + valor_farinha +
                "\n 1 Farinha Fubá de milho 500g" + valor_fuba +
                "\n 1 Molho de tomate 300g" + valor_molho +
                "\n 1 Sal refinado 1kg" + valor_sal +
                "\n Valor total sem desconto:" + soma +
                "\n Valor total com o desconto:" + desconto);
    }
}

