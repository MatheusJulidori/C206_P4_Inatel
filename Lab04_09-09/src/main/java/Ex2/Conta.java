package Ex2;

public class Conta {

    private static int qtdClientes;
    private double saldo;
    private Cliente cliente;

    Conta(String nome, long cpf){
        cliente = new Cliente(nome,cpf);
        qtdClientes++;
        this.saldo = 0;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        this.saldo -= valor;
    }
    public void extrato(){
        System.out.println("Saldo: " + this.getSaldo());
    }

    public static int getQtdClientes() {
        return qtdClientes;
    }

    public static void setQtdClientes(int qtdClientes) {
        Conta.qtdClientes = qtdClientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
