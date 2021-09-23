package br.inatel.cdg.aula;

public class Arquiteto extends Funcionario implements Gerencia {

    private String ramo;

    public Arquiteto(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void gerenciaProjeto() {
        System.out.println(this.getNome() + " esta gerenciando um projeto de casa");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.getNome() + " esta fazendo o design de uma casa");
    }
}
