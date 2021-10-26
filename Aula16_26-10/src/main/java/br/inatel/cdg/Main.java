package br.inatel.cdg;

import br.inatel.cdg.exceptions.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {


        Conta conta =  new Conta(200,100);

        System.out.println("iniciou a main");

        try{
            conta.sacar(300);
            //varios trem
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }finally{
            //opcional
            System.out.println("Confia, sempre serei executado!");
            //Sempre sera executado
            //usado para desalocar recurso(tirar conexao com rede, teclado, scanner, etc)
        }

        System.out.println("Chegou no fim");

    }
}
