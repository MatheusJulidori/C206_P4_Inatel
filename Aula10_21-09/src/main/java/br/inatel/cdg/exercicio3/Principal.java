package br.inatel.cdg.exercicio3;

import br.inatel.cdg.exercicio3.inimigos.*;
import br.inatel.cdg.exercicio3.jogador.Jogador;

public class Principal {

    public static void main(String[] args) {

        ZumbiLerdo z = new ZumbiLerdo(200,"Zumbi da hora", "Arma mt loka");
        CavaleiroNegro cn = new CavaleiroNegro(150,"Cavas", "Arma rapida");
        CavaleiroDePrata cp = new CavaleiroDePrata(250,"Cavas bombado", "Arma pesada");

        Jogador j1 = new Jogador();
        j1.atacar(z);
        j1.atacar(cn);
        j1.atacar(cp);


    }

}
