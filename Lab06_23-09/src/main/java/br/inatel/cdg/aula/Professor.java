package br.inatel.cdg.aula;

public class Professor extends Funcionario implements Atividade{

    private String materia;

    public Professor(String nome, int idade, double salario,String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigirProvas(){
        System.out.println("Provas corrigidas por "+ this.getNome());
    }

    @Override
    public void fazAtividadeFisica() {
        System.out.println("Fazendo atividade fisica, professor maromba");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.getNome() + " esta dando aula");
    }

    @Override
    public double salarioBonus(){
        return super.salarioBonus() + 200;
    }
}
