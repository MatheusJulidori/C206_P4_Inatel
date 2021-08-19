package exercicio;

public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto(1,"p1","produto1","tech",2);
        Produto p2 = new Produto(2,"p2","produto2","car",9);

        p1.mostraInfo();
        p2.mostraInfo();


    }
}
