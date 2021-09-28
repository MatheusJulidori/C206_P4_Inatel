public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(12000,25000, 1,"Matheus Julidori");

        double valor = conta1.mostrarSaldo();
        System.out.println("Saldo = R$" + valor);

        double limite = conta1.mostrarLimite();
        System.out.println("Limite = R$" + limite);

        int Numero = conta1.mostrarNumero();
        System.out.println("Conta número: " + Numero);

        String Nome = conta1.mostrarNome();
        System.out.println("Cliente: " + Nome);

    }

}
