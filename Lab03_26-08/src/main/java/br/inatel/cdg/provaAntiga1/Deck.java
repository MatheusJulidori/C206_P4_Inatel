package br.inatel.cdg.provaAntiga1;

import java.util.Objects;

public class Deck {

    String dono;
    Carta[] cartas = new Carta[100];

    void adicionarCarta(Carta carta){
        for(int i = 0;i<this.cartas.length; i++){
            if(cartas[i] == null){
                cartas[i] = carta;
                break;
            }
        }
    }

    void mostaInfo(){
        System.out.println("Dono do deck: " + this.dono);
        System.out.println("Cartas do deck: ");
        for (Carta carta : this.cartas) {
            if (carta != null) {
                System.out.println("Nome: " + carta.nome);
                System.out.println("Poder: " + carta.poder);
                System.out.println("Classificacao: " + carta.classificacao);
                System.out.println("--------------");
            }
        }
    }

    void calculaPoderMedio(){
        float poderTotal = 0f;
        int totalCartas = 0;
        for (Carta carta : this.cartas) {
            if (carta != null) {
                poderTotal += carta.poder;
                totalCartas++;
            }
        }
        poderTotal /= totalCartas;
        System.out.println("Poder medio do deck: " + poderTotal);
    }

    void calculaClassificacao(){
        int archer = 0;
        int soldier = 0;
        int heavy = 0;
        for(Carta carta: this.cartas){
            if(carta != null){
                if(Objects.equals(carta.classificacao, "Arqueiro")){
                    archer++;
                }
                else if(Objects.equals(carta.classificacao, "Soldado")){
                    soldier++;
                }
                else if(Objects.equals(carta.classificacao, "Pesado")) {
                    heavy++;
                }
            }
        }
        System.out.println("Arqueiros no deck: " + archer);
        System.out.println("Soldados no deck: " + soldier);
        System.out.println("Pesados no deck: " + heavy);
    }

}
