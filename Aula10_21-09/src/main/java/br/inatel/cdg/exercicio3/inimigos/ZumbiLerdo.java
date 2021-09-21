package br.inatel.cdg.exercicio3.inimigos;

public class ZumbiLerdo extends Inimigo {

    public ZumbiLerdo( double vida, String nome, String tipoArma) {
        super(vida, nome, tipoArma);
    }

    public void imprimirAVidaDoZumbi(){
        System.out.println("Vida do zumbi: " + this.vida);
    }

    @Override
    public void ataque(){
        System.out.println("Ataque customizado do zumbi lerdo");
        super.ataque();
    }

    @Override
    public void tomarDano(){
        System.out.println("Zumbi lerdo " + this.nome + " tomando dano");
    }
}
