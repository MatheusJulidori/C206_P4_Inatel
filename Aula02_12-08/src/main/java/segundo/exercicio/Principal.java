package segundo.exercicio;

public class Principal {

    public static void main(String[] args) {

        Conta conta1 = new Conta(12000,25000, 1,"Matheus Julidori");
        Conta conta2 = new Conta(12000,25000, 2,"Matheus Braga");

        System.out.println();
        System.out.println("Dados completos dos clientes:");
        System.out.println();


        int Numero = conta1.mostrarNumero();
        System.out.println("Conta número: " + Numero);

        String Nome = conta1.mostrarNome();
        System.out.println("Cliente: " + Nome);

        double valor = conta1.mostrarSaldo();
        System.out.println("Saldo = R$" + valor);

        double limite = conta1.mostrarLimite();
        System.out.println("Limite = R$" + limite);

        System.out.println();

        int NumeroB = conta2.mostrarNumero();
        System.out.println("Conta número: " + NumeroB);

        String NomeB = conta2.mostrarNome();
        System.out.println("Cliente: " + NomeB);

        double valorB = conta2.mostrarSaldo();
        System.out.println("Saldo = R$" + valorB);

        double limiteB = conta2.mostrarLimite();
        System.out.println("Limite = R$" + limiteB);

        System.out.println();
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
        System.out.println();
        System.out.println("Saldos antes da transferência:");
        System.out.println("Saldo conta 1 = R$" + conta1.mostrarSaldo());
        System.out.println("Saldo conta 2 = R$" + conta2.mostrarSaldo());
        conta1.transferirDinheiro(conta2,1000);
        System.out.println();
        System.out.println("Saldos depois da transferência:");
        System.out.println("Saldo conta 1 = R$" + conta1.mostrarSaldo());
        System.out.println("Saldo conta 2 = R$" + conta2.mostrarSaldo());

    }

}

