package br.inatel.cdg.zumbi;

public class Zumbi {

    private double vida;
    private String tipo;

    public Zumbi(double vida, String tipo){
        this.vida = vida;
        this.tipo = tipo;
    }

    public void atacar(){
        System.out.println("Zumbi: " + tipo + " atacou!");
    }

    //getter e setter
    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return tipo ;
    }

    public void setNome(String tipo) {
        this.tipo = tipo;
    }
}
