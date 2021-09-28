package exercicio2;

public class Principal {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.limite = 700;
        conta1.titular = new Cliente();
        conta1.titular.nome = "Matheus";
        conta1.titular.cpf = "12345678900";
    }
}
