package br.inatel.cdg;

import br.inatel.cdg.inimigos.CavaleiroDePrata;
import br.inatel.cdg.inimigos.CavaleiroNegro;
import br.inatel.cdg.inimigos.ZumbiLerdo;

public class Main {

    public static void main(String[] args) {

        ZumbiLerdo z = new ZumbiLerdo(200,"Zumbi da hora", "Arma mt loka");
        CavaleiroNegro cn = new CavaleiroNegro(150,"Cavas", "Arma rapida");
        CavaleiroDePrata cp = new CavaleiroDePrata(250,"Cavas bombado", "Arma pesada");

        z.ataque();
        cn.ataqueRapido();
        cp.ataqueForte();
        cn.ataque();
        cp.ataque();
        z.andar();
        cp.tomarDano();
        z.mostraInfo();
        cn.mostraInfo();
        cp.mostraInfo();


    }

}
