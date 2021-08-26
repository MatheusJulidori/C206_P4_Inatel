package br.inatel.cdg.exemplo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Banco b = new Banco();
        System.out.println("Entre com o nome do banco");
        b.nome = sc.nextLine();

        boolean flag = true;
        while(flag) {
            int a;
            System.out.println("Menu: ");
            System.out.println("1 -> Adicionar conta ao banco");
            System.out.println("2 -> Mostrar infos banco");
            System.out.println("3 -> Mostrar saldo total");
            System.out.println("4 -> Fechar app");

            a = sc.nextInt();
            sc.nextLine();

            switch (a) {
                case(1):
                    System.out.println("Entre com o nome do proprietario e o saldo da conta");
                    Conta c1 = new Conta();
                    c1.nome = sc.nextLine();
                    c1.saldo = sc.nextDouble();
                    b.adicionaConta(c1);
                    break;
                case(2):
                    b.mostraInfo();
                    break;
                case(3):
                    b.somaSaldos();
                    break;
                case(4):
                    flag = false;
                    break;
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        }
        sc.close();
    }
}
