package br.inatel.cdg.aula.inimigos;

public class ZumbiLerdo extends Inimigo{

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
}
