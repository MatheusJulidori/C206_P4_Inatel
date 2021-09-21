package br.inatel.cdg.exercicio3.inimigos;

public class CavaleiroNegro extends Inimigo {

    public CavaleiroNegro(double vida, String nome, String tipoArma) {
        super(vida,nome,tipoArma);
    }

    public void ataqueRapido(){
        System.out.println("Atacando rapidamente!");
    }


    @Override
    public void tomarDano(){
        System.out.println("Cavaleiro Negro " + this.nome + " tomando dano");
    }
}
