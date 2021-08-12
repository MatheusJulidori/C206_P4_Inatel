package br.inatel.cdg;

import java.util.Locale;
import java.util.Scanner;

//Aula de boas práticas e outros conceitos JAVA
public class Principal {
    public static void main(String[] args) {

        //TIPOS PRIMITIVOS

        //inteiros
        byte a;
        short b;
        int c;
        long d;

        //Pontos flutuantes
        float e;
        double f;

        //logico
        boolean bool;

        //Caractere
        char caracter;



        //TIPOS REFERENCIAIS

        String nome; //String é uma classe, classes são referenciais



        //ALGUMAS BOAS PRATICAS

        //Uma declaração de variável por linha, seguida de comentário;
        float nota; //Nota do Aluno
        float media; //Media das notas

        /*Nome de variáveis: devem começar com letras (minúsculas),
        $ ou _; Se for um nome composto as primeiras letras das palavras
         subsequentes devem ser maiúsculas(Camel Case;
        */
        double saldoContaCorrente;

        /*Nome de constantes(final <type>: devem ser sempre maiúsculas.
         Usa-se underline( _ ) para separar nomes compostos;
         */
        final int CREDITOS_MATRICULA = 27;

        /*Quando inicializar uma variável sempre indique o tipo do número,
         caso ela não seja do tipo inteiro (int);
         */
        //Para float:
        float numeroA = 10f;
        float numeroB = 10.2f;

        //Para double:
        double numeroDoubleA = 10.0;
        double numeroDoubleB = 10.2;


        //CASTING DE VARIÁVEIS

        //Casting direto
        double numeroCastingA = 2.2;
        int numeroCastingB;
        //numeroB = numeroA; não funciona, pois double>int
        numeroB = (int)numeroA; //Converte double para A

        //Casting de resultados
        int divisorA = 2;
        int divisorB = 3;
        //double resultado = divisorB/divisorA; resultara em 1.0, pois int por int da int
        double resultado = (double) divisorB/divisorA;

        //ENTRADA DE DADOS(SCANNER) -> cin do C++
        //sc.close();
        //Sempre fechar scanner no fim do código***************** TA NA ULTIMA LINHA

        Scanner sc = new Scanner(System.in);

        //Tipos primitivos
        System.out.println("Digite o valor: ");
        float entradaFloat = sc.nextFloat(); // Para os tipos primitivos, trocar para nextFloat ou etc
        //Para usar numeros com ponto no float, tem que setar o local para USA, pois brasil é virgual
        sc.useLocale(Locale.US);
        System.out.println("Valor: " + entradaFloat);

        //Assim como no c++, tem que usar cin.ingore(), aqui o nextInt() gera uma linha lixo
        //pra ignorar ele na hora de pegar string, coloque um nextLine() depois do nextInt()
        // ou use nextLine() em vez de nextInt() e converta pra int;
        sc.nextLine();

        //Strings
        System.out.println("Digite seu nome: ");
        String nomeEntrada = sc.nextLine(); // Para os tipos primitivos, trocar para nextFloat ou etc
        System.out.println("Seu nome é: " + nomeEntrada);


        //USO DE IF's

        int fluxoA;
        int fluxoB;

        System.out.println("Entre com 2 ints: ");
        fluxoA = sc.nextInt();
        fluxoB = sc.nextInt();

        if(fluxoA>fluxoB){
            System.out.println("A é maior que B");//Primeira forma
        }
        else if(fluxoB > fluxoA)//Segunda forma
            System.out.println("B é maior que A");
        else System.out.println("São iguais");//Terceira forma


        //If zoadao lá

        System.out.println((fluxoA>fluxoB ? "A > B": "A !> B"));

        //COMPARAÇÃO DE STRINGS
        String compA = "Matheus";
        String compB = "Julidori";

        boolean comp = compA.equals("Matheus");
        if (comp) System.out.println("True");

        switch(compB){
            case "Matheus":
                System.out.println("string = Matheus");
                break;
            case "Julidori":
                System.out.println("string = Julidori");
                break;
            default:
                System.out.println("Nenhum");
                break;
        }

        //WHILE
        System.out.print("Entre com um int: ");
        int cont = sc.nextInt();
        int contA = cont;
        while(cont > 0){
            if(cont % 2 == 0)
                System.out.println(cont + " é par");
            else
                System.out.println(cont + " é impar");
            cont--;
        }
        //FOR
        for(int j = 0; j<=contA;j++)
            System.out.println(j);

        sc.close();//Fechando Scanner

    }
}
