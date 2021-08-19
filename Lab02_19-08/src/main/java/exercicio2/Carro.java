package exercicio2;

public class Carro {

    String cor;
    String modelo;
    String marca;
    double velocidadeMax;
    double velocidadeAtual;


    Carro(String cor, String marca, String modelo, double velocidadeMax,double velocidadeAtual){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMax = velocidadeMax;
    }

        Motor motor = new Motor("300C","V8");



    void ligar(){
        System.out.println("Carro ligado");
    }

    void acelerar(){
        System.out.println("Acelerando");
    }

    void mostraInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Vel Max: " + this.velocidadeMax);
        System.out.println("Vel Atual: " + this.velocidadeAtual);
        System.out.println("Potencia motor: " + this.motor.potecia);
        System.out.println("Modelo motor: " + this.motor.tipo);
    }


}
