package br.inatel.cdg;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void write(Funcionario f){
        OutputStream os = null; //Converte caracter em byte
        OutputStreamWriter osw = null; //Pega a string e separa caracter
        BufferedWriter bw = null; //Escrever no arquivo

        try{

            os = new FileOutputStream("saida.txt", true);//True para dar append e n sobrescrever
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Funcionario\n");
            bw.write(f.nome + "\n");
            bw.write(f.idade + "\n");
            bw.write(f.cpf + "\n");

        }catch (Exception e){

            System.out.println(e.getMessage());

        }finally {

            try {
                bw.close(); // Fechar o Buffer pra n pegar lixo;
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }

    public ArrayList<Funcionario> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;
        ArrayList<Funcionario> acheiNoArquivo = new ArrayList<>();

        try {

            is = new FileInputStream("saida.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.equals("Funcionario")){
                    String nome = br.readLine();
                    int idade = Integer.parseInt(br.readLine());
                    String cpf = br.readLine();
                    Funcionario aux = new Funcionario(idade,nome,cpf);
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        }
        finally {

            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return acheiNoArquivo;
    }


}
