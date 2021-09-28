package br.inatel.cdg.inimigo;

public class CavNegro extends Inimigo{

    //Constructor
    public CavNegro(double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void atacando() {
        System.out.println("Cavaleiro negro: "+this.nome+" atacando");
    }

    @Override
    public void tomarDano() {
        System.out.println("Cavaleiro negro: "+this.nome+" tomando dano");
    }
}
