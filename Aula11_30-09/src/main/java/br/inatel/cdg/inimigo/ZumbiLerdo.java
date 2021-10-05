package br.inatel.cdg.inimigo;

public class ZumbiLerdo extends Inimigo{

    //Constructor
    public ZumbiLerdo(double vida, String nome) {
        super(vida, nome);
    }

    @Override
    public void atacando() {
        System.out.println("Zumbi lerdo: "+this.nome+" atacando");
    }

    @Override
    public void tomarDano() {
        System.out.println("Zumbi lerdo: "+this.nome+" tomando dano");
    }
}