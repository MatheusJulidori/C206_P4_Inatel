package br.inatel.cdg;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arquivo a = new Arquivo();
        Funcionario f =  new Funcionario(21,"Matheus","00011122234");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Bem vindo ao salvador de funcionarios do Julis, to vendo essa aula chapado de remedio");
        while(flag){
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Listar funcionarios");
            System.out.println("3 - Sair");
            System.out.println("Sua opçao: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Entre com o nome");
                    f.nome = sc.nextLine();
                    System.out.println("Entre com a idade");
                    f.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entre com o CPF");
                    f.cpf = sc.nextLine();
                    a.write(f);
                    System.out.println("Salvo com sucesso");
                    break;

                case 2:
                    ArrayList<Funcionario> funcs = a.ler();

                    for(Funcionario func : funcs){
                        System.out.println(func.nome);
                        System.out.println(func.idade);
                        System.out.println(func.cpf);
                    }
                    break;
                case 3:
                    int aux = JOptionPane.showConfirmDialog(null,"Certeza que deseja sair?");
                    if(aux == 0){
                        flag=false;
                    }
                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
            }

        }

    }

}
