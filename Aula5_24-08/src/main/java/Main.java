import carrinho.Piloto;
import carrinho.Kart;

public class Main {

    public static void main(String[] args) {
        Kart kart1 = new Kart();
        kart1.nome = "Gol bolinha";
        kart1.motor.cilindradas = "100";
        kart1.motor.velocidadeMaxima = 200.0f;

        Piloto piloto1 = new Piloto();
        kart1.piloto = piloto1;

        kart1.piloto.nome = "Penelope Charmosa";
        piloto1.vilao = false;

        Kart kart2 = new Kart();
        kart2.nome = "Celta preto(vai chover)";
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 50;

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Seu Barriga";
        piloto2.vilao = true;

        kart2.piloto = piloto2;

        Kart kart3 = new Kart();
        kart3.nome = "Uno com escada";
        kart3.motor.cilindradas = "150";
        kart3.motor.velocidadeMaxima = 300;

        kart3.piloto = new Piloto();
        kart3.piloto.nome = "Suporte da Oi";
        kart3.piloto.vilao = true;

        kart1.pular();
        kart2.fazerDrift();
        kart3.soltarTurbo();
    }
}
