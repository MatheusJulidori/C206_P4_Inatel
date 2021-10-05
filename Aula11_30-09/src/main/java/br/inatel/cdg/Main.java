package br.inatel.cdg;

import br.inatel.cdg.cenario.CenarioCuravel;
import br.inatel.cdg.jogador.*;
import br.inatel.cdg.inimigo.*;

public class Main {

    public static void main(String[] args) {

        ZumbiLerdo z1 = new ZumbiLerdo(200,"ZumbiLerdao");
        CavNegro c1 = new CavNegro(150,"ChavesBK");

        c1.curar();

        Arqueiro arq = new Arqueiro();
        Mago m1 = new Mago();

        m1.curar();

        CenarioCuravel cenario = new CenarioCuravel();
        cenario.surgir(m1);
        //cenario.surgir(arq); ARqueiro nãe se cura;




    }

}
