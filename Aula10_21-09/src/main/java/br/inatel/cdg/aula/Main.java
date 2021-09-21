package br.inatel.cdg.aula;

import br.inatel.cdg.aula.inimigos.*;

public class Main {

    public static void main(String[] args) {

        ZumbiLerdo z = new ZumbiLerdo(200,"Zumbi da hora", "Arma mt loka");
        CavaleiroNegro cn = new CavaleiroNegro(150,"Cavas", "Arma rapida");
        CavaleiroDePrata cp = new CavaleiroDePrata(250,"Cavas bombado", "Arma pesada");

        Inimigo ini1 = new ZumbiLerdo(300,"ZumbiIni","ArmaIni");
        Inimigo ini2 = z;

        z.ataque();
        ini2.ataque();
        z.imprimirAVidaDoZumbi();
        //ini2.imprimirAVidaDoZumbi(); --> Não reconhece pq a assinatura "imirmir..." não existe em tipo inimigo, só
        //zumbi lerdo. Fazer Upcasting:

        if(ini2 instanceof ZumbiLerdo){//Se trocar ini2 para outra forma, ele n converte
            ZumbiLerdo z1 = (ZumbiLerdo) ini2;
            z1.imprimirAVidaDoZumbi();
        }

    }

}
