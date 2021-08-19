package exemploAgregComp;

public class Carro {

    String marca;
    String cor;
    int velocidade;

    Motor motor = new Motor();//Compoem, ou seja, um carro ja e criado com um motor
    Piloto piloto; // Agrega, ou seja, um carro n~ao 'e cirado com um piloto, posso passar um piloto criado ao carro.

    Carro(String marca, String cor, int velocidade, Piloto piloto){
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
        this.piloto = piloto;
    }

    void adicionaPiloto(Piloto piloto){
        this.piloto = piloto;
    }



}
