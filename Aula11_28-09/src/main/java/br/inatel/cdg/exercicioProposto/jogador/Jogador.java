package br.inatel.cdg.exercicioProposto.jogador;

public abstract class Jogador {

    protected double vida;
    protected String nome;
    protected String tipoArma;

    public Jogador(double vida, String nome, String tipoArma) {
        this.vida = vida;
        this.nome = nome;
        this.tipoArma = tipoArma;
    }


    public abstract void atacar();

    public void mostraInfo(){
        System.out.println("Vida: " +this.vida);
        System.out.println("Nome: " +this.nome);
        System.out.println("Tipo de arma: " +this.tipoArma);
    }


    public double getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoArma() {
        return tipoArma;
    }
}
