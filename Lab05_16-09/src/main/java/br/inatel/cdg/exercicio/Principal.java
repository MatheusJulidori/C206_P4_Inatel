package br.inatel.cdg.exercicio;

import br.inatel.cdg.exercicio.produtos.Camiseta;
import br.inatel.cdg.exercicio.produtos.Notebook;
import br.inatel.cdg.exercicio.produtos.Produto;

public class Principal {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[2];

        Notebook n = new Notebook("Dell Inspiron",4500,10000,"Nvidia GTX 3080","Intel Core I9");
        Camiseta c = new Camiseta("Renner",34,"Vermelho","G");

        produtos[0] = n;
        produtos[1] = c;

        for(Produto produto : produtos){
            if(produto != null){
                if(produto instanceof Notebook) {
                    System.out.println("Este produto e um notebook");
                    Notebook notebook = (Notebook) produto;
                    System.out.println(notebook.etiquetaPreco());
                }else{
                    System.out.println("Este produto e uma camiseta");
                    Camiseta camiseta = (Camiseta) produto;
                    System.out.println(camiseta.etiquetaPreco());
                }
            }
        }
    }
}
