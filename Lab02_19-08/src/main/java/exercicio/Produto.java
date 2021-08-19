package exercicio;

public class Produto {


    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.nome = nome;
        this.codigoSerie = codigoSerie;
        this. categoria = categoria;
    }

    void mostraInfo(){
        System.out.println("Codigo serie: "+codigoSerie);
        System.out.println("Codigo produto: "+codigoProduto);
        System.out.println("Nome: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Quantidade: "+quantidade);
    }


}
