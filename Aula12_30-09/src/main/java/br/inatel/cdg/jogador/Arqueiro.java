package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Inimigo;

public class Arqueiro extends Jogador {


    @Override
    public void atacar(Inimigo ini){
        ini.atacando();
    }
}