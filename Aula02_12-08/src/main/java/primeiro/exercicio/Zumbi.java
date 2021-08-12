package primeiro.exercicio;

public class Zumbi {

    public Zumbi(double vida,double dano){
        this.vida = vida;
        this.dano = dano;
        this.vivo = true;
    }

    private double vida;
    private final double dano;
    private boolean vivo;


    double morder(int dado){

        return dado*dano;
    }

    double getVida(){
        return vida;
    }

    void tomarDano(double danoRecebido){
        System.out.println("Vida anterior: "+ this.vida);
        vida -= danoRecebido;
        System.out.println("Vida atual: "+ this.vida);
        if(vida <= 0) {
            this.vivo = false;
            System.out.println("Zumbi morreu");
        }
    }

    void zumbiMorto(){
        if(this.vivo) System.out.println("Zumbi está vivo");
        else System.out.println("Zumbi está morto");
    }





}
