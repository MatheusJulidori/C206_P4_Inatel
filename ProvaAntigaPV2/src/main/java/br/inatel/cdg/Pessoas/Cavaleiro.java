package br.inatel.cdg.Pessoas;

import br.inatel.cdg.Interfaces.Consagra;
import br.inatel.cdg.Interfaces.Patrulha;
import br.inatel.cdg.Items.Montaria;

public class Cavaleiro extends Pessoa implements Patrulha, Consagra {

    private String casa;
    private String nomeEscudeiro;
    public Montaria montaria;

    public Cavaleiro(String nome, int idade, int honra, String casa, String nomeEscudeiro) {
        super(nome, idade, honra);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
    }


    @Override
    public void orar() {
        System.out.println(this.getNome() + " fez uma oracao ao deus do fogo");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa  "+ this.getCasa());
        System.out.println("Escudeiro: "+this.getNomeEscudeiro());
        if(montaria!=null)
            System.out.println("Montaria: "+this.montaria.getNome());
        else
            System.out.println("Esse cavaleiro nao possui uma montaria");
    }
    @Override
    public void fazerPatrulha() {
        System.out.println(this.getNome()+ " fez uma patrulha alem da muralha");
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println(this.getNome() + " consagrou um novo cavaleiro");
        int honraAnteiror = getHonra();
        honraAnteiror += 5;
        setHonra(honraAnteiror);
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getNomeEscudeiro() {
        return nomeEscudeiro;
    }

    public void setNomeEscudeiro(String nomeEscudeiro) {
        this.nomeEscudeiro = nomeEscudeiro;
    }

    public void setMontaria(Montaria montaria) {
        this.montaria = montaria;
    }
}
