package exercicio2;

public class Conta {

    public int numero;
    public float saldo;
    public float limite;
    Cliente titular;

    public void deposita(float quantia){
        saldo += quantia;
    }
    public void sacar(float quantia){
        saldo -= quantia;
    }
    public void transfere(Conta contaDestino,float quantia){
        contaDestino.saldo += quantia;
        saldo -= quantia;
    }

}
