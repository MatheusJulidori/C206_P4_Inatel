package modificadoresDeAcesso_StaticAtributosDeClasse;

//default: Classes do mesmo pacote e subpacote(pacote dentro de outro pacote)
//public(+): Qualquer lugar do codigo
//private(-): Somente dentro da classe
//protected(#): Classes do mesmo pacote
public class Funcionario {

    private String nome;
    private final int id;//Final = const, nao ira alterar o valor depois de criado
    private static int cont;//Caracteriza a classe, e nao um objeto em especifico

    //Metodos estaticos(por exemplo da classe Math) sao muito usados emm classes utilitarias e abstratas, onde nao faz
    //sentido instanciar um objeto a parte para fazer a acao, por exemplo calcular raiz quadrada.

    Funcionario(String nome){
        cont++;
        this.id = cont;
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public static int getCont(){
        return Funcionario.cont;
    }
}
