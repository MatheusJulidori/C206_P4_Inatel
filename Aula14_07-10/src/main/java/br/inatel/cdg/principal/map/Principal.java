package br.inatel.cdg.principal.map;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Map<String,Integer> mapaPuzzle = new HashMap<>();//Dicionario em python

        mapaPuzzle.put("Torre de babel",5000);
        mapaPuzzle.put("Jardim Vitoriano",5000);
        mapaPuzzle.put("As quatro estacoes",4000);

        mapaPuzzle.forEach((k,v) -> System.out.println(k + " " + v));

    }

}
