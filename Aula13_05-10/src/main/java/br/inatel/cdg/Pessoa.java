package br.inatel.cdg;

public class Pessoa implements Comparable<Pessoa> {

    private int idade;

    public Pessoa(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa p) {
        //como que faz?
        if(this.idade < p.idade)
            return -1;
        else if (this.idade > p.idade)
            return 1;
        return 0;
    }
}
