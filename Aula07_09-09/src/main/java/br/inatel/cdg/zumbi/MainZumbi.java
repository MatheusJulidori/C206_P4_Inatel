package br.inatel.cdg.zumbi;

public class MainZumbi {

    public static void main(String[] args) {
        Zumbi z1 = new Zumbi(100,"Lerdo");
        Zumbi z2 = new Zumbi(200,"Corredor");
        Zumbi z3 = new Zumbi(300,"Abominação");

        z1.atacar();
        z2.atacar();
        z3.atacar();
    }
}
