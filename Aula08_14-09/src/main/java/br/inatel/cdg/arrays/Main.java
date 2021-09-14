package br.inatel.cdg.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //------------------------ARRAY UNIDIMENSIONAL--------------------------------------------

        //Endereço de um vetor/array -> (tipo)@(endereço)
        //Exemplo -> para um tipo int I@endereço

        float[] vetorfloat = {34f,67f,89f};

        System.out.println(vetorfloat);

        int[] vetorInteiros = new int[3];
        vetorInteiros[0] = 29;
        vetorInteiros[1] = 39;
        vetorInteiros[2] = 49;

        System.out.println(vetorInteiros);



        String[] arrayString = new String[3];
        arrayString[0] = "Wendisley";
        arrayString[1] = "Vladiscleidson";
        arrayString[2] = "Cleidson";

        System.out.println(arrayString);

        //for tradicional
        for(int i = 0;i<arrayString.length;i++){
            System.out.println(arrayString[i]);
            if(arrayString[i].equals("Vladiscleidson")){
                System.out.println("Vladiscleidson está na posição " + i);
            }
        }





        Pessoa[] arrayPessoa = new Pessoa[3];
        arrayPessoa[0] = new Pessoa("Wendisley",24);
        Pessoa p1 = new Pessoa("Vladiscleidson",42);
        arrayPessoa[1] = p1;
        arrayPessoa[2] = new Pessoa("José Cleidson",31);

        System.out.println(arrayPessoa);


        //For each
        for (Pessoa pessoa : arrayPessoa) {
            System.out.println(pessoa);
            pessoa.getInfo();
        }



        //------------------------ARRAY MULTIDIMENSIONAL--------------------------------------------


        arrayPessoa[1].setSingleEndereco(new Endereco("Rua a",6));
        Endereco[] enderecos = {new Endereco("Rua a",6),new Endereco("Rua b",7),new Endereco("Rua c",8)};
        arrayPessoa[2].setEnderecos(enderecos);
        arrayPessoa[0].setSingleEnderecoPosicao(new Endereco("Rua b",8),0);

        for(Pessoa pessoa: arrayPessoa){
            System.out.println("Pessoa");
            pessoa.printAddresses();
        }

        arrayPessoa[2].setSingleEndereco(new Endereco("Rua a",6));

    }

}
