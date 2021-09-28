package br.inatel.cdg.exercicioProposto.jogador;

public class Guerreiro extends Jogador{

    public Guerreiro(double vida, String nome, String tipoArma) {
        super(vida, nome, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro atacando");
    }
}
