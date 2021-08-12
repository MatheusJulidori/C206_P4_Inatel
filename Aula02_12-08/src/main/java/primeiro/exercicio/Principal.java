package primeiro.exercicio;

public class Principal {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi(12,3);
        Zumbi zumbi2 = new Zumbi(12,3);

        double vida = zumbi1.getVida();
        System.out.println("Zumbi tem "+ vida+ " de vida");
        double dano = zumbi1.morder(3);
        System.out.println("Zumbi deu "+ dano+ " de dano");
        zumbi1.zumbiMorto();
        zumbi1.tomarDano(13);
        zumbi1.zumbiMorto();

        System.out.println("Zumbi 1 e 2 tem os mesmos dados, mas são diferentes,pois objetos são referencias na memória");
        System.out.println("Referencia do 1: "+ zumbi1);
        System.out.println("Referencia do 2: "+ zumbi2);

    }
}
