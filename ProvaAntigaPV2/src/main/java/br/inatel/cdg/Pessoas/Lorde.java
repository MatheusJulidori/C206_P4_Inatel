package br.inatel.cdg.Pessoas;

import br.inatel.cdg.Interfaces.Consagra;

public class Lorde extends Pessoa implements Consagra {

    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int idade, int honra, String casa, int qtdVassalos) {
        super(nome, idade, honra);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    @Override
    public void orar() {
        System.out.println(this.getNome()+ " fez uma oracao aos sete deuses");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa: "+this.getCasa());
        System.out.println("Quantidade de vassalos: "+this.getQtdVassalos());
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println(this.getNome() + " consagrou um novo cavaleiro");
        qtdVassalos++;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getQtdVassalos() {
        return qtdVassalos;
    }

    public void setQtdVassalos(int qtdVassalos) {
        this.qtdVassalos = qtdVassalos;
    }
}
