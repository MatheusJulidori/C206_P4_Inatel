package br.inatel.cdg.exercicio3.jogador;

import br.inatel.cdg.exercicio3.inimigos.*;

public class Jogador {

    public void atacar(Inimigo ini1){
        System.out.println("Atacando o inimigo: " + ini1.getNome());
        ini1.tomarDano();
    }

}
