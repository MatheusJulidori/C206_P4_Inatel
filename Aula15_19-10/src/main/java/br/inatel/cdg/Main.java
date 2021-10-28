package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(200,100);

        System.out.println("Iniciando a main");
        metodo1();
        System.out.println("Terminando a main");

    }

    private static void metodo1() {
        System.out.println("Iniciando metodo 1");
        try{
            metodo2();
        }catch (Throwable e){
            System.out.println(e);
        }
        System.out.println("Terminando metodo 1");

    }

    private static void metodo2() {
        System.out.println("Iniciando metodo 2");
        //try {
            Conta conta = null;
            System.out.println(conta.getSaldo());
        //}catch (Throwable e){
            //System.out.println(e.toString());
        //}
        System.out.println("Terminando metodo 2");

    }

}
