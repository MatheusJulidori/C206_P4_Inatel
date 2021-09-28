package br.inatel.cdg.exercicioProposto.jogador;

public class Arqueiro extends Jogador{

    public Arqueiro(double vida, String nome, String tipoArma) {
        super(vida, nome, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro atacando");
    }
}
