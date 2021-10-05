package br.inatel.cdg.inimigo;

public abstract class Inimigo {

    protected double vida;
    protected String nome;

    //Constructor
    public Inimigo(double vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }


    public abstract void atacando();

    public abstract void tomarDano();

    //Getter
    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }
}