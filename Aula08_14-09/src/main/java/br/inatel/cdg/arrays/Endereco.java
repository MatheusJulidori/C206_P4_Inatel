package br.inatel.cdg.arrays;

public class Endereco {

    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }


}
