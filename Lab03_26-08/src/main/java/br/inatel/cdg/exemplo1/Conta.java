package br.inatel.cdg.exemplo1;

public class Conta {

    String nome;
    double saldo;

    void mostraInfo(){
        System.out.println("Cliente: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("------------");
    }

}
