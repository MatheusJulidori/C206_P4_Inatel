package br.inatel.cdg.arrays;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco enderecos[];

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new Endereco[3];
    }

    public void setSingleEndereco(Endereco endereco){
        for(int i = 0;i<this.enderecos.length;i++){
            if(enderecos[i] == null){
                enderecos[i] = endereco;
                break;
            }
        }
        System.out.println("Todos os endereços ja foram utilizados");
    }

    public void setSingleEnderecoPosicao(Endereco endereco,int i){
        this.enderecos[i] = endereco;
    }

    //getter e setter
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void getInfo(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public void printAddresses(){
        for(Endereco endereco : this.enderecos){
            if(endereco != null)
                System.out.println(endereco.getRua() + " " + endereco.getNumero());
        }
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }
}
