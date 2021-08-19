package exercicio2;

public class Principal {

    public static void main(String[] args) {

        Carro c1 = new Carro("vermelho","Ferrari","Ferrari",300,60);
        Carro c2 = new Carro("vermelho","Ford","Ka",150,60);

        c1.mostraInfo();
        c2.mostraInfo();
        c1.acelerar();
        c1.ligar();

    }
}
