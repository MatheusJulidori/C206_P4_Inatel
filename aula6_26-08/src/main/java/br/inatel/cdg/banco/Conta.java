package br.inatel.cdg.banco;

import br.inatel.cdg.cliente.Cliente;

import java.util.Objects;

public class Conta {

    private double saldo;
    private double limiteMensal;
    private double limiteAtual;
    private final Cliente cliente;

    public Conta(String nomeCliente,String enderecoCliente,String cpfCliente,double limite){
        cliente = new Cliente(nomeCliente,enderecoCliente,cpfCliente);
        this.saldo = 0;
        this.limiteMensal = limite;
        this.limiteAtual = limite;
    }

    //Metodos
    public void mostraInfo(){
        System.out.println("Proprietário: "+ cliente.getNome());
        System.out.println("Limite Mensal: "+ this.limiteMensal);
        System.out.println("Limite disponivel atualmente: "+ this.limiteAtual);
        System.out.println("Saldo: "+ this.saldo);
    }

    public void mostraCliente(){
        System.out.println("Proprietário: "+ cliente.getNome());
        System.out.println("CPF: "+ cliente.getCpf());
        System.out.println("Endereço: "+ cliente.getEndereco());
    }

    public void depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }else{
            this.saldo+=valor;
        }
    }

    public void alterarCliente(String nome,String cpf, String endereco){
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
    }

    public void transferir(double valor, Conta contaRec){
        if(valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }else if(valor>this.saldo){
            throw new IllegalArgumentException("Valor maior que saldo disponivel");
        }else if(valor>this.limiteMensal){
            throw new IllegalArgumentException("Valor maior que limite disponivel");
        }else if(Objects.equals(this,contaRec)) {
            throw new IllegalArgumentException("Conta destino igual a conta remetente");
        }else{
            this.saldo -= valor;
            contaRec.depositar(valor);
        }
    }

    public void sacar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }else if(valor>this.saldo){
            throw new IllegalArgumentException("Valor maior que saldo disponivel");
        }else{
            this.saldo -= valor;
        }
    }

    public void compraNoCartao(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor invalido");
        }else if(valor>this.limiteAtual){
            throw new IllegalArgumentException("Valor maior que limite disponivel");
        }else{
            this.saldo -= valor;
            this.limiteAtual -= valor;
        }
    }

    //Getters
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getLimiteMensal() {
        return limiteMensal;
    }

    public double getLimiteAtual() {
        return limiteAtual;
    }

    //Setter
    public void setLimiteMensal(double limite) {
        if(!(limite < 300 && limite > this.saldo)) {
            double limiteASomar = limite - this.limiteMensal;
            this.limiteMensal = limite;
            this.limiteAtual += limiteASomar;
        }
    }

}
