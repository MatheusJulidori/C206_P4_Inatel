public class NotEnoughMoneyExcpetion extends Exception {

    public NotEnoughMoneyExcpetion(int valor) {

        System.out.println("Voce tentou sacar "+valor+", mas seu saldo e insuficiente");

    }
}
