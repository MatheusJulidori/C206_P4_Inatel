package br.inatel.cdg.aula;

public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5];

        Professor p = new Professor("Jao",32,200,"POO");
        Engenheiro e = new Engenheiro("Zoio",34,1200,"Video do youtube");
        Arquiteto a = new Arquiteto("Ted Mosby",36,1400,"Arranha Ceu");

        funcionarios[0] = p;
        funcionarios[1] = e;
        funcionarios[2] = a;

        for(Funcionario funcionario : funcionarios){
            System.out.println();
            if(funcionario != null){
                if(funcionario instanceof Arquiteto) {
                    System.out.println("Este funcionario e um arquiteto");
                    Arquiteto arquiteto = (Arquiteto) funcionario;
                    arquiteto.mostraInfo();
                    arquiteto.salarioBonus();
                    arquiteto.fazAlgo();
                    arquiteto.gerenciaProjeto();
                }else if(funcionario instanceof Engenheiro) {
                    System.out.println("Este funcionario e um engenheiro");
                    Engenheiro engenheiro = (Engenheiro) funcionario;
                    engenheiro.salarioBonus();
                    engenheiro.mostraInfo();
                    engenheiro.fazAlgo();
                    engenheiro.fazProjeto();
                    engenheiro.gerenciaProjeto();
                    engenheiro.fazAtividadeFisica();
                }else{
                    System.out.println("Este funcionario e um professor");
                    Professor professor = (Professor) funcionario;
                    professor.salarioBonus();
                    professor.mostraInfo();
                    professor.fazAlgo();
                    professor.corrigirProvas();
                    professor.fazAtividadeFisica();
                }
            }
        }

        System.out.println("Numero de funcionarios: "+Funcionario.cont);

    }
}
