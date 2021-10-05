package br.inatel.cdg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Lista dinamica
        List<String> jogos = new ArrayList();
        List lista2 = new LinkedList();

        //Adicionando elementos
        jogos.add("Azul");
        jogos.add("Cthulhu");
        jogos.add("Coup");
        jogos.add("D&D 3.5");
        jogos.add("Secret Hitler");

        lista2.add(true);
        lista2.add(false);
        lista2.add(3);
        lista2.add("Jaré");


        //Buscando elementos de indices especificos
        String elemento = jogos.get(2);

        System.out.println(jogos.size());
        System.out.println(elemento);

        //Adicionando e removendo elementos de indices especificos

        jogos.add(2,"D&D 5");
        elemento = jogos.get(2);
        System.out.println(jogos.size());
        System.out.println(elemento);
        jogos.remove(2);
        elemento = jogos.get(2);
        System.out.println(jogos.size());
        System.out.println(elemento);
        System.out.println();

        //Iterando lista
        for(int i = 0; i < jogos.size();i++){
            System.out.println(jogos.get(i));
        }

        System.out.println();

        for(String jogo : jogos){
            System.out.println(jogo);
        }

        System.out.println();

        jogos.forEach(e -> System.out.println(e));


        //Wrappers
        //int -> Integer
        //float -> Float
        //boolean -> Boolean

        List<Integer> listaInteiros = new ArrayList();

        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(131);

        listaInteiros.remove(Integer.valueOf(131)); //Removendo valor especifico

        //Lista de pessoas
        List<Pessoa> listaPessoa = new ArrayList();

        listaPessoa.add(new Pessoa(12));
        Pessoa p1 = new Pessoa(23);
        listaPessoa.add(new Pessoa(45));
        listaPessoa.add(p1);

        System.out.println();
        listaPessoa.forEach(e -> {
            System.out.println("Endereço: " + e);
            System.out.println("Idade: " + e.getIdade());
        });

        Collections.sort(jogos);
        Collections.sort(listaInteiros,Collections.reverseOrder());//Ao contrario
        Collections.sort(listaPessoa);

        listaInteiros.forEach(e -> System.out.println(e));
        jogos.forEach(e -> System.out.println(e));
        listaPessoa.forEach(e -> System.out.println(e.getIdade()));

    }
}
