public class Mascara {
    private String material;
    private String estampa;
    private String estilo;

    public Mascara (String material, String estampa, String estilo){
        this.material = material;
        this.estampa = estampa;
        this.estilo = estilo;
    }

    void pendurar(){
        IO.println("Você pendurou sua máscara de " + material);
    }
    void restaurar (){
        IO.println("Você conseguiu restaurar sua máscara de "+material+"de "+estampa+estilo);
    }
    void produzir (){
        IO.println("Você produziu a sua própria máscara de "+material);
    }
}
