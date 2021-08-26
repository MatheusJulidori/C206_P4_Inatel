package br.inatel.cdg.provaAntiga1;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deck d = new Deck();
        System.out.println("Entre com o dono do deck");
        d.dono = sc.nextLine();

        boolean flag = true;
        while(flag) {
            int a;
            System.out.println("Menu: ");
            System.out.println("1 -> Adicionar carta ao deck");
            System.out.println("2 -> Mostrar infos do deck");
            System.out.println("3 -> Mostrar poder medio do deck");
            System.out.println("4 -> Mostrar total de cada tipo de carta do deck");
            System.out.println("5 -> Fechar app");

            a = sc.nextInt();
            sc.nextLine();

            switch (a) {
                case(1):
                    Carta c = new Carta();

                    System.out.println("Entre com o nome da carta");
                    c.nome = sc.nextLine();

                    System.out.println("Entre com o poder da carta");
                    c.poder = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Entre com a classificacao da carta");
                    boolean flagCard = true;
                    while(flagCard) {
                        String test = sc.nextLine();
                        if (Objects.equals(test, "Arqueiro") || Objects.equals(test, "Soldado") || Objects.equals(test, "Pesado")) {
                            c.classificacao = test;
                            flagCard = false;
                        } else {
                            System.out.println("Classificacao invalida(Arqueiro,Solado,Pesado),tente novamente");
                        }
                    }

                    d.adicionarCarta(c);
                    break;
                case(2):
                    d.mostaInfo();
                    break;
                case(3):
                    d.calculaPoderMedio();
                    break;
                case(4):
                    d.calculaClassificacao();
                    break;
                case(5):
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
