package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Inimigo;

public class Mago extends Jogador implements Curavel,Voar{

    @Override
    public void curar() {
        System.out.println("Mago curando");
    }

    @Override
    public void atacar(Inimigo ini){
        ini.atacando();
    }

    @Override
    public void voaMuleque() {
        System.out.println("Mago voando ao infinito e além");
    }
}