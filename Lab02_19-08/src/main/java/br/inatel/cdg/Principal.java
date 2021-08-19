package br.inatel.cdg;

public class Principal {

    public static void main(String[] args) {

        Funcionario f1;
        f1 = new Funcionario("Matheus",21,1000f);

        Funcionario f2 = new Funcionario("Arthur",20,980f);

        f2.tirarFerias("Abril");
        f1.tirarFerias("Janeiro");

        System.out.println("Sem decimo terceiro f1: R$" + f1.calculaSalarioAnual());
        float salarioAnualf2 = f2.calculaSalarioAnual();
        System.out.println("Sem decimo terceiro f2: R$" + salarioAnualf2);

        System.out.println("Com decimo terceiro f1: R$" + f1.calculaSalarioAnual(300));

        f1.mostraInfo();
        f2.mostraInfo();


    }

}