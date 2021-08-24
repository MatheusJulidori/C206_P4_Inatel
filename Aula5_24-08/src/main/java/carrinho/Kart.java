package carrinho;

public class Kart {

    public String nome;
    public Motor motor;
    public Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    public void pular(){
        System.out.println("carrinho.Kart " + this.nome + " pulando");
    }

    public void fazerDrift(){
        System.out.println("carrinho.Kart " + this.nome + " driftando");
    }

    public void soltarTurbo(){
        System.out.println(piloto.nome + " ou Toretto 2.0? "+this.nome + " " + motor.cilindradas+" cilindradas voando a " + motor.velocidadeMaxima + "km/h");
    }
}
