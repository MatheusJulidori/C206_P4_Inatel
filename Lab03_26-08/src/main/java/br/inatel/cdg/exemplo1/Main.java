package br.inatel.cdg.exemplo1;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.nome = "Matheus";
        c1.saldo = 1100;
        Conta c3 = new Conta();
        c3.nome = "Jao";
        c3.saldo = 300;

        Conta[] contas = new Conta[5];

        contas[0] = c1;
        contas[1] = new Conta();
        contas[1].nome = "Grabriel";
        contas[1].saldo = 1200;
        contas[2] = c3;

        for (Conta conta : contas) {
            if (conta != null) {
               conta.mostraInfo();
            }

        }
    }
}
