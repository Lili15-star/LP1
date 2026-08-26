public class Exposicao {
    private int dia;
    private String local;
    private String artes;

    public Exposicao(int dia, String local, String artes){
        this.local = local;
        this.dia = dia;
        this.artes = artes;
    }

    public int getDia(){
        return dia;
    }
    public String getLocal(){
        return local;
    }
    public String getArtes(){
        return artes;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public void setArtes(String artes){
        this.artes = artes;
    }

    void organizar(){
        IO.println("Está sendo organizado uma exposição " + artes + " para o dia " + dia + ", e vai ser no " + local);
    }
    void visitar(){
        IO.println("Irei visitar uma exposição de " + artes + " no dia " + dia);
    }
    void observar(){
        IO.println("Vou ir observar uma exposição " + artes);
    }
}
