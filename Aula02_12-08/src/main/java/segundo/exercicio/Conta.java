package segundo.exercicio;

public class Conta {


    //Membros(atributos) da classe

    private double saldo;
    private double limite;
    private int numero;
    private String nome;

    //Constructor

    public Conta(double saldo,double limite,int numero,String nome) {
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
        this.nome = nome;
    }

    //Metodos da classe(funções)

    void sacar(double quantia){
        if(quantia<=0){
            System.out.println("Valor precisa ser maior que 0");
        }else{
            saldo -= quantia;
        }
    }

    void depositar(double quantia){
        if(quantia<=0){
            System.out.println("Valor precisa ser maior que 0");
        }else{
            saldo += quantia;
        }
    }

    double mostrarSaldo(){
        return saldo;
    }

    String mostrarNome(){
        return nome;
    }

    boolean receberDinheiro(double valor){
        if(valor > 0 ) {
            this.saldo += valor;
            return true;
        }else{
            return false;
        }

    }

    int mostrarNumero(){
        return numero;
    }

    double mostrarLimite(){
        return limite;
    }

    void transferirDinheiro(Conta contaDestino, double valor){
        if(valor > this.limite) System.out.println("Valor acima do limite");
        else if(valor > this.saldo) System.out.println("Saldo insuficiente");
        else{
            boolean res = contaDestino.receberDinheiro(valor);
            if(res) this.saldo -= valor;
            else System.out.println("Transferência falhou");
        }
    }

}
