package br.inatel.cdg.exercicioProposto.jogador;

public class Mago extends Jogador{

    public Mago(double vida, String nome, String tipoArma) {
        super(vida, nome, tipoArma);
    }

    @Override
    public void atacar() {
        System.out.println("Mago atacando");
    }
}
