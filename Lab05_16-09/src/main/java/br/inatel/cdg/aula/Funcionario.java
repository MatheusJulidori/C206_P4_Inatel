package br.inatel.cdg.aula;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void fazAlgo(){
        System.out.println(this.nome + " esta fazendo alguma coisa");
    }

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
