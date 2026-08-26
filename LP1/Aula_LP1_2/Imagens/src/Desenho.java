public class Desenho {
    private String autor;
    private String estilo;
    private String cor;

    public Desenho (String autor, String estilo, String cor){
        this.autor = autor;
        this.estilo = estilo;
        this.cor = cor;
    }

    void esbocar(){
        IO.println("Seu desenho do "+autor+ "e do estilo "+estilo+" da cor "+cor+" foi esboçado");
    }
    void pintar (){
        IO.println("Seu desenho do "+autor+ "e do estilo "+estilo+" da cor "+cor+" está sendo pintado");
    }
    void apagar (){
        IO.println("Seu desenho do "+autor+ "e do estilo "+estilo+" da cor "+cor+" foi apagado");
    }
}


