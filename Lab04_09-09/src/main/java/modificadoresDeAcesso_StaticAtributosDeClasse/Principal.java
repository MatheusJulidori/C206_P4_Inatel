package modificadoresDeAcesso_StaticAtributosDeClasse;

public class Principal {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Genivaldo");
        Funcionario f2 = new Funcionario("Jao");
        Funcionario f3 = new Funcionario("Matheus");


        f1.mostraInfo();
        f2.mostraInfo();
        f3.mostraInfo();
        System.out.println("Numero de funcionarios: " + Funcionario.getCont());
    }
    
}
