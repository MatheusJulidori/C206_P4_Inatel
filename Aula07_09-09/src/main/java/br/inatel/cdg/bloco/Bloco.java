package br.inatel.cdg.bloco;

public class Bloco {

    private static int cont;
    private int vida;

    public Bloco(int vida){
        cont++;
        this.vida = vida;
    }

    public static int getCont(){
        return cont;
    }

    public int getVida(){
        return this.vida;
    }
}
