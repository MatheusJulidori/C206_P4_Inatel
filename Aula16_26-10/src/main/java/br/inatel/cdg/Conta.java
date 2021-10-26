package br.inatel.cdg;

import br.inatel.cdg.exceptions.SaldoInsuficienteException;

public class Conta {

    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) throws SaldoInsuficienteException {
        if(valor>saldo){
            saldo-=valor;
            System.out.println("Deu boa");
            return true;
        }else{
            System.out.println("Deu ruim");
            throw new SaldoInsuficienteException("Saldo insuficiente. Tentou sacar " + valor + "" +
                    "mas só possui "+saldo);
        }
    }
}
