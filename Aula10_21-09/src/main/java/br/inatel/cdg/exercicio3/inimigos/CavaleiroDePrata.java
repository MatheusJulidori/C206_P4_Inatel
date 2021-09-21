package br.inatel.cdg.exercicio3.inimigos;

public class CavaleiroDePrata extends Inimigo {

    public CavaleiroDePrata(double vida, String nome, String tipoArma) {
        super(vida,nome,tipoArma);
    }

    public void ataqueForte(){
        System.out.println("Atacando fortemente!");
    }

    @Override
    public void tomarDano(){
        System.out.println("Cavaleiro de prata " + this.nome + " tomando dano");
    }
}
