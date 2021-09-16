package br.inatel.cdg.inimigos;

public class Inimigo {

    protected double vida;
    protected String nome;
    protected String tipoArma;

    public Inimigo(double vida, String nome, String tipoArma) {
        this.vida = vida;
        this.nome = nome;
        this.tipoArma = tipoArma;
    }

    public void ataque(){
        System.out.println("Inimigo " + this.nome + " atacando o jogador!");
    }

    public void tomarDano(){
        System.out.println("Inimigo " + this.nome + " tomando dano");
    }

    public void andar(){
        System.out.println("Inimigo " + this.nome + " andando" );
    }



    public void mostraInfo(){
        System.out.println(nome);
        System.out.println(vida);
        System.out.println(tipoArma);
    }


    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
