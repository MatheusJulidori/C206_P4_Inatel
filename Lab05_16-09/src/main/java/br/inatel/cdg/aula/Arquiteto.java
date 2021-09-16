package br.inatel.cdg.aula;

public class Arquiteto extends Funcionario {

    private String ramo;

    public Arquiteto(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }


    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
    }

}
