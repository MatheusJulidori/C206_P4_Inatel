package br.inatel.cdg.exercicioProposto;

import br.inatel.cdg.exercicioProposto.jogador.*;

public class Main {

    public static void main(String[] args) {


        Jogador m = new Mago(70,"Gandalf","Cajado");
        Jogador a = new Arqueiro(60,"Legolas","Arco");
        Jogador g = new Guerreiro(100,"Gimli","Machado");

        a.atacar();
        g.atacar();
        m.atacar();

        a.mostraInfo();
        g.mostraInfo();
        m.mostraInfo();

    }

}
