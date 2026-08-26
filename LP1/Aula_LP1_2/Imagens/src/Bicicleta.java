public class Bicicleta {
    //atributos
    private String cor;
    private String modelo;
    private String marca;//o atributo fica com o dado mais recente

    public Bicicleta(String cor, String modelo,String marca){//temporário, intermediador
        this.cor = cor;
        this.marca=marca;
        this.modelo=modelo;
    }
    //métodos de acesso
    public String getCor(){
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void andar(){
        IO.println("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está andando.");

    }
    void quebrar(){
        IO.println("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está quebrada.");

    }
    void freiar(){
        IO.println("A bicicleta " + marca + " " + cor + ", da marca " + modelo + ", está freiada.");

    }

}
