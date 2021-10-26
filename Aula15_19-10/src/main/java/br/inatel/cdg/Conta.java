package br.inatel.cdg;

import java.util.*;

public class Conta {

    private double saldo,limite;
    private List<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        clientes = new ArrayList<>();
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean sacar(double quantia){
        if(quantia < saldo) {
            saldo -= quantia;
            System.out.println("Sacou");
            return true;
        }
        else{
            System.out.println("N sacou");
            return false;
        }
    }
}
