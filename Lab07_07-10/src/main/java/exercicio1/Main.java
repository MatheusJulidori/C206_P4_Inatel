package exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Calculadora.somar(n1,n2);
        Calculadora.subtrair(n1,n2);
        Calculadora.multiplicar(n1,n2);
        Calculadora.dividir(n1,n2);
    }
}
