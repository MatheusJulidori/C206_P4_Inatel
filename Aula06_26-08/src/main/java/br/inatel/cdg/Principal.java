package br.inatel.cdg;

import br.inatel.cdg.banco.Conta;

public class Principal {

    public static void main(String[] args) {
        Conta conta = new Conta("Matheus Julidori","Rua A","111.111.111-11",1000);
        Conta conta2 = new Conta("Matheus Julidori","Rua A","111.111.111-11",1000);

        System.out.println("Antes das operações");
        conta.mostraInfo();
        conta.depositar(3000);
        conta.setLimiteMensal(10000);
        conta.transferir(1000,conta2);
        conta.sacar(100);
        conta.compraNoCartao(100);
        System.out.println();
        System.out.println("Depois das operações");
        conta.mostraInfo();
        System.out.println("-----------------------");
        System.out.println();

        System.out.println("Cliente antes das mudanças");
        conta.mostraCliente();
        conta.alterarCliente("Matheus","000.000.000-00","Rua B");
        System.out.println();
        System.out.println("Cliente depois das mudanças");
        conta.mostraCliente();
        System.out.println("-----------------------");
        System.out.println();


        System.out.println("Getters: ");
        System.out.println("Cliente: " + conta.getCliente());
        System.out.println("Limite disponivel: " + conta.getLimiteAtual());
        System.out.println("Limite mensal: " + conta.getLimiteMensal());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

}
