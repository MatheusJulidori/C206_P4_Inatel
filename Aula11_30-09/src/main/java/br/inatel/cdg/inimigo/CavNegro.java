package br.inatel.cdg.inimigo;

import br.inatel.cdg.jogador.Curavel;

public class CavNegro extends Inimigo implements Curavel {

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

    @Override
    public void curar() {
        vida += 40;
        System.out.println("Curando");;
    }
}