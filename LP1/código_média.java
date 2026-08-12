public class Main {//classe 

    double media; //atributo da classe 

    public static void main(String[] args) { 

            // Média LP1 

        double p1,e1,e2,sub,x,api,exf; 

        double diferenca, base, parte1, parteApi; 

        double notaCalculada,notaFinal; 

        notaFinal = 0; 

        p1= 4.0; 

        e1=6.0; 

        e2=7.5; 

        sub=10.0; 

        api=8.7; 

        x=0.5; 

        exf=0.0; 

        base=(p1*0.5)+(e1*0.2)+(e2*0.3)+x+(sub*0.15); 

        parte1=base*0.5; 

        diferenca=base-5.9; 

        if(diferenca > 0) parteApi=api*0.5; 

        else parteApi=0; 

        notaCalculada=parte1+parteApi; 

        if (notaCalculada >= 6.0) { 

            notaFinal=notaCalculada; 

            System.out.println("Aluno aprovado sem exame final"); 

            } 

        else{ 

            if (notaCalculada >= 4.0){ 

                    exf=8.0; 

                    notaFinal=exf; 

                    System.out.println("Aluno aprovado com exame"); 

            } 

            else 

            System.out.println("Aluno não atingiu nota para exame final"); 

        } 

        System.out.println("Sua nota final foi "+ notaFinal); 

        if(notaFinal >= 6.0) System.out.println("Aluno aprovado"); 

        else System.out.println("Aluno reprovado"); 

    } 

} 

   
