public class Conta{

    public int saldo;

    public void sacar(int valor) throws NotEnoughMoneyExcpetion{

            if(valor > saldo){
                throw new NotEnoughMoneyExcpetion(valor);
            }
            else{
                System.out.println("Vc sacou " + valor);
                saldo-= valor;
            }

    }



}
