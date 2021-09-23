package br.inatel.cdg.aula;

public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    public static int cont;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        cont++;
    }

    public abstract void fazAlgo();

    public void mostraInfo(){
        System.out.println("Nome: " +  nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
    }

    public double salarioBonus(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
