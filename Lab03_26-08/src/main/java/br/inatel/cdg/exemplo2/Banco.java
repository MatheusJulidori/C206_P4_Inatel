package br.inatel.cdg.exemplo2;

public class Banco {

    String nome;
    Conta[] contas = new Conta[100];


    void adicionaConta(Conta conta){
        for(int i = 0; i<this.contas.length; i++){
            if(this.contas[i] == null){
                this.contas[i] = conta;
                break;
            }
        }
    }


    void mostraInfo(){
        System.out.println("Nome do banco: " + this.nome );
        System.out.println("Contas do banco: ");
        for (Conta conta : this.contas) {
            if (conta != null) {
                conta.mostraInfo();
                System.out.println("------------");
            }
        }
    }

    void somaSaldos(){
        double saldoTotal = 0;
        for (Conta conta : this.contas) {
            if (conta != null) {
                saldoTotal += conta.saldo;
            }
        }
        System.out.println("Saldo total das contas: "+saldoTotal);
    }
}
