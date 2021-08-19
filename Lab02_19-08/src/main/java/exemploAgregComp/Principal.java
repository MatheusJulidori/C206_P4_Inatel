package exemploAgregComp;

public class Principal {

    public static void main(String[] args) {


        Piloto piloto = new Piloto("Matheus",21);
        Carro c = new Carro("Ford","Vermelho",30,piloto);

        c.motor.cilindradas = 200;

        c.adicionaPiloto(piloto);

    }

}