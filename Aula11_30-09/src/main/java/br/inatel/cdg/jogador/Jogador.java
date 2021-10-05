package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Inimigo;

public abstract class Jogador {

    public void atacar(Inimigo ini){
        ini.atacando();
    }

}