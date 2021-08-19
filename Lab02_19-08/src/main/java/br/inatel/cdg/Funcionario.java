package br.inatel.cdg;

public class Funcionario {

    //Construtor
    Funcionario(String nome, int idade, float salario){
        this.idade = idade;
        this.salario = salario;
        this.nome = nome;

    }

    //Atributos da classe
    String nome;
    int idade;
    float salario;

    //Metodos da classe
    void tirarFerias(String mes){
        System.out.println(this.nome + " vai tirar ferias em " + mes);
    }

    float calculaSalarioAnual(){
        return this.salario * 12;
    }

    float calculaSalarioAnual(float decimoTerceiro){
        return (this.salario * 12) + decimoTerceiro;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Idade: " + this.idade);
    }

}
