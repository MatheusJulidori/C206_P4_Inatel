package br.inatel.cdg.aula.inimigos;

public class CavaleiroDePrata extends Inimigo {

    public CavaleiroDePrata(double vida, String nome, String tipoArma) {
        super(vida,nome,tipoArma);
    }

    public void ataqueForte(){
        System.out.println("Atacando fortemente!");
    }


}
