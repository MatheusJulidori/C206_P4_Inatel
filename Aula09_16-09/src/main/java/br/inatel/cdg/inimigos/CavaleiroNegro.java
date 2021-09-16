package br.inatel.cdg.inimigos;

import br.inatel.cdg.Main;

public class CavaleiroNegro extends Inimigo{

    public CavaleiroNegro(double vida, String nome, String tipoArma) {
        super(vida,nome,tipoArma);
    }

    public void ataqueRapido(){
        System.out.println("Atacando rapidamente!");
    }

}
