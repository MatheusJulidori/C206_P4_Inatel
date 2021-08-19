package composicao;

public class Empresa {

    String nome;
    Departamento departamento;

    public Empresa(){
        departamento = new Departamento();
    }


    void imprimirNome(){
        System.out.println("Nome da empresa: "+this.nome);
    }

}
