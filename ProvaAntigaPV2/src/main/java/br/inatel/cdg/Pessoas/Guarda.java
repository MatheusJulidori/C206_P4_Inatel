package br.inatel.cdg.Pessoas;

import br.inatel.cdg.Interfaces.Patrulha;

public class Guarda extends Pessoa implements Patrulha {

    private int coragem;

    public Guarda(String nome, int idade, int honra, int coragem){
        super(nome,idade,honra);
        this.coragem = coragem;
    }

    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oracao aos deuses antigos");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Coragem: " + getCoragem());
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(this.getNome()+ " fez uma patrulha alem da muralha");
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }
}
