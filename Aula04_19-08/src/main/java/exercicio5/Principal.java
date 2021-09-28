package exercicio5;

public class Principal {

    public static void main(String[] args) {

        Ashen p1 = new Ashen();
        p1.vida = 40;
        p1.nome = "Yodami";
        p1.arma = new Arma();
        p1.arma.resistencia = 20;
        p1.arma.descricao = "Long Sword";
        p1.arma.nome = "Soul reaper";
        p1.arma.poder = 98;
        p1.arma.mostraInfoArma();


        p1.tomarDano();
        p1.usarArma();

        p1.arma.mostraInfoArma();
        System.out.println("P1 vida: "+p1.vida);


    }

}
