package Ex2;

public class Main {

    public static void main(String[] args) {
        Conta c1 = new Conta("Gerivaldo", 1314563210);

        c1.deposita(300);
        c1.saca(200);
        c1.extrato();
    }
}
