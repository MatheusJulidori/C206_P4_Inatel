package br.inatel.cdg.principal;

import br.inatel.cdg.bloco.Bloco;

public class Principal {

    public static void main(String[] args) {
        Bloco b1 = new Bloco(10);
        Bloco b2 = new Bloco(12);
        Bloco b3 = new Bloco(13);

        System.out.println(Bloco.getCont());
        System.out.println(b1.getVida());
        System.out.println(b2.getVida());
        System.out.println(b3.getVida());
    }
}
