package br.inatel.cdg.principal.hashSet;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Set<String> conjuntoNomes = new HashSet<>();


        conjuntoNomes.add("Chaves");
        conjuntoNomes.add("Chapolim");
        conjuntoNomes.add("Apolonia");
        conjuntoNomes.add("Capirota");
        conjuntoNomes.add("Tinhosa");

        conjuntoNomes.forEach(e-> System.out.println(e));

        if(conjuntoNomes.contains("Chaves")){
            System.out.println("Tem");
        }else{
            System.out.println("nao");
        }

        Set<String> conjuntoNomesLinkados = new LinkedHashSet<>();


        conjuntoNomesLinkados.add("Chaves");
        conjuntoNomesLinkados.add("Chapolim");
        conjuntoNomesLinkados.add("Apolonia");
        conjuntoNomesLinkados.add("Capirota");
        conjuntoNomesLinkados.add("Tinhosa");

        conjuntoNomesLinkados.forEach(e-> System.out.println(e));

        List<String> remocao = new ArrayList<>();

        for(String nome: conjuntoNomesLinkados){
            if(nome.equals("Chaves")){
                System.out.println("Achou chaves");
                remocao.add(nome);
            }
            if(nome.equals("Chapolim")){
                System.out.println("Achou Chapolim");
                remocao.add(nome);
            }
        }

        conjuntoNomesLinkados.removeAll(remocao);

        conjuntoNomesLinkados.forEach(System.out::println);

    }

}
