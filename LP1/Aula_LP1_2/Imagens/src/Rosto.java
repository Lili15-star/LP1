public class Rosto {
    private String cor_olho;
    private String tamanho_nariz;
    private String cor_boca;

    public Rosto (String cor_olho_olho, String tamanho_nariz, String cor_olho_boca){
        this.cor_olho = cor_olho;
        this.tamanho_nariz = tamanho_nariz;
        this.cor_boca = cor_boca;
    }

    void hidratar(){
        IO.println("Seu rosto com o olho "+cor_olho+ " e tamanho do nariz "+tamanho_nariz+" com a cor da boca "+cor_boca+" está hidratado");
    }
    void limpar (){
        IO.println("Seu rosto com o olho "+cor_olho+ " e tamanho do nariz "+tamanho_nariz+" com a cor da boca "+cor_boca+" está limpo");
    }
    void maquiar (){
        IO.println("Seu terno"+cor_olho+ tamanho_nariz+" do tecido "+cor_boca+" está com maquiagem");
    }
}

