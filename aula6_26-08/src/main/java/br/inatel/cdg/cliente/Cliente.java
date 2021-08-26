package br.inatel.cdg.cliente;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String endereco, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }


    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
