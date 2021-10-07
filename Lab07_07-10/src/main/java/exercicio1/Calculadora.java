package exercicio1;

public abstract class Calculadora {

    public static void somar(int n1, int n2){
        try{
            System.out.println(n1+n2);
        }catch (Throwable e){
            System.out.println(e);
        }
    }

    public static void subtrair(int n1, int n2){
        try{
            System.out.println(n1-n2);
        }catch (Throwable e){
            System.out.println(e);
        }
    }

    public static void dividir(int n1, int n2){
        try{
            System.out.println(n1/n2);
        }catch (Throwable e){
            System.out.println(e);
        }
    }

    public static void multiplicar(int n1, int n2){
        try{
            System.out.println(n1*n2);
        }catch (Throwable e){
            System.out.println(e);
        }
    }


}
