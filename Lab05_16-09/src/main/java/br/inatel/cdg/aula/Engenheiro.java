package br.inatel.cdg.aula;

public class Engenheiro extends Funcionario{

    private String especialidade;

    public Engenheiro(String nome, int idade, double salario,String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public void fazProjeto(){
        System.out.println(this.getNome() + " esta fazendo um projeto");
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.getNome() + " esta fazendo gambiarra");
    }

    @Override
    public double salarioBonus(){
        return super.salarioBonus() + 500;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade: " + especialidade);
    }


}
