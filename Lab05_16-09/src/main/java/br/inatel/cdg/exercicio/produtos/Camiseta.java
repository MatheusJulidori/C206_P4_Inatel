package br.inatel.cdg.exercicio.produtos;

public class Camiseta extends Produto{

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + (String)(" "+ cor + " " + tamanho);
    }
}
