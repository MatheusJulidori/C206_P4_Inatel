package br.inatel.cdg.exercicio.produtos;

public class Notebook extends Produto {

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + (String)(" "+ armazenamento + " " + gpu + " " + processador);
    }
}
