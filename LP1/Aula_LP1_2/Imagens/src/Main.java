import java.util.Scanner;

public class Main {
    void main() {
        String cor;
        String textura;
        double tamanho;
        String tecido;
        int escolha;
        Scanner s = new Scanner(System.in);

        IO.println("\n Qual opção você deseja? \n" +
                "\n 1 Cabelo" +
                "\n 2 Camisa" +
                "\n 3 Coleção" +
                "\n 4 Bicicleta" +
                "\n 5 Mascara" +
                "\n 6 Gravata" +
                "\n 7 Pessoa" +
                "\n 8 Rosto" +
                "\n 9 Terno" +
                "\n 10 Árvore" +
                "\n 11 Exposição " +
                "\n 12 Desenho" );
                escolha = s.nextInt();

        if (escolha == 1) {
            IO.println("Qual é a cor do seu cabelo? ");
            cor = s.next();
            IO.println("Qual a cor que você vai pintar o seu cabelo?");
            cor = s.next();
            IO.println("Qual é o tamanho do seu cabelo? ");
            tamanho = s.nextDouble();
            IO.println("Qual é a textura do seu cabelo? ");
            textura = s.next();
            Cabelo a = new Cabelo(cor, tamanho, textura);
            a.pintar();
        }

        if (escolha == 2){
            Camisa a = new Camisa("Verde", " P", " algodãoViscose");
            a.secar();
        }
        if (escolha == 3){
            Colecao a = new Colecao("Xícara", 11,  400);
            a.adicionar();
        }
        if (escolha == 4) {
            Bicicleta a = new Bicicleta ("azul", " Montain bike", " Caloi");
            a.quebrar();
        }
        if (escolha == 5) {
            Mascara a = new Mascara("plástico", " quadriculada", " de festa");
            a.produzir();
        }
        if (escolha == 6){
            Gravata a = new Gravata("canelada", " listrada", " tradicional");
            a.pendurar();
        }
        if (escolha == 7){
            Pessoa a = new Pessoa("Lívia", 1.50, 19);
            a.correr();
        }
        if (escolha == 8){
            Rosto a = new Rosto("castanho claro", " pequeno", " rosada");
            a.hidratar();
        }
        if (escolha == 9){
            Terno a = new Terno ("azul escuro", " GG", " Algodão");
            a.passar();
        }
        if (escolha == 10) {
            Arvore a = new Arvore("tom-verde", " Eucalipto", 10);
            a.florescer();
        }
        if (escolha == 11){
            Exposicao a = new Exposicao(10/11/2026, " Museu do Impiranga", " esculturas");
            a.observar();
        }
        if (escolha == 12){
            Desenho a = new Desenho("Tarsila do Amaral", " modernismo brasileiro", "a zul, amarelo, verde, laranja");
            a.esbocar();
        }



    }
}