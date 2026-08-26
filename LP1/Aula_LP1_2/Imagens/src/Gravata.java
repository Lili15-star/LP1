public class Gravata {
    private String textura;
    private String estampa;
    private String modelo;

    public Gravata (String textura, String estampa, String modelo){
        this.textura = textura;
        this.estampa = estampa;
        this.modelo = modelo;
    }

    void amarrar (){
        IO.println("Você amarrou a sua gravada de "+estampa);
    }
    void pendurar(){
        IO.println("Você pendurou a sua gravata do modelo "+modelo);
    }
    void cortar (){
        IO.println("Você precisou cortar a sua gravata "+textura+" pois você casou e usou ela para a gravata do casamento");
    }
}
