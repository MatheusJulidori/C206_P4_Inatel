package br.inatel.cdg;


import br.inatel.cdg.inimigo.*;
import br.inatel.cdg.jogador.Jogador;

public class Main {

    public static void main(String[] args) {

        ZumbiLerdo z1 = new ZumbiLerdo(200,"ZumbiLerdao");
        CavNegro c1 = new CavNegro(150,"ChavesBK");

        Inimigo ini = new ZumbiLerdo(100,"ChapoLerdo");

        Jogador j1 = new Jogador();
        j1.atacando(ini);
        j1.atacando(z1);
        j1.atacando(c1);

    }

}
