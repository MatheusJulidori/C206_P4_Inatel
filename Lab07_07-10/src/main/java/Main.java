import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        try{
            contas[0] = new Conta();
            contas[0].saldo = 1000;
            contas[1] = new Conta();
            contas[1].saldo = 1100;
            contas[2] = new Conta();
            contas[2].saldo = 1200;
            contas[3] = new Conta();
            contas[3].saldo = 1300;
        }catch (Throwable e){
            System.out.println(e);
        }


        try{
            for(int i = 0; i < contas.length;i++){
                System.out.println("Saldo da conta: " + contas[i].saldo);
            }
        }catch(Throwable e){
            System.out.println(e);
        }
        
        //--------//
        
        Scanner sc = new Scanner(System.in);

        int n3 = 0;

        try{
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            n3 = n1/n2;
        }catch(InputMismatchException | ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println(n3);
        }

        //------//

        Conta c1 = new Conta();
        c1.saldo = 100;
        try {
            c1.sacar(200);
        }catch (Throwable throwable){
            System.out.println(throwable);
        }
    }
}
